import kotlinx.cinterop.*
import stdio.*

fun <T : CPointed> CPointer<T>.isNull() = this.rawValue.toLong() == 0L

fun main(args: Array<String>) {
	val fp = fopen("logo.png", "wb")
	if (fp == null || fp.isNull()) {
		println("Unable to open the file")
		return
	}
	println("File open")
	fclose(fp)
	println("File closed")
}
