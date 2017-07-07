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
		rowBuffer.plus(3 * x + 0)!!.reinterpret<ShortVar>()[0] = color.r.toShort()
		rowBuffer.plus(3 * x + 1)!!.reinterpret<ShortVar>()[0] = color.g.toShort()
		rowBuffer.plus(3 * x + 2)!!.reinterpret<ShortVar>()[0] = color.b.toShort()
	} catch (e: Exception) {
		e.printStackTrace()
		exit(1)
	}
}

data class Point(val x: Float, val y: Float) {
	fun distance(other: Point) = sqrt(pow((x - other.x).toDouble(), 2.0) + pow((y - other.y).toDouble(), 2.0))
}

data class ColorSource(val point: Point, val color: Color)

class Band(val colorSources: List<ColorSource>) {
	fun color(point: Point) : Color {
		val invDistances = colorSources.map { 1.0f/it.point.distance(point)}
		val sumInvDistances = invDistances.sum()
		var r : Double = 0.0
		var g : Double = 0.0
		var b : Double = 0.0
		colorSources.forEachIndexed { i, colorSource ->
			r += colorSource.color.r * (invDistances[i]/sumInvDistances)
			g += colorSource.color.g * (invDistances[i]/sumInvDistances)
			b += colorSource.color.b * (invDistances[i]/sumInvDistances)
		}
		return Color(r.toInt(), g.toInt(), b.toInt())
	}
}

val TOP_BAND = Band(listOf(
		ColorSource(Point(0.0f, 0.0f), Color(24, 141, 215)),
		ColorSource(Point(0.5f, 0.0f), Color(128, 110, 227)),
		ColorSource(Point(0.0f, 0.5f), Color(0, 149, 213))))

val MIDDLE_BAND = Band(listOf(
		ColorSource(Point(0.5f, 0.0f), Color(248, 137, 9)),
		ColorSource(Point(0.5f, 1.0f), Color(248, 137, 9)),
		ColorSource(Point(0.0f, 0.5f), Color(215, 103, 128)),
		ColorSource(Point(0.0f, 1.0f), Color(199, 87, 188))))

val LOWER_BAND = Band(listOf(
		ColorSource(Point(0.5f, 0.5f), Color(128, 110, 227)),
		ColorSource(Point(0.0f, 1.0f), Color(0, 149, 213)),
		ColorSource(Point(1.0f, 1.0f), Color(128, 110, 227))))

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
			val band = when {
				topBand -> TOP_BAND
				middleBand -> MIDDLE_BAND
				lowerBand -> LOWER_BAND
				else -> null
			}
			val color = band?.color(Point(xProp, yProp)) ?: WHITE
			setRGB(rowBuffer, y, x, color)
		}
		png_write_row(png_ptr, rowBuffer)
	}

	png_write_end(png_ptr, null)

	fclose(fp)
	println("Logo of size $width x $height generated in $filename")
}

val MAX_SIZE = 2000

fun main(args: Array<String>) {
	if (args.size != 2) {
		println("2 arguments expected, while we received ${args.size}")
		return
	}
	val width = args[0].toIntOrNull()
	val height = args[1].toIntOrNull()
	if (width != null && height != null && width in 1..MAX_SIZE && height in 1..MAX_SIZE) {
		draw_logo(width, height, "logo_${width}x$height.png")
	} else {
		println("Please specify positive dimensions equal or lower than $MAX_SIZE")
		return
	}
}
