import kotlinx.cinterop.*
import png.*

val PNG_LIBPNG_VER_STRING = "1.6.29"
val PNG_INTERLACE_NONE = 0
val PNG_COMPRESSION_TYPE_BASE = 0
val PNG_FILTER_TYPE_BASE = 0

data class Color(val r: Int, val g: Int, val b: Int)

val ORANGE = Color(244, 133, 25)
val BLUE = Color(39, 137, 217)
val WHITE = Color(255, 255, 255)

fun setRGB(rowBuffer: CPointer<ByteVar>, y: Int, x: Int, color: Color) {
	try {
		rowBuffer.plus(3 * x + 0)!!.reinterpret<IntVar>()[0] = color.r
		rowBuffer.plus(3 * x + 1)!!.reinterpret<IntVar>()[0] = color.g
		rowBuffer.plus(3 * x + 2)!!.reinterpret<IntVar>()[0] = color.b
	} catch (e: Exception) {
		e.printStackTrace()
		exit(1)
	}
}

fun draw_logo(width: Int, height: Int, filename: String) {
	val fp = fopen(filename, "wb")
	if (fp == null) {
		println("Unable to open the file")
		return
	}

	val png_ptr = png_create_write_struct(PNG_LIBPNG_VER_STRING, null, null, null)
	if (png_ptr == null) {
		println("Unable to create the png (png_create_write_struct failure)")
		return
	}

	val info_ptr = png_create_info_struct(png_ptr)
	if (info_ptr == null) {
		println("Unable to create the png (png_create_info_struct failure")
		return
	}

	png_init_io(png_ptr as CPointer<png_struct>, fp)

	val bit_depth = 8
	val color_type = PNG_COLOR_TYPE_RGB

	png_set_IHDR(png_ptr, info_ptr, width, height,
			bit_depth, color_type, PNG_INTERLACE_NONE,
			PNG_COMPRESSION_TYPE_BASE, PNG_FILTER_TYPE_BASE)

	png_write_info(png_ptr, info_ptr)

	val rowBuffer = nativeHeap.allocArray<ByteVar>(3 * width + 3)
	for (y in 0..(height-1)) {
		val yProp = (y+1).toFloat()/height
		for (x in 0..(width-1)) {
			val xProp = (x+1).toFloat()/width
			val topBand = yProp <= 0.5 && xProp <= (0.5 - yProp)
			val middleBand = !topBand && xProp <= (1.0 - yProp)
			val lowerBand = yProp >= 0.5 && ((xProp <= 0.5 && xProp>= (1.0-yProp)) || (xProp>=0.5 && xProp <= yProp))
			if (topBand || lowerBand) {
				setRGB(rowBuffer, y, x, BLUE)
			} else if (middleBand) {
				setRGB(rowBuffer, y, x, ORANGE)
			} else {
				setRGB(rowBuffer, y, x, WHITE)
			}
		}
		png_write_row(png_ptr, rowBuffer)
	}

	png_write_end(png_ptr, null)

	fclose(fp)
	println("Logo of size $width x $height generated in $filename")
}

fun main(args: Array<String>) {
	draw_logo(500, 500, "logo.png")
}
