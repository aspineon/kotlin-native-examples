@file:Suppress("UNUSED_EXPRESSION", "UNUSED_VARIABLE")
package png

import konan.SymbolName
import kotlinx.cinterop.*

fun renameat(arg0: Int, arg1: String?, arg2: Int, arg3: String?): Int {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val _arg3 = arg3?.cstr?.getPointer(memScope).rawValue
        val res = kni_renameat(_arg0, _arg1, _arg2, _arg3)
        res
    }
}

@SymbolName("png_kni_renameat")
private external fun kni_renameat(arg0: Int, arg1: NativePtr, arg2: Int, arg3: NativePtr): Int

fun renamex_np(arg0: String?, arg1: String?, arg2: Int): Int {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_renamex_np(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("png_kni_renamex_np")
private external fun kni_renamex_np(arg0: NativePtr, arg1: NativePtr, arg2: Int): Int

fun renameatx_np(arg0: Int, arg1: String?, arg2: Int, arg3: String?, arg4: Int): Int {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val _arg3 = arg3?.cstr?.getPointer(memScope).rawValue
        val _arg4 = arg4
        val res = kni_renameatx_np(_arg0, _arg1, _arg2, _arg3, _arg4)
        res
    }
}

@SymbolName("png_kni_renameatx_np")
private external fun kni_renameatx_np(arg0: Int, arg1: NativePtr, arg2: Int, arg3: NativePtr, arg4: Int): Int

fun clearerr(arg0: CValuesRef<FILE>?): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_clearerr(_arg0)
        res
    }
}

@SymbolName("png_kni_clearerr")
private external fun kni_clearerr(arg0: NativePtr): Unit

fun fclose(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_fclose(_arg0)
        res
    }
}

@SymbolName("png_kni_fclose")
private external fun kni_fclose(arg0: NativePtr): Int

fun feof(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_feof(_arg0)
        res
    }
}

@SymbolName("png_kni_feof")
private external fun kni_feof(arg0: NativePtr): Int

fun ferror(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_ferror(_arg0)
        res
    }
}

@SymbolName("png_kni_ferror")
private external fun kni_ferror(arg0: NativePtr): Int

fun fflush(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_fflush(_arg0)
        res
    }
}

@SymbolName("png_kni_fflush")
private external fun kni_fflush(arg0: NativePtr): Int

fun fgetc(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_fgetc(_arg0)
        res
    }
}

@SymbolName("png_kni_fgetc")
private external fun kni_fgetc(arg0: NativePtr): Int

fun fgetpos(arg0: CValuesRef<FILE>?, arg1: CValuesRef<fpos_tVar>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_fgetpos(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_fgetpos")
private external fun kni_fgetpos(arg0: NativePtr, arg1: NativePtr): Int

fun fgets(arg0: CValuesRef<ByteVar>?, arg1: Int, arg2: CValuesRef<FILE>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val _arg2 = arg2?.getPointer(memScope).rawValue
        val res = kni_fgets(_arg0, _arg1, _arg2)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_fgets")
private external fun kni_fgets(arg0: NativePtr, arg1: Int, arg2: NativePtr): NativePtr

fun fopen(__filename: String?, __mode: String?): CPointer<FILE>? {
    return memScoped {
        val ___filename = __filename?.cstr?.getPointer(memScope).rawValue
        val ___mode = __mode?.cstr?.getPointer(memScope).rawValue
        val res = kni_fopen(___filename, ___mode)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("png_kni_fopen")
private external fun kni_fopen(__filename: NativePtr, __mode: NativePtr): NativePtr

fun fprintf(arg0: CValuesRef<FILE>?, arg1: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_fprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0, arg1), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_fprintf")
private external fun kni_fprintf(): NativePtr

fun fputc(arg0: Int, arg1: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_fputc(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_fputc")
private external fun kni_fputc(arg0: Int, arg1: NativePtr): Int

fun fputs(arg0: String?, arg1: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_fputs(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_fputs")
private external fun kni_fputs(arg0: NativePtr, arg1: NativePtr): Int

fun fread(__ptr: COpaquePointer?, __size: size_t, __nitems: size_t, __stream: CValuesRef<FILE>?): size_t {
    return memScoped {
        val ___ptr = __ptr.rawValue
        val ___size = __size
        val ___nitems = __nitems
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fread(___ptr, ___size, ___nitems, ___stream)
        res
    }
}

@SymbolName("png_kni_fread")
private external fun kni_fread(__ptr: NativePtr, __size: Long, __nitems: Long, __stream: NativePtr): Long

fun freopen(arg0: String?, arg1: String?, arg2: CValuesRef<FILE>?): CPointer<FILE>? {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val _arg2 = arg2?.getPointer(memScope).rawValue
        val res = kni_freopen(_arg0, _arg1, _arg2)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("png_kni_freopen")
private external fun kni_freopen(arg0: NativePtr, arg1: NativePtr, arg2: NativePtr): NativePtr

fun fscanf(arg0: CValuesRef<FILE>?, arg1: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_fscanf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0, arg1), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_fscanf")
private external fun kni_fscanf(): NativePtr

fun fseek(arg0: CValuesRef<FILE>?, arg1: Long, arg2: Int): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val _arg2 = arg2
        val res = kni_fseek(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("png_kni_fseek")
private external fun kni_fseek(arg0: NativePtr, arg1: Long, arg2: Int): Int

fun fsetpos(arg0: CValuesRef<FILE>?, arg1: CValuesRef<fpos_tVar>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_fsetpos(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_fsetpos")
private external fun kni_fsetpos(arg0: NativePtr, arg1: NativePtr): Int

fun ftell(arg0: CValuesRef<FILE>?): Long {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_ftell(_arg0)
        res
    }
}

@SymbolName("png_kni_ftell")
private external fun kni_ftell(arg0: NativePtr): Long

fun fwrite(__ptr: COpaquePointer?, __size: size_t, __nitems: size_t, __stream: CValuesRef<FILE>?): size_t {
    return memScoped {
        val ___ptr = __ptr.rawValue
        val ___size = __size
        val ___nitems = __nitems
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_fwrite(___ptr, ___size, ___nitems, ___stream)
        res
    }
}

@SymbolName("png_kni_fwrite")
private external fun kni_fwrite(__ptr: NativePtr, __size: Long, __nitems: Long, __stream: NativePtr): Long

fun getc(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_getc(_arg0)
        res
    }
}

@SymbolName("png_kni_getc")
private external fun kni_getc(arg0: NativePtr): Int

fun getchar(): Int {
    val res = kni_getchar()
    return res
}

@SymbolName("png_kni_getchar")
private external fun kni_getchar(): Int

fun gets(arg0: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_gets(_arg0)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_gets")
private external fun kni_gets(arg0: NativePtr): NativePtr

fun perror(arg0: String?): Unit {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val res = kni_perror(_arg0)
        res
    }
}

@SymbolName("png_kni_perror")
private external fun kni_perror(arg0: NativePtr): Unit

fun printf(arg0: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_printf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_printf")
private external fun kni_printf(): NativePtr

fun putc(arg0: Int, arg1: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_putc(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_putc")
private external fun kni_putc(arg0: Int, arg1: NativePtr): Int

fun putchar(arg0: Int): Int {
    val _arg0 = arg0
    val res = kni_putchar(_arg0)
    return res
}

@SymbolName("png_kni_putchar")
private external fun kni_putchar(arg0: Int): Int

fun puts(arg0: String?): Int {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val res = kni_puts(_arg0)
        res
    }
}

@SymbolName("png_kni_puts")
private external fun kni_puts(arg0: NativePtr): Int

fun remove(arg0: String?): Int {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val res = kni_remove(_arg0)
        res
    }
}

@SymbolName("png_kni_remove")
private external fun kni_remove(arg0: NativePtr): Int

fun rename(__old: String?, __new: String?): Int {
    return memScoped {
        val ___old = __old?.cstr?.getPointer(memScope).rawValue
        val ___new = __new?.cstr?.getPointer(memScope).rawValue
        val res = kni_rename(___old, ___new)
        res
    }
}

@SymbolName("png_kni_rename")
private external fun kni_rename(__old: NativePtr, __new: NativePtr): Int

fun rewind(arg0: CValuesRef<FILE>?): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_rewind(_arg0)
        res
    }
}

@SymbolName("png_kni_rewind")
private external fun kni_rewind(arg0: NativePtr): Unit

fun scanf(arg0: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_scanf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_scanf")
private external fun kni_scanf(): NativePtr

fun setbuf(arg0: CValuesRef<FILE>?, arg1: CValuesRef<ByteVar>?): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_setbuf(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_setbuf")
private external fun kni_setbuf(arg0: NativePtr, arg1: NativePtr): Unit

fun setvbuf(arg0: CValuesRef<FILE>?, arg1: CValuesRef<ByteVar>?, arg2: Int, arg3: size_t): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val _arg3 = arg3
        val res = kni_setvbuf(_arg0, _arg1, _arg2, _arg3)
        res
    }
}

@SymbolName("png_kni_setvbuf")
private external fun kni_setvbuf(arg0: NativePtr, arg1: NativePtr, arg2: Int, arg3: Long): Int

fun sprintf(arg0: CValuesRef<ByteVar>?, arg1: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_sprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0, arg1), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_sprintf")
private external fun kni_sprintf(): NativePtr

fun sscanf(arg0: String?, arg1: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_sscanf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0, arg1), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_sscanf")
private external fun kni_sscanf(): NativePtr

fun tmpfile(): CPointer<FILE>? {
    val res = kni_tmpfile()
    return interpretCPointer<FILE>(res)
}

@SymbolName("png_kni_tmpfile")
private external fun kni_tmpfile(): NativePtr

fun tmpnam(arg0: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_tmpnam(_arg0)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_tmpnam")
private external fun kni_tmpnam(arg0: NativePtr): NativePtr

fun ungetc(arg0: Int, arg1: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_ungetc(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_ungetc")
private external fun kni_ungetc(arg0: Int, arg1: NativePtr): Int

fun ctermid(arg0: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_ctermid(_arg0)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_ctermid")
private external fun kni_ctermid(arg0: NativePtr): NativePtr

fun fdopen(arg0: Int, arg1: String?): CPointer<FILE>? {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val res = kni_fdopen(_arg0, _arg1)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("png_kni_fdopen")
private external fun kni_fdopen(arg0: Int, arg1: NativePtr): NativePtr

fun fileno(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_fileno(_arg0)
        res
    }
}

@SymbolName("png_kni_fileno")
private external fun kni_fileno(arg0: NativePtr): Int

fun pclose(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_pclose(_arg0)
        res
    }
}

@SymbolName("png_kni_pclose")
private external fun kni_pclose(arg0: NativePtr): Int

fun popen(arg0: String?, arg1: String?): CPointer<FILE>? {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val res = kni_popen(_arg0, _arg1)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("png_kni_popen")
private external fun kni_popen(arg0: NativePtr, arg1: NativePtr): NativePtr

fun __srget(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni___srget(_arg0)
        res
    }
}

@SymbolName("png_kni___srget")
private external fun kni___srget(arg0: NativePtr): Int

fun __swbuf(arg0: Int, arg1: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni___swbuf(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni___swbuf")
private external fun kni___swbuf(arg0: Int, arg1: NativePtr): Int

fun __sputc(_c: Int, _p: CValuesRef<FILE>?): Int {
    return memScoped {
        val __c = _c
        val __p = _p?.getPointer(memScope).rawValue
        val res = kni___sputc(__c, __p)
        res
    }
}

@SymbolName("png_kni___sputc")
private external fun kni___sputc(_c: Int, _p: NativePtr): Int

fun flockfile(arg0: CValuesRef<FILE>?): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_flockfile(_arg0)
        res
    }
}

@SymbolName("png_kni_flockfile")
private external fun kni_flockfile(arg0: NativePtr): Unit

fun ftrylockfile(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_ftrylockfile(_arg0)
        res
    }
}

@SymbolName("png_kni_ftrylockfile")
private external fun kni_ftrylockfile(arg0: NativePtr): Int

fun funlockfile(arg0: CValuesRef<FILE>?): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_funlockfile(_arg0)
        res
    }
}

@SymbolName("png_kni_funlockfile")
private external fun kni_funlockfile(arg0: NativePtr): Unit

fun getc_unlocked(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_getc_unlocked(_arg0)
        res
    }
}

@SymbolName("png_kni_getc_unlocked")
private external fun kni_getc_unlocked(arg0: NativePtr): Int

fun getchar_unlocked(): Int {
    val res = kni_getchar_unlocked()
    return res
}

@SymbolName("png_kni_getchar_unlocked")
private external fun kni_getchar_unlocked(): Int

fun putc_unlocked(arg0: Int, arg1: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_putc_unlocked(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_putc_unlocked")
private external fun kni_putc_unlocked(arg0: Int, arg1: NativePtr): Int

fun putchar_unlocked(arg0: Int): Int {
    val _arg0 = arg0
    val res = kni_putchar_unlocked(_arg0)
    return res
}

@SymbolName("png_kni_putchar_unlocked")
private external fun kni_putchar_unlocked(arg0: Int): Int

fun getw(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_getw(_arg0)
        res
    }
}

@SymbolName("png_kni_getw")
private external fun kni_getw(arg0: NativePtr): Int

fun putw(arg0: Int, arg1: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_putw(_arg0, _arg1)
        res
    }
}

@SymbolName("png_kni_putw")
private external fun kni_putw(arg0: Int, arg1: NativePtr): Int

fun tempnam(__dir: String?, __prefix: String?): CPointer<ByteVar>? {
    return memScoped {
        val ___dir = __dir?.cstr?.getPointer(memScope).rawValue
        val ___prefix = __prefix?.cstr?.getPointer(memScope).rawValue
        val res = kni_tempnam(___dir, ___prefix)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_tempnam")
private external fun kni_tempnam(__dir: NativePtr, __prefix: NativePtr): NativePtr

fun fseeko(__stream: CValuesRef<FILE>?, __offset: off_t, __whence: Int): Int {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val ___offset = __offset
        val ___whence = __whence
        val res = kni_fseeko(___stream, ___offset, ___whence)
        res
    }
}

@SymbolName("png_kni_fseeko")
private external fun kni_fseeko(__stream: NativePtr, __offset: Long, __whence: Int): Int

fun ftello(__stream: CValuesRef<FILE>?): off_t {
    return memScoped {
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_ftello(___stream)
        res
    }
}

@SymbolName("png_kni_ftello")
private external fun kni_ftello(__stream: NativePtr): Long

fun snprintf(__str: CValuesRef<ByteVar>?, __size: size_t, __format: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_snprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(__str, __size, __format), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_snprintf")
private external fun kni_snprintf(): NativePtr

fun dprintf(arg0: Int, arg1: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_dprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0, arg1), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_dprintf")
private external fun kni_dprintf(): NativePtr

fun getdelim(__linep: CValuesRef<CPointerVar<ByteVar>>?, __linecapp: CValuesRef<size_tVar>?, __delimiter: Int, __stream: CValuesRef<FILE>?): ssize_t {
    return memScoped {
        val ___linep = __linep?.getPointer(memScope).rawValue
        val ___linecapp = __linecapp?.getPointer(memScope).rawValue
        val ___delimiter = __delimiter
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_getdelim(___linep, ___linecapp, ___delimiter, ___stream)
        res
    }
}

@SymbolName("png_kni_getdelim")
private external fun kni_getdelim(__linep: NativePtr, __linecapp: NativePtr, __delimiter: Int, __stream: NativePtr): Long

fun getline(__linep: CValuesRef<CPointerVar<ByteVar>>?, __linecapp: CValuesRef<size_tVar>?, __stream: CValuesRef<FILE>?): ssize_t {
    return memScoped {
        val ___linep = __linep?.getPointer(memScope).rawValue
        val ___linecapp = __linecapp?.getPointer(memScope).rawValue
        val ___stream = __stream?.getPointer(memScope).rawValue
        val res = kni_getline(___linep, ___linecapp, ___stream)
        res
    }
}

@SymbolName("png_kni_getline")
private external fun kni_getline(__linep: NativePtr, __linecapp: NativePtr, __stream: NativePtr): Long

fun asprintf(arg0: CValuesRef<CPointerVar<ByteVar>>?, arg1: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni_asprintf(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0, arg1), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni_asprintf")
private external fun kni_asprintf(): NativePtr

fun ctermid_r(arg0: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_ctermid_r(_arg0)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_ctermid_r")
private external fun kni_ctermid_r(arg0: NativePtr): NativePtr

fun fgetln(arg0: CValuesRef<FILE>?, arg1: CValuesRef<size_tVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_fgetln(_arg0, _arg1)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_fgetln")
private external fun kni_fgetln(arg0: NativePtr, arg1: NativePtr): NativePtr

fun fmtcheck(arg0: String?, arg1: String?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val res = kni_fmtcheck(_arg0, _arg1)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_fmtcheck")
private external fun kni_fmtcheck(arg0: NativePtr, arg1: NativePtr): NativePtr

fun fpurge(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_fpurge(_arg0)
        res
    }
}

@SymbolName("png_kni_fpurge")
private external fun kni_fpurge(arg0: NativePtr): Int

fun setbuffer(arg0: CValuesRef<FILE>?, arg1: CValuesRef<ByteVar>?, arg2: Int): Unit {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_setbuffer(_arg0, _arg1, _arg2)
        res
    }
}

@SymbolName("png_kni_setbuffer")
private external fun kni_setbuffer(arg0: NativePtr, arg1: NativePtr, arg2: Int): Unit

fun setlinebuf(arg0: CValuesRef<FILE>?): Int {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_setlinebuf(_arg0)
        res
    }
}

@SymbolName("png_kni_setlinebuf")
private external fun kni_setlinebuf(arg0: NativePtr): Int

fun zopen(arg0: String?, arg1: String?, arg2: Int): CPointer<FILE>? {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val _arg2 = arg2
        val res = kni_zopen(_arg0, _arg1, _arg2)
        interpretCPointer<FILE>(res)
    }
}

@SymbolName("png_kni_zopen")
private external fun kni_zopen(arg0: NativePtr, arg1: NativePtr, arg2: Int): NativePtr

fun funopen(arg0: COpaquePointer?, arg1: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Int>>?, arg2: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Int>>?, arg3: CPointer<CFunction<(COpaquePointer?, fpos_t, Int) -> fpos_t>>?, arg4: CPointer<CFunction<(COpaquePointer?) -> Int>>?): CPointer<FILE>? {
    val _arg0 = arg0.rawValue
    val _arg1 = arg1.rawValue
    val _arg2 = arg2.rawValue
    val _arg3 = arg3.rawValue
    val _arg4 = arg4.rawValue
    val res = kni_funopen(_arg0, _arg1, _arg2, _arg3, _arg4)
    return interpretCPointer<FILE>(res)
}

@SymbolName("png_kni_funopen")
private external fun kni_funopen(arg0: NativePtr, arg1: NativePtr, arg2: NativePtr, arg3: NativePtr, arg4: NativePtr): NativePtr

fun __sprintf_chk(arg0: CValuesRef<ByteVar>?, arg1: Int, arg2: size_t, arg3: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni___sprintf_chk(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0, arg1, arg2, arg3), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni___sprintf_chk")
private external fun kni___sprintf_chk(): NativePtr

fun __snprintf_chk(arg0: CValuesRef<ByteVar>?, arg1: size_t, arg2: Int, arg3: size_t, arg4: String?, vararg variadicArguments: Any?): Int = memScoped {
    val resultVar = allocFfiReturnValueBuffer<IntVar>(typeOf<IntVar>())
    callWithVarargs(kni___snprintf_chk(), resultVar.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0, arg1, arg2, arg3, arg4), variadicArguments, memScope)
    resultVar.value
}

@SymbolName("png_kni___snprintf_chk")
private external fun kni___snprintf_chk(): NativePtr

fun setjmp(arg0: jmp_buf?): Int {
    val _arg0 = arg0.rawValue
    val res = kni_setjmp(_arg0)
    return res
}

@SymbolName("png_kni_setjmp")
private external fun kni_setjmp(arg0: NativePtr): Int

fun longjmp(arg0: jmp_buf?, arg1: Int): Unit {
    val _arg0 = arg0.rawValue
    val _arg1 = arg1
    val res = kni_longjmp(_arg0, _arg1)
    return res
}

@SymbolName("png_kni_longjmp")
private external fun kni_longjmp(arg0: NativePtr, arg1: Int): Unit

fun _setjmp(arg0: jmp_buf?): Int {
    val _arg0 = arg0.rawValue
    val res = kni__setjmp(_arg0)
    return res
}

@SymbolName("png_kni__setjmp")
private external fun kni__setjmp(arg0: NativePtr): Int

fun _longjmp(arg0: jmp_buf?, arg1: Int): Unit {
    val _arg0 = arg0.rawValue
    val _arg1 = arg1
    val res = kni__longjmp(_arg0, _arg1)
    return res
}

@SymbolName("png_kni__longjmp")
private external fun kni__longjmp(arg0: NativePtr, arg1: Int): Unit

fun sigsetjmp(arg0: sigjmp_buf?, arg1: Int): Int {
    val _arg0 = arg0.rawValue
    val _arg1 = arg1
    val res = kni_sigsetjmp(_arg0, _arg1)
    return res
}

@SymbolName("png_kni_sigsetjmp")
private external fun kni_sigsetjmp(arg0: NativePtr, arg1: Int): Int

fun siglongjmp(arg0: sigjmp_buf?, arg1: Int): Unit {
    val _arg0 = arg0.rawValue
    val _arg1 = arg1
    val res = kni_siglongjmp(_arg0, _arg1)
    return res
}

@SymbolName("png_kni_siglongjmp")
private external fun kni_siglongjmp(arg0: NativePtr, arg1: Int): Unit

fun longjmperror(): Unit {
    val res = kni_longjmperror()
    return res
}

@SymbolName("png_kni_longjmperror")
private external fun kni_longjmperror(): Unit

fun asctime(arg0: CValuesRef<tm>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_asctime(_arg0)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_asctime")
private external fun kni_asctime(arg0: NativePtr): NativePtr

fun clock(): clock_t {
    val res = kni_clock()
    return res
}

@SymbolName("png_kni_clock")
private external fun kni_clock(): Long

fun ctime(arg0: CValuesRef<time_tVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_ctime(_arg0)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_ctime")
private external fun kni_ctime(arg0: NativePtr): NativePtr

fun difftime(arg0: time_t, arg1: time_t): Double {
    val _arg0 = arg0
    val _arg1 = arg1
    val res = kni_difftime(_arg0, _arg1)
    return res
}

@SymbolName("png_kni_difftime")
private external fun kni_difftime(arg0: Long, arg1: Long): Double

fun getdate(arg0: String?): CPointer<tm>? {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val res = kni_getdate(_arg0)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("png_kni_getdate")
private external fun kni_getdate(arg0: NativePtr): NativePtr

fun gmtime(arg0: CValuesRef<time_tVar>?): CPointer<tm>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_gmtime(_arg0)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("png_kni_gmtime")
private external fun kni_gmtime(arg0: NativePtr): NativePtr

fun localtime(arg0: CValuesRef<time_tVar>?): CPointer<tm>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_localtime(_arg0)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("png_kni_localtime")
private external fun kni_localtime(arg0: NativePtr): NativePtr

fun mktime(arg0: CValuesRef<tm>?): time_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_mktime(_arg0)
        res
    }
}

@SymbolName("png_kni_mktime")
private external fun kni_mktime(arg0: NativePtr): Long

fun strftime(arg0: CValuesRef<ByteVar>?, arg1: size_t, arg2: String?, arg3: CValuesRef<tm>?): size_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val _arg2 = arg2?.cstr?.getPointer(memScope).rawValue
        val _arg3 = arg3?.getPointer(memScope).rawValue
        val res = kni_strftime(_arg0, _arg1, _arg2, _arg3)
        res
    }
}

@SymbolName("png_kni_strftime")
private external fun kni_strftime(arg0: NativePtr, arg1: Long, arg2: NativePtr, arg3: NativePtr): Long

fun strptime(arg0: String?, arg1: String?, arg2: CValuesRef<tm>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.cstr?.getPointer(memScope).rawValue
        val _arg1 = arg1?.cstr?.getPointer(memScope).rawValue
        val _arg2 = arg2?.getPointer(memScope).rawValue
        val res = kni_strptime(_arg0, _arg1, _arg2)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_strptime")
private external fun kni_strptime(arg0: NativePtr, arg1: NativePtr, arg2: NativePtr): NativePtr

fun time(arg0: CValuesRef<time_tVar>?): time_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_time(_arg0)
        res
    }
}

@SymbolName("png_kni_time")
private external fun kni_time(arg0: NativePtr): Long

fun tzset(): Unit {
    val res = kni_tzset()
    return res
}

@SymbolName("png_kni_tzset")
private external fun kni_tzset(): Unit

fun asctime_r(arg0: CValuesRef<tm>?, arg1: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_asctime_r(_arg0, _arg1)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_asctime_r")
private external fun kni_asctime_r(arg0: NativePtr, arg1: NativePtr): NativePtr

fun ctime_r(arg0: CValuesRef<time_tVar>?, arg1: CValuesRef<ByteVar>?): CPointer<ByteVar>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_ctime_r(_arg0, _arg1)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("png_kni_ctime_r")
private external fun kni_ctime_r(arg0: NativePtr, arg1: NativePtr): NativePtr

fun gmtime_r(arg0: CValuesRef<time_tVar>?, arg1: CValuesRef<tm>?): CPointer<tm>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_gmtime_r(_arg0, _arg1)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("png_kni_gmtime_r")
private external fun kni_gmtime_r(arg0: NativePtr, arg1: NativePtr): NativePtr

fun localtime_r(arg0: CValuesRef<time_tVar>?, arg1: CValuesRef<tm>?): CPointer<tm>? {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val _arg1 = arg1?.getPointer(memScope).rawValue
        val res = kni_localtime_r(_arg0, _arg1)
        interpretCPointer<tm>(res)
    }
}

@SymbolName("png_kni_localtime_r")
private external fun kni_localtime_r(arg0: NativePtr, arg1: NativePtr): NativePtr

fun posix2time(arg0: time_t): time_t {
    val _arg0 = arg0
    val res = kni_posix2time(_arg0)
    return res
}

@SymbolName("png_kni_posix2time")
private external fun kni_posix2time(arg0: Long): Long

fun tzsetwall(): Unit {
    val res = kni_tzsetwall()
    return res
}

@SymbolName("png_kni_tzsetwall")
private external fun kni_tzsetwall(): Unit

fun time2posix(arg0: time_t): time_t {
    val _arg0 = arg0
    val res = kni_time2posix(_arg0)
    return res
}

@SymbolName("png_kni_time2posix")
private external fun kni_time2posix(arg0: Long): Long

fun timelocal(arg0: CValuesRef<tm>?): time_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_timelocal(_arg0)
        res
    }
}

@SymbolName("png_kni_timelocal")
private external fun kni_timelocal(arg0: NativePtr): Long

fun timegm(arg0: CValuesRef<tm>?): time_t {
    return memScoped {
        val _arg0 = arg0?.getPointer(memScope).rawValue
        val res = kni_timegm(_arg0)
        res
    }
}

@SymbolName("png_kni_timegm")
private external fun kni_timegm(arg0: NativePtr): Long

fun nanosleep(__rqtp: CValuesRef<timespec>?, __rmtp: CValuesRef<timespec>?): Int {
    return memScoped {
        val ___rqtp = __rqtp?.getPointer(memScope).rawValue
        val ___rmtp = __rmtp?.getPointer(memScope).rawValue
        val res = kni_nanosleep(___rqtp, ___rmtp)
        res
    }
}

@SymbolName("png_kni_nanosleep")
private external fun kni_nanosleep(__rqtp: NativePtr, __rmtp: NativePtr): Int

fun clock_getres(__clock_id: clockid_t, __res: CValuesRef<timespec>?): Int {
    return memScoped {
        val ___clock_id = __clock_id
        val ___res = __res?.getPointer(memScope).rawValue
        val res = kni_clock_getres(___clock_id, ___res)
        res
    }
}

@SymbolName("png_kni_clock_getres")
private external fun kni_clock_getres(__clock_id: Int, __res: NativePtr): Int

fun clock_gettime(__clock_id: clockid_t, __tp: CValuesRef<timespec>?): Int {
    return memScoped {
        val ___clock_id = __clock_id
        val ___tp = __tp?.getPointer(memScope).rawValue
        val res = kni_clock_gettime(___clock_id, ___tp)
        res
    }
}

@SymbolName("png_kni_clock_gettime")
private external fun kni_clock_gettime(__clock_id: Int, __tp: NativePtr): Int

fun clock_gettime_nsec_np(__clock_id: clockid_t): __uint64_t {
    val ___clock_id = __clock_id
    val res = kni_clock_gettime_nsec_np(___clock_id)
    return res
}

@SymbolName("png_kni_clock_gettime_nsec_np")
private external fun kni_clock_gettime_nsec_np(__clock_id: Int): Long

fun clock_settime(__clock_id: clockid_t, __tp: CValuesRef<timespec>?): Int {
    return memScoped {
        val ___clock_id = __clock_id
        val ___tp = __tp?.getPointer(memScope).rawValue
        val res = kni_clock_settime(___clock_id, ___tp)
        res
    }
}

@SymbolName("png_kni_clock_settime")
private external fun kni_clock_settime(__clock_id: Int, __tp: NativePtr): Int

fun png_access_version_number(): png_uint_32 {
    val res = kni_png_access_version_number()
    return res
}

@SymbolName("png_kni_png_access_version_number")
private external fun kni_png_access_version_number(): Int

fun png_set_sig_bytes(png_ptr: png_structrp?, num_bytes: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _num_bytes = num_bytes
    val res = kni_png_set_sig_bytes(_png_ptr, _num_bytes)
    return res
}

@SymbolName("png_kni_png_set_sig_bytes")
private external fun kni_png_set_sig_bytes(png_ptr: NativePtr, num_bytes: Int): Unit

fun png_sig_cmp(sig: png_const_bytep?, start: png_size_t, num_to_check: png_size_t): Int {
    val _sig = sig.rawValue
    val _start = start
    val _num_to_check = num_to_check
    val res = kni_png_sig_cmp(_sig, _start, _num_to_check)
    return res
}

@SymbolName("png_kni_png_sig_cmp")
private external fun kni_png_sig_cmp(sig: NativePtr, start: Long, num_to_check: Long): Int

fun png_create_read_struct(user_png_ver: String?, error_ptr: png_voidp?, error_fn: png_error_ptr?, warn_fn: png_error_ptr?): png_structp? {
    return memScoped {
        val _user_png_ver = user_png_ver?.cstr?.getPointer(memScope).rawValue
        val _error_ptr = error_ptr.rawValue
        val _error_fn = error_fn.rawValue
        val _warn_fn = warn_fn.rawValue
        val res = kni_png_create_read_struct(_user_png_ver, _error_ptr, _error_fn, _warn_fn)
        interpretCPointer<png_struct>(res)
    }
}

@SymbolName("png_kni_png_create_read_struct")
private external fun kni_png_create_read_struct(user_png_ver: NativePtr, error_ptr: NativePtr, error_fn: NativePtr, warn_fn: NativePtr): NativePtr

fun png_create_write_struct(user_png_ver: String?, error_ptr: png_voidp?, error_fn: png_error_ptr?, warn_fn: png_error_ptr?): png_structp? {
    return memScoped {
        val _user_png_ver = user_png_ver?.cstr?.getPointer(memScope).rawValue
        val _error_ptr = error_ptr.rawValue
        val _error_fn = error_fn.rawValue
        val _warn_fn = warn_fn.rawValue
        val res = kni_png_create_write_struct(_user_png_ver, _error_ptr, _error_fn, _warn_fn)
        interpretCPointer<png_struct>(res)
    }
}

@SymbolName("png_kni_png_create_write_struct")
private external fun kni_png_create_write_struct(user_png_ver: NativePtr, error_ptr: NativePtr, error_fn: NativePtr, warn_fn: NativePtr): NativePtr

fun png_get_compression_buffer_size(png_ptr: png_const_structrp?): png_size_t {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_compression_buffer_size(_png_ptr)
    return res
}

@SymbolName("png_kni_png_get_compression_buffer_size")
private external fun kni_png_get_compression_buffer_size(png_ptr: NativePtr): Long

fun png_set_compression_buffer_size(png_ptr: png_structrp?, size: png_size_t): Unit {
    val _png_ptr = png_ptr.rawValue
    val _size = size
    val res = kni_png_set_compression_buffer_size(_png_ptr, _size)
    return res
}

@SymbolName("png_kni_png_set_compression_buffer_size")
private external fun kni_png_set_compression_buffer_size(png_ptr: NativePtr, size: Long): Unit

fun png_set_longjmp_fn(png_ptr: png_structrp?, longjmp_fn: png_longjmp_ptr?, jmp_buf_size: size_t): jmp_buf? {
    val _png_ptr = png_ptr.rawValue
    val _longjmp_fn = longjmp_fn.rawValue
    val _jmp_buf_size = jmp_buf_size
    val res = kni_png_set_longjmp_fn(_png_ptr, _longjmp_fn, _jmp_buf_size)
    return interpretCPointer<IntVar>(res)
}

@SymbolName("png_kni_png_set_longjmp_fn")
private external fun kni_png_set_longjmp_fn(png_ptr: NativePtr, longjmp_fn: NativePtr, jmp_buf_size: Long): NativePtr

fun png_longjmp(png_ptr: png_const_structrp?, `val`: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _val = `val`
    val res = kni_png_longjmp(_png_ptr, _val)
    return res
}

@SymbolName("png_kni_png_longjmp")
private external fun kni_png_longjmp(png_ptr: NativePtr, `val`: Int): Unit

fun png_reset_zstream(png_ptr: png_structrp?): Int {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_reset_zstream(_png_ptr)
    return res
}

@SymbolName("png_kni_png_reset_zstream")
private external fun kni_png_reset_zstream(png_ptr: NativePtr): Int

fun png_create_read_struct_2(user_png_ver: String?, error_ptr: png_voidp?, error_fn: png_error_ptr?, warn_fn: png_error_ptr?, mem_ptr: png_voidp?, malloc_fn: png_malloc_ptr?, free_fn: png_free_ptr?): png_structp? {
    return memScoped {
        val _user_png_ver = user_png_ver?.cstr?.getPointer(memScope).rawValue
        val _error_ptr = error_ptr.rawValue
        val _error_fn = error_fn.rawValue
        val _warn_fn = warn_fn.rawValue
        val _mem_ptr = mem_ptr.rawValue
        val _malloc_fn = malloc_fn.rawValue
        val _free_fn = free_fn.rawValue
        val res = kni_png_create_read_struct_2(_user_png_ver, _error_ptr, _error_fn, _warn_fn, _mem_ptr, _malloc_fn, _free_fn)
        interpretCPointer<png_struct>(res)
    }
}

@SymbolName("png_kni_png_create_read_struct_2")
private external fun kni_png_create_read_struct_2(user_png_ver: NativePtr, error_ptr: NativePtr, error_fn: NativePtr, warn_fn: NativePtr, mem_ptr: NativePtr, malloc_fn: NativePtr, free_fn: NativePtr): NativePtr

fun png_create_write_struct_2(user_png_ver: String?, error_ptr: png_voidp?, error_fn: png_error_ptr?, warn_fn: png_error_ptr?, mem_ptr: png_voidp?, malloc_fn: png_malloc_ptr?, free_fn: png_free_ptr?): png_structp? {
    return memScoped {
        val _user_png_ver = user_png_ver?.cstr?.getPointer(memScope).rawValue
        val _error_ptr = error_ptr.rawValue
        val _error_fn = error_fn.rawValue
        val _warn_fn = warn_fn.rawValue
        val _mem_ptr = mem_ptr.rawValue
        val _malloc_fn = malloc_fn.rawValue
        val _free_fn = free_fn.rawValue
        val res = kni_png_create_write_struct_2(_user_png_ver, _error_ptr, _error_fn, _warn_fn, _mem_ptr, _malloc_fn, _free_fn)
        interpretCPointer<png_struct>(res)
    }
}

@SymbolName("png_kni_png_create_write_struct_2")
private external fun kni_png_create_write_struct_2(user_png_ver: NativePtr, error_ptr: NativePtr, error_fn: NativePtr, warn_fn: NativePtr, mem_ptr: NativePtr, malloc_fn: NativePtr, free_fn: NativePtr): NativePtr

fun png_write_sig(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_write_sig(_png_ptr)
    return res
}

@SymbolName("png_kni_png_write_sig")
private external fun kni_png_write_sig(png_ptr: NativePtr): Unit

fun png_write_chunk(png_ptr: png_structrp?, chunk_name: png_const_bytep?, data: png_const_bytep?, length: png_size_t): Unit {
    val _png_ptr = png_ptr.rawValue
    val _chunk_name = chunk_name.rawValue
    val _data = data.rawValue
    val _length = length
    val res = kni_png_write_chunk(_png_ptr, _chunk_name, _data, _length)
    return res
}

@SymbolName("png_kni_png_write_chunk")
private external fun kni_png_write_chunk(png_ptr: NativePtr, chunk_name: NativePtr, data: NativePtr, length: Long): Unit

fun png_write_chunk_start(png_ptr: png_structrp?, chunk_name: png_const_bytep?, length: png_uint_32): Unit {
    val _png_ptr = png_ptr.rawValue
    val _chunk_name = chunk_name.rawValue
    val _length = length
    val res = kni_png_write_chunk_start(_png_ptr, _chunk_name, _length)
    return res
}

@SymbolName("png_kni_png_write_chunk_start")
private external fun kni_png_write_chunk_start(png_ptr: NativePtr, chunk_name: NativePtr, length: Int): Unit

fun png_write_chunk_data(png_ptr: png_structrp?, data: png_const_bytep?, length: png_size_t): Unit {
    val _png_ptr = png_ptr.rawValue
    val _data = data.rawValue
    val _length = length
    val res = kni_png_write_chunk_data(_png_ptr, _data, _length)
    return res
}

@SymbolName("png_kni_png_write_chunk_data")
private external fun kni_png_write_chunk_data(png_ptr: NativePtr, data: NativePtr, length: Long): Unit

fun png_write_chunk_end(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_write_chunk_end(_png_ptr)
    return res
}

@SymbolName("png_kni_png_write_chunk_end")
private external fun kni_png_write_chunk_end(png_ptr: NativePtr): Unit

fun png_create_info_struct(png_ptr: png_const_structrp?): png_infop? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_create_info_struct(_png_ptr)
    return interpretCPointer<png_info>(res)
}

@SymbolName("png_kni_png_create_info_struct")
private external fun kni_png_create_info_struct(png_ptr: NativePtr): NativePtr

fun png_info_init_3(info_ptr: png_infopp?, png_info_struct_size: png_size_t): Unit {
    val _info_ptr = info_ptr.rawValue
    val _png_info_struct_size = png_info_struct_size
    val res = kni_png_info_init_3(_info_ptr, _png_info_struct_size)
    return res
}

@SymbolName("png_kni_png_info_init_3")
private external fun kni_png_info_init_3(info_ptr: NativePtr, png_info_struct_size: Long): Unit

fun png_write_info_before_PLTE(png_ptr: png_structrp?, info_ptr: png_const_inforp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_write_info_before_PLTE(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_write_info_before_PLTE")
private external fun kni_png_write_info_before_PLTE(png_ptr: NativePtr, info_ptr: NativePtr): Unit

fun png_write_info(png_ptr: png_structrp?, info_ptr: png_const_inforp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_write_info(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_write_info")
private external fun kni_png_write_info(png_ptr: NativePtr, info_ptr: NativePtr): Unit

fun png_read_info(png_ptr: png_structrp?, info_ptr: png_inforp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_read_info(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_read_info")
private external fun kni_png_read_info(png_ptr: NativePtr, info_ptr: NativePtr): Unit

fun png_convert_to_rfc1123(png_ptr: png_structrp?, ptime: png_const_timep?): png_const_charp? {
    val _png_ptr = png_ptr.rawValue
    val _ptime = ptime.rawValue
    val res = kni_png_convert_to_rfc1123(_png_ptr, _ptime)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("png_kni_png_convert_to_rfc1123")
private external fun kni_png_convert_to_rfc1123(png_ptr: NativePtr, ptime: NativePtr): NativePtr

fun png_convert_to_rfc1123_buffer(out: CValuesRef<ByteVar>?, ptime: png_const_timep?): Int {
    return memScoped {
        val _out = out?.getPointer(memScope).rawValue
        val _ptime = ptime.rawValue
        val res = kni_png_convert_to_rfc1123_buffer(_out, _ptime)
        res
    }
}

@SymbolName("png_kni_png_convert_to_rfc1123_buffer")
private external fun kni_png_convert_to_rfc1123_buffer(out: NativePtr, ptime: NativePtr): Int

fun png_convert_from_struct_tm(ptime: png_timep?, ttime: CValuesRef<tm>?): Unit {
    return memScoped {
        val _ptime = ptime.rawValue
        val _ttime = ttime?.getPointer(memScope).rawValue
        val res = kni_png_convert_from_struct_tm(_ptime, _ttime)
        res
    }
}

@SymbolName("png_kni_png_convert_from_struct_tm")
private external fun kni_png_convert_from_struct_tm(ptime: NativePtr, ttime: NativePtr): Unit

fun png_convert_from_time_t(ptime: png_timep?, ttime: time_t): Unit {
    val _ptime = ptime.rawValue
    val _ttime = ttime
    val res = kni_png_convert_from_time_t(_ptime, _ttime)
    return res
}

@SymbolName("png_kni_png_convert_from_time_t")
private external fun kni_png_convert_from_time_t(ptime: NativePtr, ttime: Long): Unit

fun png_set_expand(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_expand(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_expand")
private external fun kni_png_set_expand(png_ptr: NativePtr): Unit

fun png_set_expand_gray_1_2_4_to_8(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_expand_gray_1_2_4_to_8(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_expand_gray_1_2_4_to_8")
private external fun kni_png_set_expand_gray_1_2_4_to_8(png_ptr: NativePtr): Unit

fun png_set_palette_to_rgb(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_palette_to_rgb(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_palette_to_rgb")
private external fun kni_png_set_palette_to_rgb(png_ptr: NativePtr): Unit

fun png_set_tRNS_to_alpha(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_tRNS_to_alpha(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_tRNS_to_alpha")
private external fun kni_png_set_tRNS_to_alpha(png_ptr: NativePtr): Unit

fun png_set_expand_16(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_expand_16(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_expand_16")
private external fun kni_png_set_expand_16(png_ptr: NativePtr): Unit

fun png_set_bgr(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_bgr(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_bgr")
private external fun kni_png_set_bgr(png_ptr: NativePtr): Unit

fun png_set_gray_to_rgb(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_gray_to_rgb(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_gray_to_rgb")
private external fun kni_png_set_gray_to_rgb(png_ptr: NativePtr): Unit

fun png_set_rgb_to_gray(png_ptr: png_structrp?, error_action: Int, red: Double, green: Double): Unit {
    val _png_ptr = png_ptr.rawValue
    val _error_action = error_action
    val _red = red
    val _green = green
    val res = kni_png_set_rgb_to_gray(_png_ptr, _error_action, _red, _green)
    return res
}

@SymbolName("png_kni_png_set_rgb_to_gray")
private external fun kni_png_set_rgb_to_gray(png_ptr: NativePtr, error_action: Int, red: Double, green: Double): Unit

fun png_set_rgb_to_gray_fixed(png_ptr: png_structrp?, error_action: Int, red: png_fixed_point, green: png_fixed_point): Unit {
    val _png_ptr = png_ptr.rawValue
    val _error_action = error_action
    val _red = red
    val _green = green
    val res = kni_png_set_rgb_to_gray_fixed(_png_ptr, _error_action, _red, _green)
    return res
}

@SymbolName("png_kni_png_set_rgb_to_gray_fixed")
private external fun kni_png_set_rgb_to_gray_fixed(png_ptr: NativePtr, error_action: Int, red: Int, green: Int): Unit

fun png_get_rgb_to_gray_status(png_ptr: png_const_structrp?): png_byte {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_rgb_to_gray_status(_png_ptr)
    return res
}

@SymbolName("png_kni_png_get_rgb_to_gray_status")
private external fun kni_png_get_rgb_to_gray_status(png_ptr: NativePtr): Byte

fun png_build_grayscale_palette(bit_depth: Int, palette: png_colorp?): Unit {
    val _bit_depth = bit_depth
    val _palette = palette.rawValue
    val res = kni_png_build_grayscale_palette(_bit_depth, _palette)
    return res
}

@SymbolName("png_kni_png_build_grayscale_palette")
private external fun kni_png_build_grayscale_palette(bit_depth: Int, palette: NativePtr): Unit

fun png_set_alpha_mode(png_ptr: png_structrp?, mode: Int, output_gamma: Double): Unit {
    val _png_ptr = png_ptr.rawValue
    val _mode = mode
    val _output_gamma = output_gamma
    val res = kni_png_set_alpha_mode(_png_ptr, _mode, _output_gamma)
    return res
}

@SymbolName("png_kni_png_set_alpha_mode")
private external fun kni_png_set_alpha_mode(png_ptr: NativePtr, mode: Int, output_gamma: Double): Unit

fun png_set_alpha_mode_fixed(png_ptr: png_structrp?, mode: Int, output_gamma: png_fixed_point): Unit {
    val _png_ptr = png_ptr.rawValue
    val _mode = mode
    val _output_gamma = output_gamma
    val res = kni_png_set_alpha_mode_fixed(_png_ptr, _mode, _output_gamma)
    return res
}

@SymbolName("png_kni_png_set_alpha_mode_fixed")
private external fun kni_png_set_alpha_mode_fixed(png_ptr: NativePtr, mode: Int, output_gamma: Int): Unit

fun png_set_strip_alpha(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_strip_alpha(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_strip_alpha")
private external fun kni_png_set_strip_alpha(png_ptr: NativePtr): Unit

fun png_set_swap_alpha(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_swap_alpha(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_swap_alpha")
private external fun kni_png_set_swap_alpha(png_ptr: NativePtr): Unit

fun png_set_invert_alpha(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_invert_alpha(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_invert_alpha")
private external fun kni_png_set_invert_alpha(png_ptr: NativePtr): Unit

fun png_set_filler(png_ptr: png_structrp?, filler: png_uint_32, flags: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _filler = filler
    val _flags = flags
    val res = kni_png_set_filler(_png_ptr, _filler, _flags)
    return res
}

@SymbolName("png_kni_png_set_filler")
private external fun kni_png_set_filler(png_ptr: NativePtr, filler: Int, flags: Int): Unit

fun png_set_add_alpha(png_ptr: png_structrp?, filler: png_uint_32, flags: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _filler = filler
    val _flags = flags
    val res = kni_png_set_add_alpha(_png_ptr, _filler, _flags)
    return res
}

@SymbolName("png_kni_png_set_add_alpha")
private external fun kni_png_set_add_alpha(png_ptr: NativePtr, filler: Int, flags: Int): Unit

fun png_set_swap(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_swap(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_swap")
private external fun kni_png_set_swap(png_ptr: NativePtr): Unit

fun png_set_packing(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_packing(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_packing")
private external fun kni_png_set_packing(png_ptr: NativePtr): Unit

fun png_set_packswap(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_packswap(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_packswap")
private external fun kni_png_set_packswap(png_ptr: NativePtr): Unit

fun png_set_shift(png_ptr: png_structrp?, true_bits: png_const_color_8p?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _true_bits = true_bits.rawValue
    val res = kni_png_set_shift(_png_ptr, _true_bits)
    return res
}

@SymbolName("png_kni_png_set_shift")
private external fun kni_png_set_shift(png_ptr: NativePtr, true_bits: NativePtr): Unit

fun png_set_interlace_handling(png_ptr: png_structrp?): Int {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_interlace_handling(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_interlace_handling")
private external fun kni_png_set_interlace_handling(png_ptr: NativePtr): Int

fun png_set_invert_mono(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_invert_mono(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_invert_mono")
private external fun kni_png_set_invert_mono(png_ptr: NativePtr): Unit

fun png_set_background(png_ptr: png_structrp?, background_color: png_const_color_16p?, background_gamma_code: Int, need_expand: Int, background_gamma: Double): Unit {
    val _png_ptr = png_ptr.rawValue
    val _background_color = background_color.rawValue
    val _background_gamma_code = background_gamma_code
    val _need_expand = need_expand
    val _background_gamma = background_gamma
    val res = kni_png_set_background(_png_ptr, _background_color, _background_gamma_code, _need_expand, _background_gamma)
    return res
}

@SymbolName("png_kni_png_set_background")
private external fun kni_png_set_background(png_ptr: NativePtr, background_color: NativePtr, background_gamma_code: Int, need_expand: Int, background_gamma: Double): Unit

fun png_set_background_fixed(png_ptr: png_structrp?, background_color: png_const_color_16p?, background_gamma_code: Int, need_expand: Int, background_gamma: png_fixed_point): Unit {
    val _png_ptr = png_ptr.rawValue
    val _background_color = background_color.rawValue
    val _background_gamma_code = background_gamma_code
    val _need_expand = need_expand
    val _background_gamma = background_gamma
    val res = kni_png_set_background_fixed(_png_ptr, _background_color, _background_gamma_code, _need_expand, _background_gamma)
    return res
}

@SymbolName("png_kni_png_set_background_fixed")
private external fun kni_png_set_background_fixed(png_ptr: NativePtr, background_color: NativePtr, background_gamma_code: Int, need_expand: Int, background_gamma: Int): Unit

fun png_set_scale_16(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_scale_16(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_scale_16")
private external fun kni_png_set_scale_16(png_ptr: NativePtr): Unit

fun png_set_strip_16(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_set_strip_16(_png_ptr)
    return res
}

@SymbolName("png_kni_png_set_strip_16")
private external fun kni_png_set_strip_16(png_ptr: NativePtr): Unit

fun png_set_quantize(png_ptr: png_structrp?, palette: png_colorp?, num_palette: Int, maximum_colors: Int, histogram: png_const_uint_16p?, full_quantize: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _palette = palette.rawValue
    val _num_palette = num_palette
    val _maximum_colors = maximum_colors
    val _histogram = histogram.rawValue
    val _full_quantize = full_quantize
    val res = kni_png_set_quantize(_png_ptr, _palette, _num_palette, _maximum_colors, _histogram, _full_quantize)
    return res
}

@SymbolName("png_kni_png_set_quantize")
private external fun kni_png_set_quantize(png_ptr: NativePtr, palette: NativePtr, num_palette: Int, maximum_colors: Int, histogram: NativePtr, full_quantize: Int): Unit

fun png_set_gamma(png_ptr: png_structrp?, screen_gamma: Double, override_file_gamma: Double): Unit {
    val _png_ptr = png_ptr.rawValue
    val _screen_gamma = screen_gamma
    val _override_file_gamma = override_file_gamma
    val res = kni_png_set_gamma(_png_ptr, _screen_gamma, _override_file_gamma)
    return res
}

@SymbolName("png_kni_png_set_gamma")
private external fun kni_png_set_gamma(png_ptr: NativePtr, screen_gamma: Double, override_file_gamma: Double): Unit

fun png_set_gamma_fixed(png_ptr: png_structrp?, screen_gamma: png_fixed_point, override_file_gamma: png_fixed_point): Unit {
    val _png_ptr = png_ptr.rawValue
    val _screen_gamma = screen_gamma
    val _override_file_gamma = override_file_gamma
    val res = kni_png_set_gamma_fixed(_png_ptr, _screen_gamma, _override_file_gamma)
    return res
}

@SymbolName("png_kni_png_set_gamma_fixed")
private external fun kni_png_set_gamma_fixed(png_ptr: NativePtr, screen_gamma: Int, override_file_gamma: Int): Unit

fun png_set_flush(png_ptr: png_structrp?, nrows: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _nrows = nrows
    val res = kni_png_set_flush(_png_ptr, _nrows)
    return res
}

@SymbolName("png_kni_png_set_flush")
private external fun kni_png_set_flush(png_ptr: NativePtr, nrows: Int): Unit

fun png_write_flush(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_write_flush(_png_ptr)
    return res
}

@SymbolName("png_kni_png_write_flush")
private external fun kni_png_write_flush(png_ptr: NativePtr): Unit

fun png_start_read_image(png_ptr: png_structrp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_start_read_image(_png_ptr)
    return res
}

@SymbolName("png_kni_png_start_read_image")
private external fun kni_png_start_read_image(png_ptr: NativePtr): Unit

fun png_read_update_info(png_ptr: png_structrp?, info_ptr: png_inforp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_read_update_info(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_read_update_info")
private external fun kni_png_read_update_info(png_ptr: NativePtr, info_ptr: NativePtr): Unit

fun png_read_rows(png_ptr: png_structrp?, row: png_bytepp?, display_row: png_bytepp?, num_rows: png_uint_32): Unit {
    val _png_ptr = png_ptr.rawValue
    val _row = row.rawValue
    val _display_row = display_row.rawValue
    val _num_rows = num_rows
    val res = kni_png_read_rows(_png_ptr, _row, _display_row, _num_rows)
    return res
}

@SymbolName("png_kni_png_read_rows")
private external fun kni_png_read_rows(png_ptr: NativePtr, row: NativePtr, display_row: NativePtr, num_rows: Int): Unit

fun png_read_row(png_ptr: png_structrp?, row: png_bytep?, display_row: png_bytep?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _row = row.rawValue
    val _display_row = display_row.rawValue
    val res = kni_png_read_row(_png_ptr, _row, _display_row)
    return res
}

@SymbolName("png_kni_png_read_row")
private external fun kni_png_read_row(png_ptr: NativePtr, row: NativePtr, display_row: NativePtr): Unit

fun png_read_image(png_ptr: png_structrp?, image: png_bytepp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _image = image.rawValue
    val res = kni_png_read_image(_png_ptr, _image)
    return res
}

@SymbolName("png_kni_png_read_image")
private external fun kni_png_read_image(png_ptr: NativePtr, image: NativePtr): Unit

fun png_write_row(png_ptr: png_structrp?, row: png_const_bytep?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _row = row.rawValue
    val res = kni_png_write_row(_png_ptr, _row)
    return res
}

@SymbolName("png_kni_png_write_row")
private external fun kni_png_write_row(png_ptr: NativePtr, row: NativePtr): Unit

fun png_write_rows(png_ptr: png_structrp?, row: png_bytepp?, num_rows: png_uint_32): Unit {
    val _png_ptr = png_ptr.rawValue
    val _row = row.rawValue
    val _num_rows = num_rows
    val res = kni_png_write_rows(_png_ptr, _row, _num_rows)
    return res
}

@SymbolName("png_kni_png_write_rows")
private external fun kni_png_write_rows(png_ptr: NativePtr, row: NativePtr, num_rows: Int): Unit

fun png_write_image(png_ptr: png_structrp?, image: png_bytepp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _image = image.rawValue
    val res = kni_png_write_image(_png_ptr, _image)
    return res
}

@SymbolName("png_kni_png_write_image")
private external fun kni_png_write_image(png_ptr: NativePtr, image: NativePtr): Unit

fun png_write_end(png_ptr: png_structrp?, info_ptr: png_inforp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_write_end(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_write_end")
private external fun kni_png_write_end(png_ptr: NativePtr, info_ptr: NativePtr): Unit

fun png_read_end(png_ptr: png_structrp?, info_ptr: png_inforp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_read_end(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_read_end")
private external fun kni_png_read_end(png_ptr: NativePtr, info_ptr: NativePtr): Unit

fun png_destroy_info_struct(png_ptr: png_const_structrp?, info_ptr_ptr: png_infopp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr_ptr = info_ptr_ptr.rawValue
    val res = kni_png_destroy_info_struct(_png_ptr, _info_ptr_ptr)
    return res
}

@SymbolName("png_kni_png_destroy_info_struct")
private external fun kni_png_destroy_info_struct(png_ptr: NativePtr, info_ptr_ptr: NativePtr): Unit

fun png_destroy_read_struct(png_ptr_ptr: png_structpp?, info_ptr_ptr: png_infopp?, end_info_ptr_ptr: png_infopp?): Unit {
    val _png_ptr_ptr = png_ptr_ptr.rawValue
    val _info_ptr_ptr = info_ptr_ptr.rawValue
    val _end_info_ptr_ptr = end_info_ptr_ptr.rawValue
    val res = kni_png_destroy_read_struct(_png_ptr_ptr, _info_ptr_ptr, _end_info_ptr_ptr)
    return res
}

@SymbolName("png_kni_png_destroy_read_struct")
private external fun kni_png_destroy_read_struct(png_ptr_ptr: NativePtr, info_ptr_ptr: NativePtr, end_info_ptr_ptr: NativePtr): Unit

fun png_destroy_write_struct(png_ptr_ptr: png_structpp?, info_ptr_ptr: png_infopp?): Unit {
    val _png_ptr_ptr = png_ptr_ptr.rawValue
    val _info_ptr_ptr = info_ptr_ptr.rawValue
    val res = kni_png_destroy_write_struct(_png_ptr_ptr, _info_ptr_ptr)
    return res
}

@SymbolName("png_kni_png_destroy_write_struct")
private external fun kni_png_destroy_write_struct(png_ptr_ptr: NativePtr, info_ptr_ptr: NativePtr): Unit

fun png_set_crc_action(png_ptr: png_structrp?, crit_action: Int, ancil_action: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _crit_action = crit_action
    val _ancil_action = ancil_action
    val res = kni_png_set_crc_action(_png_ptr, _crit_action, _ancil_action)
    return res
}

@SymbolName("png_kni_png_set_crc_action")
private external fun kni_png_set_crc_action(png_ptr: NativePtr, crit_action: Int, ancil_action: Int): Unit

fun png_set_filter(png_ptr: png_structrp?, method: Int, filters: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _method = method
    val _filters = filters
    val res = kni_png_set_filter(_png_ptr, _method, _filters)
    return res
}

@SymbolName("png_kni_png_set_filter")
private external fun kni_png_set_filter(png_ptr: NativePtr, method: Int, filters: Int): Unit

fun png_set_filter_heuristics(png_ptr: png_structrp?, heuristic_method: Int, num_weights: Int, filter_weights: png_const_doublep?, filter_costs: png_const_doublep?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _heuristic_method = heuristic_method
    val _num_weights = num_weights
    val _filter_weights = filter_weights.rawValue
    val _filter_costs = filter_costs.rawValue
    val res = kni_png_set_filter_heuristics(_png_ptr, _heuristic_method, _num_weights, _filter_weights, _filter_costs)
    return res
}

@SymbolName("png_kni_png_set_filter_heuristics")
private external fun kni_png_set_filter_heuristics(png_ptr: NativePtr, heuristic_method: Int, num_weights: Int, filter_weights: NativePtr, filter_costs: NativePtr): Unit

fun png_set_filter_heuristics_fixed(png_ptr: png_structrp?, heuristic_method: Int, num_weights: Int, filter_weights: png_const_fixed_point_p?, filter_costs: png_const_fixed_point_p?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _heuristic_method = heuristic_method
    val _num_weights = num_weights
    val _filter_weights = filter_weights.rawValue
    val _filter_costs = filter_costs.rawValue
    val res = kni_png_set_filter_heuristics_fixed(_png_ptr, _heuristic_method, _num_weights, _filter_weights, _filter_costs)
    return res
}

@SymbolName("png_kni_png_set_filter_heuristics_fixed")
private external fun kni_png_set_filter_heuristics_fixed(png_ptr: NativePtr, heuristic_method: Int, num_weights: Int, filter_weights: NativePtr, filter_costs: NativePtr): Unit

fun png_set_compression_level(png_ptr: png_structrp?, level: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _level = level
    val res = kni_png_set_compression_level(_png_ptr, _level)
    return res
}

@SymbolName("png_kni_png_set_compression_level")
private external fun kni_png_set_compression_level(png_ptr: NativePtr, level: Int): Unit

fun png_set_compression_mem_level(png_ptr: png_structrp?, mem_level: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _mem_level = mem_level
    val res = kni_png_set_compression_mem_level(_png_ptr, _mem_level)
    return res
}

@SymbolName("png_kni_png_set_compression_mem_level")
private external fun kni_png_set_compression_mem_level(png_ptr: NativePtr, mem_level: Int): Unit

fun png_set_compression_strategy(png_ptr: png_structrp?, strategy: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _strategy = strategy
    val res = kni_png_set_compression_strategy(_png_ptr, _strategy)
    return res
}

@SymbolName("png_kni_png_set_compression_strategy")
private external fun kni_png_set_compression_strategy(png_ptr: NativePtr, strategy: Int): Unit

fun png_set_compression_window_bits(png_ptr: png_structrp?, window_bits: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _window_bits = window_bits
    val res = kni_png_set_compression_window_bits(_png_ptr, _window_bits)
    return res
}

@SymbolName("png_kni_png_set_compression_window_bits")
private external fun kni_png_set_compression_window_bits(png_ptr: NativePtr, window_bits: Int): Unit

fun png_set_compression_method(png_ptr: png_structrp?, method: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _method = method
    val res = kni_png_set_compression_method(_png_ptr, _method)
    return res
}

@SymbolName("png_kni_png_set_compression_method")
private external fun kni_png_set_compression_method(png_ptr: NativePtr, method: Int): Unit

fun png_set_text_compression_level(png_ptr: png_structrp?, level: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _level = level
    val res = kni_png_set_text_compression_level(_png_ptr, _level)
    return res
}

@SymbolName("png_kni_png_set_text_compression_level")
private external fun kni_png_set_text_compression_level(png_ptr: NativePtr, level: Int): Unit

fun png_set_text_compression_mem_level(png_ptr: png_structrp?, mem_level: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _mem_level = mem_level
    val res = kni_png_set_text_compression_mem_level(_png_ptr, _mem_level)
    return res
}

@SymbolName("png_kni_png_set_text_compression_mem_level")
private external fun kni_png_set_text_compression_mem_level(png_ptr: NativePtr, mem_level: Int): Unit

fun png_set_text_compression_strategy(png_ptr: png_structrp?, strategy: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _strategy = strategy
    val res = kni_png_set_text_compression_strategy(_png_ptr, _strategy)
    return res
}

@SymbolName("png_kni_png_set_text_compression_strategy")
private external fun kni_png_set_text_compression_strategy(png_ptr: NativePtr, strategy: Int): Unit

fun png_set_text_compression_window_bits(png_ptr: png_structrp?, window_bits: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _window_bits = window_bits
    val res = kni_png_set_text_compression_window_bits(_png_ptr, _window_bits)
    return res
}

@SymbolName("png_kni_png_set_text_compression_window_bits")
private external fun kni_png_set_text_compression_window_bits(png_ptr: NativePtr, window_bits: Int): Unit

fun png_set_text_compression_method(png_ptr: png_structrp?, method: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _method = method
    val res = kni_png_set_text_compression_method(_png_ptr, _method)
    return res
}

@SymbolName("png_kni_png_set_text_compression_method")
private external fun kni_png_set_text_compression_method(png_ptr: NativePtr, method: Int): Unit

fun png_init_io(png_ptr: png_structrp?, fp: png_FILE_p?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _fp = fp.rawValue
    val res = kni_png_init_io(_png_ptr, _fp)
    return res
}

@SymbolName("png_kni_png_init_io")
private external fun kni_png_init_io(png_ptr: NativePtr, fp: NativePtr): Unit

fun png_set_error_fn(png_ptr: png_structrp?, error_ptr: png_voidp?, error_fn: png_error_ptr?, warning_fn: png_error_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _error_ptr = error_ptr.rawValue
    val _error_fn = error_fn.rawValue
    val _warning_fn = warning_fn.rawValue
    val res = kni_png_set_error_fn(_png_ptr, _error_ptr, _error_fn, _warning_fn)
    return res
}

@SymbolName("png_kni_png_set_error_fn")
private external fun kni_png_set_error_fn(png_ptr: NativePtr, error_ptr: NativePtr, error_fn: NativePtr, warning_fn: NativePtr): Unit

fun png_get_error_ptr(png_ptr: png_const_structrp?): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_error_ptr(_png_ptr)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_get_error_ptr")
private external fun kni_png_get_error_ptr(png_ptr: NativePtr): NativePtr

fun png_set_write_fn(png_ptr: png_structrp?, io_ptr: png_voidp?, write_data_fn: png_rw_ptr?, output_flush_fn: png_flush_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _io_ptr = io_ptr.rawValue
    val _write_data_fn = write_data_fn.rawValue
    val _output_flush_fn = output_flush_fn.rawValue
    val res = kni_png_set_write_fn(_png_ptr, _io_ptr, _write_data_fn, _output_flush_fn)
    return res
}

@SymbolName("png_kni_png_set_write_fn")
private external fun kni_png_set_write_fn(png_ptr: NativePtr, io_ptr: NativePtr, write_data_fn: NativePtr, output_flush_fn: NativePtr): Unit

fun png_set_read_fn(png_ptr: png_structrp?, io_ptr: png_voidp?, read_data_fn: png_rw_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _io_ptr = io_ptr.rawValue
    val _read_data_fn = read_data_fn.rawValue
    val res = kni_png_set_read_fn(_png_ptr, _io_ptr, _read_data_fn)
    return res
}

@SymbolName("png_kni_png_set_read_fn")
private external fun kni_png_set_read_fn(png_ptr: NativePtr, io_ptr: NativePtr, read_data_fn: NativePtr): Unit

fun png_get_io_ptr(png_ptr: png_const_structrp?): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_io_ptr(_png_ptr)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_get_io_ptr")
private external fun kni_png_get_io_ptr(png_ptr: NativePtr): NativePtr

fun png_set_read_status_fn(png_ptr: png_structrp?, read_row_fn: png_read_status_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _read_row_fn = read_row_fn.rawValue
    val res = kni_png_set_read_status_fn(_png_ptr, _read_row_fn)
    return res
}

@SymbolName("png_kni_png_set_read_status_fn")
private external fun kni_png_set_read_status_fn(png_ptr: NativePtr, read_row_fn: NativePtr): Unit

fun png_set_write_status_fn(png_ptr: png_structrp?, write_row_fn: png_write_status_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _write_row_fn = write_row_fn.rawValue
    val res = kni_png_set_write_status_fn(_png_ptr, _write_row_fn)
    return res
}

@SymbolName("png_kni_png_set_write_status_fn")
private external fun kni_png_set_write_status_fn(png_ptr: NativePtr, write_row_fn: NativePtr): Unit

fun png_set_mem_fn(png_ptr: png_structrp?, mem_ptr: png_voidp?, malloc_fn: png_malloc_ptr?, free_fn: png_free_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _mem_ptr = mem_ptr.rawValue
    val _malloc_fn = malloc_fn.rawValue
    val _free_fn = free_fn.rawValue
    val res = kni_png_set_mem_fn(_png_ptr, _mem_ptr, _malloc_fn, _free_fn)
    return res
}

@SymbolName("png_kni_png_set_mem_fn")
private external fun kni_png_set_mem_fn(png_ptr: NativePtr, mem_ptr: NativePtr, malloc_fn: NativePtr, free_fn: NativePtr): Unit

fun png_get_mem_ptr(png_ptr: png_const_structrp?): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_mem_ptr(_png_ptr)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_get_mem_ptr")
private external fun kni_png_get_mem_ptr(png_ptr: NativePtr): NativePtr

fun png_set_read_user_transform_fn(png_ptr: png_structrp?, read_user_transform_fn: png_user_transform_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _read_user_transform_fn = read_user_transform_fn.rawValue
    val res = kni_png_set_read_user_transform_fn(_png_ptr, _read_user_transform_fn)
    return res
}

@SymbolName("png_kni_png_set_read_user_transform_fn")
private external fun kni_png_set_read_user_transform_fn(png_ptr: NativePtr, read_user_transform_fn: NativePtr): Unit

fun png_set_write_user_transform_fn(png_ptr: png_structrp?, write_user_transform_fn: png_user_transform_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _write_user_transform_fn = write_user_transform_fn.rawValue
    val res = kni_png_set_write_user_transform_fn(_png_ptr, _write_user_transform_fn)
    return res
}

@SymbolName("png_kni_png_set_write_user_transform_fn")
private external fun kni_png_set_write_user_transform_fn(png_ptr: NativePtr, write_user_transform_fn: NativePtr): Unit

fun png_set_user_transform_info(png_ptr: png_structrp?, user_transform_ptr: png_voidp?, user_transform_depth: Int, user_transform_channels: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _user_transform_ptr = user_transform_ptr.rawValue
    val _user_transform_depth = user_transform_depth
    val _user_transform_channels = user_transform_channels
    val res = kni_png_set_user_transform_info(_png_ptr, _user_transform_ptr, _user_transform_depth, _user_transform_channels)
    return res
}

@SymbolName("png_kni_png_set_user_transform_info")
private external fun kni_png_set_user_transform_info(png_ptr: NativePtr, user_transform_ptr: NativePtr, user_transform_depth: Int, user_transform_channels: Int): Unit

fun png_get_user_transform_ptr(png_ptr: png_const_structrp?): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_user_transform_ptr(_png_ptr)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_get_user_transform_ptr")
private external fun kni_png_get_user_transform_ptr(png_ptr: NativePtr): NativePtr

fun png_get_current_row_number(arg0: png_const_structrp?): png_uint_32 {
    val _arg0 = arg0.rawValue
    val res = kni_png_get_current_row_number(_arg0)
    return res
}

@SymbolName("png_kni_png_get_current_row_number")
private external fun kni_png_get_current_row_number(arg0: NativePtr): Int

fun png_get_current_pass_number(arg0: png_const_structrp?): png_byte {
    val _arg0 = arg0.rawValue
    val res = kni_png_get_current_pass_number(_arg0)
    return res
}

@SymbolName("png_kni_png_get_current_pass_number")
private external fun kni_png_get_current_pass_number(arg0: NativePtr): Byte

fun png_set_read_user_chunk_fn(png_ptr: png_structrp?, user_chunk_ptr: png_voidp?, read_user_chunk_fn: png_user_chunk_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _user_chunk_ptr = user_chunk_ptr.rawValue
    val _read_user_chunk_fn = read_user_chunk_fn.rawValue
    val res = kni_png_set_read_user_chunk_fn(_png_ptr, _user_chunk_ptr, _read_user_chunk_fn)
    return res
}

@SymbolName("png_kni_png_set_read_user_chunk_fn")
private external fun kni_png_set_read_user_chunk_fn(png_ptr: NativePtr, user_chunk_ptr: NativePtr, read_user_chunk_fn: NativePtr): Unit

fun png_get_user_chunk_ptr(png_ptr: png_const_structrp?): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_user_chunk_ptr(_png_ptr)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_get_user_chunk_ptr")
private external fun kni_png_get_user_chunk_ptr(png_ptr: NativePtr): NativePtr

fun png_set_progressive_read_fn(png_ptr: png_structrp?, progressive_ptr: png_voidp?, info_fn: png_progressive_info_ptr?, row_fn: png_progressive_row_ptr?, end_fn: png_progressive_end_ptr?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _progressive_ptr = progressive_ptr.rawValue
    val _info_fn = info_fn.rawValue
    val _row_fn = row_fn.rawValue
    val _end_fn = end_fn.rawValue
    val res = kni_png_set_progressive_read_fn(_png_ptr, _progressive_ptr, _info_fn, _row_fn, _end_fn)
    return res
}

@SymbolName("png_kni_png_set_progressive_read_fn")
private external fun kni_png_set_progressive_read_fn(png_ptr: NativePtr, progressive_ptr: NativePtr, info_fn: NativePtr, row_fn: NativePtr, end_fn: NativePtr): Unit

fun png_get_progressive_ptr(png_ptr: png_const_structrp?): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_progressive_ptr(_png_ptr)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_get_progressive_ptr")
private external fun kni_png_get_progressive_ptr(png_ptr: NativePtr): NativePtr

fun png_process_data(png_ptr: png_structrp?, info_ptr: png_inforp?, buffer: png_bytep?, buffer_size: png_size_t): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _buffer = buffer.rawValue
    val _buffer_size = buffer_size
    val res = kni_png_process_data(_png_ptr, _info_ptr, _buffer, _buffer_size)
    return res
}

@SymbolName("png_kni_png_process_data")
private external fun kni_png_process_data(png_ptr: NativePtr, info_ptr: NativePtr, buffer: NativePtr, buffer_size: Long): Unit

fun png_process_data_pause(arg0: png_structrp?, save: Int): png_size_t {
    val _arg0 = arg0.rawValue
    val _save = save
    val res = kni_png_process_data_pause(_arg0, _save)
    return res
}

@SymbolName("png_kni_png_process_data_pause")
private external fun kni_png_process_data_pause(arg0: NativePtr, save: Int): Long

fun png_process_data_skip(arg0: png_structrp?): png_uint_32 {
    val _arg0 = arg0.rawValue
    val res = kni_png_process_data_skip(_arg0)
    return res
}

@SymbolName("png_kni_png_process_data_skip")
private external fun kni_png_process_data_skip(arg0: NativePtr): Int

fun png_progressive_combine_row(png_ptr: png_const_structrp?, old_row: png_bytep?, new_row: png_const_bytep?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _old_row = old_row.rawValue
    val _new_row = new_row.rawValue
    val res = kni_png_progressive_combine_row(_png_ptr, _old_row, _new_row)
    return res
}

@SymbolName("png_kni_png_progressive_combine_row")
private external fun kni_png_progressive_combine_row(png_ptr: NativePtr, old_row: NativePtr, new_row: NativePtr): Unit

fun png_malloc(png_ptr: png_const_structrp?, size: png_alloc_size_t): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val _size = size
    val res = kni_png_malloc(_png_ptr, _size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_malloc")
private external fun kni_png_malloc(png_ptr: NativePtr, size: Long): NativePtr

fun png_calloc(png_ptr: png_const_structrp?, size: png_alloc_size_t): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val _size = size
    val res = kni_png_calloc(_png_ptr, _size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_calloc")
private external fun kni_png_calloc(png_ptr: NativePtr, size: Long): NativePtr

fun png_malloc_warn(png_ptr: png_const_structrp?, size: png_alloc_size_t): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val _size = size
    val res = kni_png_malloc_warn(_png_ptr, _size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_malloc_warn")
private external fun kni_png_malloc_warn(png_ptr: NativePtr, size: Long): NativePtr

fun png_free(png_ptr: png_const_structrp?, ptr: png_voidp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _ptr = ptr.rawValue
    val res = kni_png_free(_png_ptr, _ptr)
    return res
}

@SymbolName("png_kni_png_free")
private external fun kni_png_free(png_ptr: NativePtr, ptr: NativePtr): Unit

fun png_free_data(png_ptr: png_const_structrp?, info_ptr: png_inforp?, free_me: png_uint_32, num: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _free_me = free_me
    val _num = num
    val res = kni_png_free_data(_png_ptr, _info_ptr, _free_me, _num)
    return res
}

@SymbolName("png_kni_png_free_data")
private external fun kni_png_free_data(png_ptr: NativePtr, info_ptr: NativePtr, free_me: Int, num: Int): Unit

fun png_data_freer(png_ptr: png_const_structrp?, info_ptr: png_inforp?, freer: Int, mask: png_uint_32): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _freer = freer
    val _mask = mask
    val res = kni_png_data_freer(_png_ptr, _info_ptr, _freer, _mask)
    return res
}

@SymbolName("png_kni_png_data_freer")
private external fun kni_png_data_freer(png_ptr: NativePtr, info_ptr: NativePtr, freer: Int, mask: Int): Unit

fun png_malloc_default(png_ptr: png_const_structrp?, size: png_alloc_size_t): png_voidp? {
    val _png_ptr = png_ptr.rawValue
    val _size = size
    val res = kni_png_malloc_default(_png_ptr, _size)
    return interpretCPointer<COpaque>(res)
}

@SymbolName("png_kni_png_malloc_default")
private external fun kni_png_malloc_default(png_ptr: NativePtr, size: Long): NativePtr

fun png_free_default(png_ptr: png_const_structrp?, ptr: png_voidp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _ptr = ptr.rawValue
    val res = kni_png_free_default(_png_ptr, _ptr)
    return res
}

@SymbolName("png_kni_png_free_default")
private external fun kni_png_free_default(png_ptr: NativePtr, ptr: NativePtr): Unit

fun png_error(png_ptr: png_const_structrp?, error_message: String?): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _error_message = error_message?.cstr?.getPointer(memScope).rawValue
        val res = kni_png_error(_png_ptr, _error_message)
        res
    }
}

@SymbolName("png_kni_png_error")
private external fun kni_png_error(png_ptr: NativePtr, error_message: NativePtr): Unit

fun png_chunk_error(png_ptr: png_const_structrp?, error_message: String?): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _error_message = error_message?.cstr?.getPointer(memScope).rawValue
        val res = kni_png_chunk_error(_png_ptr, _error_message)
        res
    }
}

@SymbolName("png_kni_png_chunk_error")
private external fun kni_png_chunk_error(png_ptr: NativePtr, error_message: NativePtr): Unit

fun png_warning(png_ptr: png_const_structrp?, warning_message: String?): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _warning_message = warning_message?.cstr?.getPointer(memScope).rawValue
        val res = kni_png_warning(_png_ptr, _warning_message)
        res
    }
}

@SymbolName("png_kni_png_warning")
private external fun kni_png_warning(png_ptr: NativePtr, warning_message: NativePtr): Unit

fun png_chunk_warning(png_ptr: png_const_structrp?, warning_message: String?): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _warning_message = warning_message?.cstr?.getPointer(memScope).rawValue
        val res = kni_png_chunk_warning(_png_ptr, _warning_message)
        res
    }
}

@SymbolName("png_kni_png_chunk_warning")
private external fun kni_png_chunk_warning(png_ptr: NativePtr, warning_message: NativePtr): Unit

fun png_benign_error(png_ptr: png_const_structrp?, warning_message: String?): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _warning_message = warning_message?.cstr?.getPointer(memScope).rawValue
        val res = kni_png_benign_error(_png_ptr, _warning_message)
        res
    }
}

@SymbolName("png_kni_png_benign_error")
private external fun kni_png_benign_error(png_ptr: NativePtr, warning_message: NativePtr): Unit

fun png_chunk_benign_error(png_ptr: png_const_structrp?, warning_message: String?): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _warning_message = warning_message?.cstr?.getPointer(memScope).rawValue
        val res = kni_png_chunk_benign_error(_png_ptr, _warning_message)
        res
    }
}

@SymbolName("png_kni_png_chunk_benign_error")
private external fun kni_png_chunk_benign_error(png_ptr: NativePtr, warning_message: NativePtr): Unit

fun png_set_benign_errors(png_ptr: png_structrp?, allowed: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _allowed = allowed
    val res = kni_png_set_benign_errors(_png_ptr, _allowed)
    return res
}

@SymbolName("png_kni_png_set_benign_errors")
private external fun kni_png_set_benign_errors(png_ptr: NativePtr, allowed: Int): Unit

fun png_get_valid(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, flag: png_uint_32): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _flag = flag
    val res = kni_png_get_valid(_png_ptr, _info_ptr, _flag)
    return res
}

@SymbolName("png_kni_png_get_valid")
private external fun kni_png_get_valid(png_ptr: NativePtr, info_ptr: NativePtr, flag: Int): Int

fun png_get_rowbytes(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_size_t {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_rowbytes(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_rowbytes")
private external fun kni_png_get_rowbytes(png_ptr: NativePtr, info_ptr: NativePtr): Long

fun png_get_rows(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_bytepp? {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_rows(_png_ptr, _info_ptr)
    return interpretCPointer<CPointerVar<png_byteVar>>(res)
}

@SymbolName("png_kni_png_get_rows")
private external fun kni_png_get_rows(png_ptr: NativePtr, info_ptr: NativePtr): NativePtr

fun png_set_rows(png_ptr: png_const_structrp?, info_ptr: png_inforp?, row_pointers: png_bytepp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _row_pointers = row_pointers.rawValue
    val res = kni_png_set_rows(_png_ptr, _info_ptr, _row_pointers)
    return res
}

@SymbolName("png_kni_png_set_rows")
private external fun kni_png_set_rows(png_ptr: NativePtr, info_ptr: NativePtr, row_pointers: NativePtr): Unit

fun png_get_channels(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_byte {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_channels(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_channels")
private external fun kni_png_get_channels(png_ptr: NativePtr, info_ptr: NativePtr): Byte

fun png_get_image_width(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_image_width(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_image_width")
private external fun kni_png_get_image_width(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_image_height(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_image_height(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_image_height")
private external fun kni_png_get_image_height(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_bit_depth(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_byte {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_bit_depth(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_bit_depth")
private external fun kni_png_get_bit_depth(png_ptr: NativePtr, info_ptr: NativePtr): Byte

fun png_get_color_type(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_byte {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_color_type(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_color_type")
private external fun kni_png_get_color_type(png_ptr: NativePtr, info_ptr: NativePtr): Byte

fun png_get_filter_type(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_byte {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_filter_type(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_filter_type")
private external fun kni_png_get_filter_type(png_ptr: NativePtr, info_ptr: NativePtr): Byte

fun png_get_interlace_type(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_byte {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_interlace_type(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_interlace_type")
private external fun kni_png_get_interlace_type(png_ptr: NativePtr, info_ptr: NativePtr): Byte

fun png_get_compression_type(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_byte {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_compression_type(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_compression_type")
private external fun kni_png_get_compression_type(png_ptr: NativePtr, info_ptr: NativePtr): Byte

fun png_get_pixels_per_meter(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_pixels_per_meter(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_pixels_per_meter")
private external fun kni_png_get_pixels_per_meter(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_x_pixels_per_meter(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_x_pixels_per_meter(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_x_pixels_per_meter")
private external fun kni_png_get_x_pixels_per_meter(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_y_pixels_per_meter(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_y_pixels_per_meter(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_y_pixels_per_meter")
private external fun kni_png_get_y_pixels_per_meter(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_pixel_aspect_ratio(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): Float {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_pixel_aspect_ratio(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_pixel_aspect_ratio")
private external fun kni_png_get_pixel_aspect_ratio(png_ptr: NativePtr, info_ptr: NativePtr): Float

fun png_get_pixel_aspect_ratio_fixed(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_fixed_point {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_pixel_aspect_ratio_fixed(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_pixel_aspect_ratio_fixed")
private external fun kni_png_get_pixel_aspect_ratio_fixed(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_x_offset_pixels(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_int_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_x_offset_pixels(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_x_offset_pixels")
private external fun kni_png_get_x_offset_pixels(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_y_offset_pixels(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_int_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_y_offset_pixels(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_y_offset_pixels")
private external fun kni_png_get_y_offset_pixels(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_x_offset_microns(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_int_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_x_offset_microns(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_x_offset_microns")
private external fun kni_png_get_x_offset_microns(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_y_offset_microns(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_int_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_y_offset_microns(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_y_offset_microns")
private external fun kni_png_get_y_offset_microns(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_signature(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_const_bytep? {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_signature(_png_ptr, _info_ptr)
    return interpretCPointer<png_byteVar>(res)
}

@SymbolName("png_kni_png_get_signature")
private external fun kni_png_get_signature(png_ptr: NativePtr, info_ptr: NativePtr): NativePtr

fun png_get_bKGD(png_ptr: png_const_structrp?, info_ptr: png_inforp?, background: CValuesRef<png_color_16pVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _background = background?.getPointer(memScope).rawValue
        val res = kni_png_get_bKGD(_png_ptr, _info_ptr, _background)
        res
    }
}

@SymbolName("png_kni_png_get_bKGD")
private external fun kni_png_get_bKGD(png_ptr: NativePtr, info_ptr: NativePtr, background: NativePtr): Int

fun png_set_bKGD(png_ptr: png_const_structrp?, info_ptr: png_inforp?, background: png_const_color_16p?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _background = background.rawValue
    val res = kni_png_set_bKGD(_png_ptr, _info_ptr, _background)
    return res
}

@SymbolName("png_kni_png_set_bKGD")
private external fun kni_png_set_bKGD(png_ptr: NativePtr, info_ptr: NativePtr, background: NativePtr): Unit

fun png_get_cHRM(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, white_x: CValuesRef<DoubleVar>?, white_y: CValuesRef<DoubleVar>?, red_x: CValuesRef<DoubleVar>?, red_y: CValuesRef<DoubleVar>?, green_x: CValuesRef<DoubleVar>?, green_y: CValuesRef<DoubleVar>?, blue_x: CValuesRef<DoubleVar>?, blue_y: CValuesRef<DoubleVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _white_x = white_x?.getPointer(memScope).rawValue
        val _white_y = white_y?.getPointer(memScope).rawValue
        val _red_x = red_x?.getPointer(memScope).rawValue
        val _red_y = red_y?.getPointer(memScope).rawValue
        val _green_x = green_x?.getPointer(memScope).rawValue
        val _green_y = green_y?.getPointer(memScope).rawValue
        val _blue_x = blue_x?.getPointer(memScope).rawValue
        val _blue_y = blue_y?.getPointer(memScope).rawValue
        val res = kni_png_get_cHRM(_png_ptr, _info_ptr, _white_x, _white_y, _red_x, _red_y, _green_x, _green_y, _blue_x, _blue_y)
        res
    }
}

@SymbolName("png_kni_png_get_cHRM")
private external fun kni_png_get_cHRM(png_ptr: NativePtr, info_ptr: NativePtr, white_x: NativePtr, white_y: NativePtr, red_x: NativePtr, red_y: NativePtr, green_x: NativePtr, green_y: NativePtr, blue_x: NativePtr, blue_y: NativePtr): Int

fun png_get_cHRM_XYZ(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, red_X: CValuesRef<DoubleVar>?, red_Y: CValuesRef<DoubleVar>?, red_Z: CValuesRef<DoubleVar>?, green_X: CValuesRef<DoubleVar>?, green_Y: CValuesRef<DoubleVar>?, green_Z: CValuesRef<DoubleVar>?, blue_X: CValuesRef<DoubleVar>?, blue_Y: CValuesRef<DoubleVar>?, blue_Z: CValuesRef<DoubleVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _red_X = red_X?.getPointer(memScope).rawValue
        val _red_Y = red_Y?.getPointer(memScope).rawValue
        val _red_Z = red_Z?.getPointer(memScope).rawValue
        val _green_X = green_X?.getPointer(memScope).rawValue
        val _green_Y = green_Y?.getPointer(memScope).rawValue
        val _green_Z = green_Z?.getPointer(memScope).rawValue
        val _blue_X = blue_X?.getPointer(memScope).rawValue
        val _blue_Y = blue_Y?.getPointer(memScope).rawValue
        val _blue_Z = blue_Z?.getPointer(memScope).rawValue
        val res = kni_png_get_cHRM_XYZ(_png_ptr, _info_ptr, _red_X, _red_Y, _red_Z, _green_X, _green_Y, _green_Z, _blue_X, _blue_Y, _blue_Z)
        res
    }
}

@SymbolName("png_kni_png_get_cHRM_XYZ")
private external fun kni_png_get_cHRM_XYZ(png_ptr: NativePtr, info_ptr: NativePtr, red_X: NativePtr, red_Y: NativePtr, red_Z: NativePtr, green_X: NativePtr, green_Y: NativePtr, green_Z: NativePtr, blue_X: NativePtr, blue_Y: NativePtr, blue_Z: NativePtr): Int

fun png_get_cHRM_fixed(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, int_white_x: CValuesRef<png_fixed_pointVar>?, int_white_y: CValuesRef<png_fixed_pointVar>?, int_red_x: CValuesRef<png_fixed_pointVar>?, int_red_y: CValuesRef<png_fixed_pointVar>?, int_green_x: CValuesRef<png_fixed_pointVar>?, int_green_y: CValuesRef<png_fixed_pointVar>?, int_blue_x: CValuesRef<png_fixed_pointVar>?, int_blue_y: CValuesRef<png_fixed_pointVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _int_white_x = int_white_x?.getPointer(memScope).rawValue
        val _int_white_y = int_white_y?.getPointer(memScope).rawValue
        val _int_red_x = int_red_x?.getPointer(memScope).rawValue
        val _int_red_y = int_red_y?.getPointer(memScope).rawValue
        val _int_green_x = int_green_x?.getPointer(memScope).rawValue
        val _int_green_y = int_green_y?.getPointer(memScope).rawValue
        val _int_blue_x = int_blue_x?.getPointer(memScope).rawValue
        val _int_blue_y = int_blue_y?.getPointer(memScope).rawValue
        val res = kni_png_get_cHRM_fixed(_png_ptr, _info_ptr, _int_white_x, _int_white_y, _int_red_x, _int_red_y, _int_green_x, _int_green_y, _int_blue_x, _int_blue_y)
        res
    }
}

@SymbolName("png_kni_png_get_cHRM_fixed")
private external fun kni_png_get_cHRM_fixed(png_ptr: NativePtr, info_ptr: NativePtr, int_white_x: NativePtr, int_white_y: NativePtr, int_red_x: NativePtr, int_red_y: NativePtr, int_green_x: NativePtr, int_green_y: NativePtr, int_blue_x: NativePtr, int_blue_y: NativePtr): Int

fun png_get_cHRM_XYZ_fixed(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, int_red_X: CValuesRef<png_fixed_pointVar>?, int_red_Y: CValuesRef<png_fixed_pointVar>?, int_red_Z: CValuesRef<png_fixed_pointVar>?, int_green_X: CValuesRef<png_fixed_pointVar>?, int_green_Y: CValuesRef<png_fixed_pointVar>?, int_green_Z: CValuesRef<png_fixed_pointVar>?, int_blue_X: CValuesRef<png_fixed_pointVar>?, int_blue_Y: CValuesRef<png_fixed_pointVar>?, int_blue_Z: CValuesRef<png_fixed_pointVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _int_red_X = int_red_X?.getPointer(memScope).rawValue
        val _int_red_Y = int_red_Y?.getPointer(memScope).rawValue
        val _int_red_Z = int_red_Z?.getPointer(memScope).rawValue
        val _int_green_X = int_green_X?.getPointer(memScope).rawValue
        val _int_green_Y = int_green_Y?.getPointer(memScope).rawValue
        val _int_green_Z = int_green_Z?.getPointer(memScope).rawValue
        val _int_blue_X = int_blue_X?.getPointer(memScope).rawValue
        val _int_blue_Y = int_blue_Y?.getPointer(memScope).rawValue
        val _int_blue_Z = int_blue_Z?.getPointer(memScope).rawValue
        val res = kni_png_get_cHRM_XYZ_fixed(_png_ptr, _info_ptr, _int_red_X, _int_red_Y, _int_red_Z, _int_green_X, _int_green_Y, _int_green_Z, _int_blue_X, _int_blue_Y, _int_blue_Z)
        res
    }
}

@SymbolName("png_kni_png_get_cHRM_XYZ_fixed")
private external fun kni_png_get_cHRM_XYZ_fixed(png_ptr: NativePtr, info_ptr: NativePtr, int_red_X: NativePtr, int_red_Y: NativePtr, int_red_Z: NativePtr, int_green_X: NativePtr, int_green_Y: NativePtr, int_green_Z: NativePtr, int_blue_X: NativePtr, int_blue_Y: NativePtr, int_blue_Z: NativePtr): Int

fun png_set_cHRM(png_ptr: png_const_structrp?, info_ptr: png_inforp?, white_x: Double, white_y: Double, red_x: Double, red_y: Double, green_x: Double, green_y: Double, blue_x: Double, blue_y: Double): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _white_x = white_x
    val _white_y = white_y
    val _red_x = red_x
    val _red_y = red_y
    val _green_x = green_x
    val _green_y = green_y
    val _blue_x = blue_x
    val _blue_y = blue_y
    val res = kni_png_set_cHRM(_png_ptr, _info_ptr, _white_x, _white_y, _red_x, _red_y, _green_x, _green_y, _blue_x, _blue_y)
    return res
}

@SymbolName("png_kni_png_set_cHRM")
private external fun kni_png_set_cHRM(png_ptr: NativePtr, info_ptr: NativePtr, white_x: Double, white_y: Double, red_x: Double, red_y: Double, green_x: Double, green_y: Double, blue_x: Double, blue_y: Double): Unit

fun png_set_cHRM_XYZ(png_ptr: png_const_structrp?, info_ptr: png_inforp?, red_X: Double, red_Y: Double, red_Z: Double, green_X: Double, green_Y: Double, green_Z: Double, blue_X: Double, blue_Y: Double, blue_Z: Double): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _red_X = red_X
    val _red_Y = red_Y
    val _red_Z = red_Z
    val _green_X = green_X
    val _green_Y = green_Y
    val _green_Z = green_Z
    val _blue_X = blue_X
    val _blue_Y = blue_Y
    val _blue_Z = blue_Z
    val res = kni_png_set_cHRM_XYZ(_png_ptr, _info_ptr, _red_X, _red_Y, _red_Z, _green_X, _green_Y, _green_Z, _blue_X, _blue_Y, _blue_Z)
    return res
}

@SymbolName("png_kni_png_set_cHRM_XYZ")
private external fun kni_png_set_cHRM_XYZ(png_ptr: NativePtr, info_ptr: NativePtr, red_X: Double, red_Y: Double, red_Z: Double, green_X: Double, green_Y: Double, green_Z: Double, blue_X: Double, blue_Y: Double, blue_Z: Double): Unit

fun png_set_cHRM_fixed(png_ptr: png_const_structrp?, info_ptr: png_inforp?, int_white_x: png_fixed_point, int_white_y: png_fixed_point, int_red_x: png_fixed_point, int_red_y: png_fixed_point, int_green_x: png_fixed_point, int_green_y: png_fixed_point, int_blue_x: png_fixed_point, int_blue_y: png_fixed_point): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _int_white_x = int_white_x
    val _int_white_y = int_white_y
    val _int_red_x = int_red_x
    val _int_red_y = int_red_y
    val _int_green_x = int_green_x
    val _int_green_y = int_green_y
    val _int_blue_x = int_blue_x
    val _int_blue_y = int_blue_y
    val res = kni_png_set_cHRM_fixed(_png_ptr, _info_ptr, _int_white_x, _int_white_y, _int_red_x, _int_red_y, _int_green_x, _int_green_y, _int_blue_x, _int_blue_y)
    return res
}

@SymbolName("png_kni_png_set_cHRM_fixed")
private external fun kni_png_set_cHRM_fixed(png_ptr: NativePtr, info_ptr: NativePtr, int_white_x: Int, int_white_y: Int, int_red_x: Int, int_red_y: Int, int_green_x: Int, int_green_y: Int, int_blue_x: Int, int_blue_y: Int): Unit

fun png_set_cHRM_XYZ_fixed(png_ptr: png_const_structrp?, info_ptr: png_inforp?, int_red_X: png_fixed_point, int_red_Y: png_fixed_point, int_red_Z: png_fixed_point, int_green_X: png_fixed_point, int_green_Y: png_fixed_point, int_green_Z: png_fixed_point, int_blue_X: png_fixed_point, int_blue_Y: png_fixed_point, int_blue_Z: png_fixed_point): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _int_red_X = int_red_X
    val _int_red_Y = int_red_Y
    val _int_red_Z = int_red_Z
    val _int_green_X = int_green_X
    val _int_green_Y = int_green_Y
    val _int_green_Z = int_green_Z
    val _int_blue_X = int_blue_X
    val _int_blue_Y = int_blue_Y
    val _int_blue_Z = int_blue_Z
    val res = kni_png_set_cHRM_XYZ_fixed(_png_ptr, _info_ptr, _int_red_X, _int_red_Y, _int_red_Z, _int_green_X, _int_green_Y, _int_green_Z, _int_blue_X, _int_blue_Y, _int_blue_Z)
    return res
}

@SymbolName("png_kni_png_set_cHRM_XYZ_fixed")
private external fun kni_png_set_cHRM_XYZ_fixed(png_ptr: NativePtr, info_ptr: NativePtr, int_red_X: Int, int_red_Y: Int, int_red_Z: Int, int_green_X: Int, int_green_Y: Int, int_green_Z: Int, int_blue_X: Int, int_blue_Y: Int, int_blue_Z: Int): Unit

fun png_get_gAMA(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, file_gamma: CValuesRef<DoubleVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _file_gamma = file_gamma?.getPointer(memScope).rawValue
        val res = kni_png_get_gAMA(_png_ptr, _info_ptr, _file_gamma)
        res
    }
}

@SymbolName("png_kni_png_get_gAMA")
private external fun kni_png_get_gAMA(png_ptr: NativePtr, info_ptr: NativePtr, file_gamma: NativePtr): Int

fun png_get_gAMA_fixed(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, int_file_gamma: CValuesRef<png_fixed_pointVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _int_file_gamma = int_file_gamma?.getPointer(memScope).rawValue
        val res = kni_png_get_gAMA_fixed(_png_ptr, _info_ptr, _int_file_gamma)
        res
    }
}

@SymbolName("png_kni_png_get_gAMA_fixed")
private external fun kni_png_get_gAMA_fixed(png_ptr: NativePtr, info_ptr: NativePtr, int_file_gamma: NativePtr): Int

fun png_set_gAMA(png_ptr: png_const_structrp?, info_ptr: png_inforp?, file_gamma: Double): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _file_gamma = file_gamma
    val res = kni_png_set_gAMA(_png_ptr, _info_ptr, _file_gamma)
    return res
}

@SymbolName("png_kni_png_set_gAMA")
private external fun kni_png_set_gAMA(png_ptr: NativePtr, info_ptr: NativePtr, file_gamma: Double): Unit

fun png_set_gAMA_fixed(png_ptr: png_const_structrp?, info_ptr: png_inforp?, int_file_gamma: png_fixed_point): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _int_file_gamma = int_file_gamma
    val res = kni_png_set_gAMA_fixed(_png_ptr, _info_ptr, _int_file_gamma)
    return res
}

@SymbolName("png_kni_png_set_gAMA_fixed")
private external fun kni_png_set_gAMA_fixed(png_ptr: NativePtr, info_ptr: NativePtr, int_file_gamma: Int): Unit

fun png_get_hIST(png_ptr: png_const_structrp?, info_ptr: png_inforp?, hist: CValuesRef<png_uint_16pVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _hist = hist?.getPointer(memScope).rawValue
        val res = kni_png_get_hIST(_png_ptr, _info_ptr, _hist)
        res
    }
}

@SymbolName("png_kni_png_get_hIST")
private external fun kni_png_get_hIST(png_ptr: NativePtr, info_ptr: NativePtr, hist: NativePtr): Int

fun png_set_hIST(png_ptr: png_const_structrp?, info_ptr: png_inforp?, hist: png_const_uint_16p?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _hist = hist.rawValue
    val res = kni_png_set_hIST(_png_ptr, _info_ptr, _hist)
    return res
}

@SymbolName("png_kni_png_set_hIST")
private external fun kni_png_set_hIST(png_ptr: NativePtr, info_ptr: NativePtr, hist: NativePtr): Unit

fun png_get_IHDR(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, width: CValuesRef<png_uint_32Var>?, height: CValuesRef<png_uint_32Var>?, bit_depth: CValuesRef<IntVar>?, color_type: CValuesRef<IntVar>?, interlace_method: CValuesRef<IntVar>?, compression_method: CValuesRef<IntVar>?, filter_method: CValuesRef<IntVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _width = width?.getPointer(memScope).rawValue
        val _height = height?.getPointer(memScope).rawValue
        val _bit_depth = bit_depth?.getPointer(memScope).rawValue
        val _color_type = color_type?.getPointer(memScope).rawValue
        val _interlace_method = interlace_method?.getPointer(memScope).rawValue
        val _compression_method = compression_method?.getPointer(memScope).rawValue
        val _filter_method = filter_method?.getPointer(memScope).rawValue
        val res = kni_png_get_IHDR(_png_ptr, _info_ptr, _width, _height, _bit_depth, _color_type, _interlace_method, _compression_method, _filter_method)
        res
    }
}

@SymbolName("png_kni_png_get_IHDR")
private external fun kni_png_get_IHDR(png_ptr: NativePtr, info_ptr: NativePtr, width: NativePtr, height: NativePtr, bit_depth: NativePtr, color_type: NativePtr, interlace_method: NativePtr, compression_method: NativePtr, filter_method: NativePtr): Int

fun png_set_IHDR(png_ptr: png_const_structrp?, info_ptr: png_inforp?, width: png_uint_32, height: png_uint_32, bit_depth: Int, color_type: Int, interlace_method: Int, compression_method: Int, filter_method: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _width = width
    val _height = height
    val _bit_depth = bit_depth
    val _color_type = color_type
    val _interlace_method = interlace_method
    val _compression_method = compression_method
    val _filter_method = filter_method
    val res = kni_png_set_IHDR(_png_ptr, _info_ptr, _width, _height, _bit_depth, _color_type, _interlace_method, _compression_method, _filter_method)
    return res
}

@SymbolName("png_kni_png_set_IHDR")
private external fun kni_png_set_IHDR(png_ptr: NativePtr, info_ptr: NativePtr, width: Int, height: Int, bit_depth: Int, color_type: Int, interlace_method: Int, compression_method: Int, filter_method: Int): Unit

fun png_get_oFFs(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, offset_x: CValuesRef<png_int_32Var>?, offset_y: CValuesRef<png_int_32Var>?, unit_type: CValuesRef<IntVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _offset_x = offset_x?.getPointer(memScope).rawValue
        val _offset_y = offset_y?.getPointer(memScope).rawValue
        val _unit_type = unit_type?.getPointer(memScope).rawValue
        val res = kni_png_get_oFFs(_png_ptr, _info_ptr, _offset_x, _offset_y, _unit_type)
        res
    }
}

@SymbolName("png_kni_png_get_oFFs")
private external fun kni_png_get_oFFs(png_ptr: NativePtr, info_ptr: NativePtr, offset_x: NativePtr, offset_y: NativePtr, unit_type: NativePtr): Int

fun png_set_oFFs(png_ptr: png_const_structrp?, info_ptr: png_inforp?, offset_x: png_int_32, offset_y: png_int_32, unit_type: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _offset_x = offset_x
    val _offset_y = offset_y
    val _unit_type = unit_type
    val res = kni_png_set_oFFs(_png_ptr, _info_ptr, _offset_x, _offset_y, _unit_type)
    return res
}

@SymbolName("png_kni_png_set_oFFs")
private external fun kni_png_set_oFFs(png_ptr: NativePtr, info_ptr: NativePtr, offset_x: Int, offset_y: Int, unit_type: Int): Unit

fun png_get_pCAL(png_ptr: png_const_structrp?, info_ptr: png_inforp?, purpose: CValuesRef<png_charpVar>?, X0: CValuesRef<png_int_32Var>?, X1: CValuesRef<png_int_32Var>?, type: CValuesRef<IntVar>?, nparams: CValuesRef<IntVar>?, units: CValuesRef<png_charpVar>?, params: CValuesRef<png_charppVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _purpose = purpose?.getPointer(memScope).rawValue
        val _X0 = X0?.getPointer(memScope).rawValue
        val _X1 = X1?.getPointer(memScope).rawValue
        val _type = type?.getPointer(memScope).rawValue
        val _nparams = nparams?.getPointer(memScope).rawValue
        val _units = units?.getPointer(memScope).rawValue
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_png_get_pCAL(_png_ptr, _info_ptr, _purpose, _X0, _X1, _type, _nparams, _units, _params)
        res
    }
}

@SymbolName("png_kni_png_get_pCAL")
private external fun kni_png_get_pCAL(png_ptr: NativePtr, info_ptr: NativePtr, purpose: NativePtr, X0: NativePtr, X1: NativePtr, type: NativePtr, nparams: NativePtr, units: NativePtr, params: NativePtr): Int

fun png_set_pCAL(png_ptr: png_const_structrp?, info_ptr: png_inforp?, purpose: String?, X0: png_int_32, X1: png_int_32, type: Int, nparams: Int, units: String?, params: png_charpp?): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _purpose = purpose?.cstr?.getPointer(memScope).rawValue
        val _X0 = X0
        val _X1 = X1
        val _type = type
        val _nparams = nparams
        val _units = units?.cstr?.getPointer(memScope).rawValue
        val _params = params.rawValue
        val res = kni_png_set_pCAL(_png_ptr, _info_ptr, _purpose, _X0, _X1, _type, _nparams, _units, _params)
        res
    }
}

@SymbolName("png_kni_png_set_pCAL")
private external fun kni_png_set_pCAL(png_ptr: NativePtr, info_ptr: NativePtr, purpose: NativePtr, X0: Int, X1: Int, type: Int, nparams: Int, units: NativePtr, params: NativePtr): Unit

fun png_get_pHYs(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, res_x: CValuesRef<png_uint_32Var>?, res_y: CValuesRef<png_uint_32Var>?, unit_type: CValuesRef<IntVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _res_x = res_x?.getPointer(memScope).rawValue
        val _res_y = res_y?.getPointer(memScope).rawValue
        val _unit_type = unit_type?.getPointer(memScope).rawValue
        val res = kni_png_get_pHYs(_png_ptr, _info_ptr, _res_x, _res_y, _unit_type)
        res
    }
}

@SymbolName("png_kni_png_get_pHYs")
private external fun kni_png_get_pHYs(png_ptr: NativePtr, info_ptr: NativePtr, res_x: NativePtr, res_y: NativePtr, unit_type: NativePtr): Int

fun png_set_pHYs(png_ptr: png_const_structrp?, info_ptr: png_inforp?, res_x: png_uint_32, res_y: png_uint_32, unit_type: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _res_x = res_x
    val _res_y = res_y
    val _unit_type = unit_type
    val res = kni_png_set_pHYs(_png_ptr, _info_ptr, _res_x, _res_y, _unit_type)
    return res
}

@SymbolName("png_kni_png_set_pHYs")
private external fun kni_png_set_pHYs(png_ptr: NativePtr, info_ptr: NativePtr, res_x: Int, res_y: Int, unit_type: Int): Unit

fun png_get_PLTE(png_ptr: png_const_structrp?, info_ptr: png_inforp?, palette: CValuesRef<png_colorpVar>?, num_palette: CValuesRef<IntVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _palette = palette?.getPointer(memScope).rawValue
        val _num_palette = num_palette?.getPointer(memScope).rawValue
        val res = kni_png_get_PLTE(_png_ptr, _info_ptr, _palette, _num_palette)
        res
    }
}

@SymbolName("png_kni_png_get_PLTE")
private external fun kni_png_get_PLTE(png_ptr: NativePtr, info_ptr: NativePtr, palette: NativePtr, num_palette: NativePtr): Int

fun png_set_PLTE(png_ptr: png_structrp?, info_ptr: png_inforp?, palette: png_const_colorp?, num_palette: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _palette = palette.rawValue
    val _num_palette = num_palette
    val res = kni_png_set_PLTE(_png_ptr, _info_ptr, _palette, _num_palette)
    return res
}

@SymbolName("png_kni_png_set_PLTE")
private external fun kni_png_set_PLTE(png_ptr: NativePtr, info_ptr: NativePtr, palette: NativePtr, num_palette: Int): Unit

fun png_get_sBIT(png_ptr: png_const_structrp?, info_ptr: png_inforp?, sig_bit: CValuesRef<png_color_8pVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _sig_bit = sig_bit?.getPointer(memScope).rawValue
        val res = kni_png_get_sBIT(_png_ptr, _info_ptr, _sig_bit)
        res
    }
}

@SymbolName("png_kni_png_get_sBIT")
private external fun kni_png_get_sBIT(png_ptr: NativePtr, info_ptr: NativePtr, sig_bit: NativePtr): Int

fun png_set_sBIT(png_ptr: png_const_structrp?, info_ptr: png_inforp?, sig_bit: png_const_color_8p?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _sig_bit = sig_bit.rawValue
    val res = kni_png_set_sBIT(_png_ptr, _info_ptr, _sig_bit)
    return res
}

@SymbolName("png_kni_png_set_sBIT")
private external fun kni_png_set_sBIT(png_ptr: NativePtr, info_ptr: NativePtr, sig_bit: NativePtr): Unit

fun png_get_sRGB(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, file_srgb_intent: CValuesRef<IntVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _file_srgb_intent = file_srgb_intent?.getPointer(memScope).rawValue
        val res = kni_png_get_sRGB(_png_ptr, _info_ptr, _file_srgb_intent)
        res
    }
}

@SymbolName("png_kni_png_get_sRGB")
private external fun kni_png_get_sRGB(png_ptr: NativePtr, info_ptr: NativePtr, file_srgb_intent: NativePtr): Int

fun png_set_sRGB(png_ptr: png_const_structrp?, info_ptr: png_inforp?, srgb_intent: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _srgb_intent = srgb_intent
    val res = kni_png_set_sRGB(_png_ptr, _info_ptr, _srgb_intent)
    return res
}

@SymbolName("png_kni_png_set_sRGB")
private external fun kni_png_set_sRGB(png_ptr: NativePtr, info_ptr: NativePtr, srgb_intent: Int): Unit

fun png_set_sRGB_gAMA_and_cHRM(png_ptr: png_const_structrp?, info_ptr: png_inforp?, srgb_intent: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _srgb_intent = srgb_intent
    val res = kni_png_set_sRGB_gAMA_and_cHRM(_png_ptr, _info_ptr, _srgb_intent)
    return res
}

@SymbolName("png_kni_png_set_sRGB_gAMA_and_cHRM")
private external fun kni_png_set_sRGB_gAMA_and_cHRM(png_ptr: NativePtr, info_ptr: NativePtr, srgb_intent: Int): Unit

fun png_get_iCCP(png_ptr: png_const_structrp?, info_ptr: png_inforp?, name: png_charpp?, compression_type: CValuesRef<IntVar>?, profile: png_bytepp?, proflen: CValuesRef<png_uint_32Var>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _name = name.rawValue
        val _compression_type = compression_type?.getPointer(memScope).rawValue
        val _profile = profile.rawValue
        val _proflen = proflen?.getPointer(memScope).rawValue
        val res = kni_png_get_iCCP(_png_ptr, _info_ptr, _name, _compression_type, _profile, _proflen)
        res
    }
}

@SymbolName("png_kni_png_get_iCCP")
private external fun kni_png_get_iCCP(png_ptr: NativePtr, info_ptr: NativePtr, name: NativePtr, compression_type: NativePtr, profile: NativePtr, proflen: NativePtr): Int

fun png_set_iCCP(png_ptr: png_const_structrp?, info_ptr: png_inforp?, name: String?, compression_type: Int, profile: png_const_bytep?, proflen: png_uint_32): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _compression_type = compression_type
        val _profile = profile.rawValue
        val _proflen = proflen
        val res = kni_png_set_iCCP(_png_ptr, _info_ptr, _name, _compression_type, _profile, _proflen)
        res
    }
}

@SymbolName("png_kni_png_set_iCCP")
private external fun kni_png_set_iCCP(png_ptr: NativePtr, info_ptr: NativePtr, name: NativePtr, compression_type: Int, profile: NativePtr, proflen: Int): Unit

fun png_get_sPLT(png_ptr: png_const_structrp?, info_ptr: png_inforp?, entries: png_sPLT_tpp?): Int {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _entries = entries.rawValue
    val res = kni_png_get_sPLT(_png_ptr, _info_ptr, _entries)
    return res
}

@SymbolName("png_kni_png_get_sPLT")
private external fun kni_png_get_sPLT(png_ptr: NativePtr, info_ptr: NativePtr, entries: NativePtr): Int

fun png_set_sPLT(png_ptr: png_const_structrp?, info_ptr: png_inforp?, entries: png_const_sPLT_tp?, nentries: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _entries = entries.rawValue
    val _nentries = nentries
    val res = kni_png_set_sPLT(_png_ptr, _info_ptr, _entries, _nentries)
    return res
}

@SymbolName("png_kni_png_set_sPLT")
private external fun kni_png_set_sPLT(png_ptr: NativePtr, info_ptr: NativePtr, entries: NativePtr, nentries: Int): Unit

fun png_get_text(png_ptr: png_const_structrp?, info_ptr: png_inforp?, text_ptr: CValuesRef<png_textpVar>?, num_text: CValuesRef<IntVar>?): Int {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _text_ptr = text_ptr?.getPointer(memScope).rawValue
        val _num_text = num_text?.getPointer(memScope).rawValue
        val res = kni_png_get_text(_png_ptr, _info_ptr, _text_ptr, _num_text)
        res
    }
}

@SymbolName("png_kni_png_get_text")
private external fun kni_png_get_text(png_ptr: NativePtr, info_ptr: NativePtr, text_ptr: NativePtr, num_text: NativePtr): Int

fun png_set_text(png_ptr: png_const_structrp?, info_ptr: png_inforp?, text_ptr: png_const_textp?, num_text: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _text_ptr = text_ptr.rawValue
    val _num_text = num_text
    val res = kni_png_set_text(_png_ptr, _info_ptr, _text_ptr, _num_text)
    return res
}

@SymbolName("png_kni_png_set_text")
private external fun kni_png_set_text(png_ptr: NativePtr, info_ptr: NativePtr, text_ptr: NativePtr, num_text: Int): Unit

fun png_get_tIME(png_ptr: png_const_structrp?, info_ptr: png_inforp?, mod_time: CValuesRef<png_timepVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _mod_time = mod_time?.getPointer(memScope).rawValue
        val res = kni_png_get_tIME(_png_ptr, _info_ptr, _mod_time)
        res
    }
}

@SymbolName("png_kni_png_get_tIME")
private external fun kni_png_get_tIME(png_ptr: NativePtr, info_ptr: NativePtr, mod_time: NativePtr): Int

fun png_set_tIME(png_ptr: png_const_structrp?, info_ptr: png_inforp?, mod_time: png_const_timep?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _mod_time = mod_time.rawValue
    val res = kni_png_set_tIME(_png_ptr, _info_ptr, _mod_time)
    return res
}

@SymbolName("png_kni_png_set_tIME")
private external fun kni_png_set_tIME(png_ptr: NativePtr, info_ptr: NativePtr, mod_time: NativePtr): Unit

fun png_get_tRNS(png_ptr: png_const_structrp?, info_ptr: png_inforp?, trans_alpha: CValuesRef<png_bytepVar>?, num_trans: CValuesRef<IntVar>?, trans_color: CValuesRef<png_color_16pVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _trans_alpha = trans_alpha?.getPointer(memScope).rawValue
        val _num_trans = num_trans?.getPointer(memScope).rawValue
        val _trans_color = trans_color?.getPointer(memScope).rawValue
        val res = kni_png_get_tRNS(_png_ptr, _info_ptr, _trans_alpha, _num_trans, _trans_color)
        res
    }
}

@SymbolName("png_kni_png_get_tRNS")
private external fun kni_png_get_tRNS(png_ptr: NativePtr, info_ptr: NativePtr, trans_alpha: NativePtr, num_trans: NativePtr, trans_color: NativePtr): Int

fun png_set_tRNS(png_ptr: png_structrp?, info_ptr: png_inforp?, trans_alpha: png_const_bytep?, num_trans: Int, trans_color: png_const_color_16p?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _trans_alpha = trans_alpha.rawValue
    val _num_trans = num_trans
    val _trans_color = trans_color.rawValue
    val res = kni_png_set_tRNS(_png_ptr, _info_ptr, _trans_alpha, _num_trans, _trans_color)
    return res
}

@SymbolName("png_kni_png_set_tRNS")
private external fun kni_png_set_tRNS(png_ptr: NativePtr, info_ptr: NativePtr, trans_alpha: NativePtr, num_trans: Int, trans_color: NativePtr): Unit

fun png_get_sCAL(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, unit: CValuesRef<IntVar>?, width: CValuesRef<DoubleVar>?, height: CValuesRef<DoubleVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _unit = unit?.getPointer(memScope).rawValue
        val _width = width?.getPointer(memScope).rawValue
        val _height = height?.getPointer(memScope).rawValue
        val res = kni_png_get_sCAL(_png_ptr, _info_ptr, _unit, _width, _height)
        res
    }
}

@SymbolName("png_kni_png_get_sCAL")
private external fun kni_png_get_sCAL(png_ptr: NativePtr, info_ptr: NativePtr, unit: NativePtr, width: NativePtr, height: NativePtr): Int

fun png_get_sCAL_fixed(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, unit: CValuesRef<IntVar>?, width: CValuesRef<png_fixed_pointVar>?, height: CValuesRef<png_fixed_pointVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _unit = unit?.getPointer(memScope).rawValue
        val _width = width?.getPointer(memScope).rawValue
        val _height = height?.getPointer(memScope).rawValue
        val res = kni_png_get_sCAL_fixed(_png_ptr, _info_ptr, _unit, _width, _height)
        res
    }
}

@SymbolName("png_kni_png_get_sCAL_fixed")
private external fun kni_png_get_sCAL_fixed(png_ptr: NativePtr, info_ptr: NativePtr, unit: NativePtr, width: NativePtr, height: NativePtr): Int

fun png_get_sCAL_s(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, unit: CValuesRef<IntVar>?, swidth: png_charpp?, sheight: png_charpp?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _unit = unit?.getPointer(memScope).rawValue
        val _swidth = swidth.rawValue
        val _sheight = sheight.rawValue
        val res = kni_png_get_sCAL_s(_png_ptr, _info_ptr, _unit, _swidth, _sheight)
        res
    }
}

@SymbolName("png_kni_png_get_sCAL_s")
private external fun kni_png_get_sCAL_s(png_ptr: NativePtr, info_ptr: NativePtr, unit: NativePtr, swidth: NativePtr, sheight: NativePtr): Int

fun png_set_sCAL(png_ptr: png_const_structrp?, info_ptr: png_inforp?, unit: Int, width: Double, height: Double): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _unit = unit
    val _width = width
    val _height = height
    val res = kni_png_set_sCAL(_png_ptr, _info_ptr, _unit, _width, _height)
    return res
}

@SymbolName("png_kni_png_set_sCAL")
private external fun kni_png_set_sCAL(png_ptr: NativePtr, info_ptr: NativePtr, unit: Int, width: Double, height: Double): Unit

fun png_set_sCAL_fixed(png_ptr: png_const_structrp?, info_ptr: png_inforp?, unit: Int, width: png_fixed_point, height: png_fixed_point): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _unit = unit
    val _width = width
    val _height = height
    val res = kni_png_set_sCAL_fixed(_png_ptr, _info_ptr, _unit, _width, _height)
    return res
}

@SymbolName("png_kni_png_set_sCAL_fixed")
private external fun kni_png_set_sCAL_fixed(png_ptr: NativePtr, info_ptr: NativePtr, unit: Int, width: Int, height: Int): Unit

fun png_set_sCAL_s(png_ptr: png_const_structrp?, info_ptr: png_inforp?, unit: Int, swidth: String?, sheight: String?): Unit {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _unit = unit
        val _swidth = swidth?.cstr?.getPointer(memScope).rawValue
        val _sheight = sheight?.cstr?.getPointer(memScope).rawValue
        val res = kni_png_set_sCAL_s(_png_ptr, _info_ptr, _unit, _swidth, _sheight)
        res
    }
}

@SymbolName("png_kni_png_set_sCAL_s")
private external fun kni_png_set_sCAL_s(png_ptr: NativePtr, info_ptr: NativePtr, unit: Int, swidth: NativePtr, sheight: NativePtr): Unit

fun png_set_keep_unknown_chunks(png_ptr: png_structrp?, keep: Int, chunk_list: png_const_bytep?, num_chunks: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _keep = keep
    val _chunk_list = chunk_list.rawValue
    val _num_chunks = num_chunks
    val res = kni_png_set_keep_unknown_chunks(_png_ptr, _keep, _chunk_list, _num_chunks)
    return res
}

@SymbolName("png_kni_png_set_keep_unknown_chunks")
private external fun kni_png_set_keep_unknown_chunks(png_ptr: NativePtr, keep: Int, chunk_list: NativePtr, num_chunks: Int): Unit

fun png_handle_as_unknown(png_ptr: png_const_structrp?, chunk_name: png_const_bytep?): Int {
    val _png_ptr = png_ptr.rawValue
    val _chunk_name = chunk_name.rawValue
    val res = kni_png_handle_as_unknown(_png_ptr, _chunk_name)
    return res
}

@SymbolName("png_kni_png_handle_as_unknown")
private external fun kni_png_handle_as_unknown(png_ptr: NativePtr, chunk_name: NativePtr): Int

fun png_set_unknown_chunks(png_ptr: png_const_structrp?, info_ptr: png_inforp?, unknowns: png_const_unknown_chunkp?, num_unknowns: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _unknowns = unknowns.rawValue
    val _num_unknowns = num_unknowns
    val res = kni_png_set_unknown_chunks(_png_ptr, _info_ptr, _unknowns, _num_unknowns)
    return res
}

@SymbolName("png_kni_png_set_unknown_chunks")
private external fun kni_png_set_unknown_chunks(png_ptr: NativePtr, info_ptr: NativePtr, unknowns: NativePtr, num_unknowns: Int): Unit

fun png_set_unknown_chunk_location(png_ptr: png_const_structrp?, info_ptr: png_inforp?, chunk: Int, location: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _chunk = chunk
    val _location = location
    val res = kni_png_set_unknown_chunk_location(_png_ptr, _info_ptr, _chunk, _location)
    return res
}

@SymbolName("png_kni_png_set_unknown_chunk_location")
private external fun kni_png_set_unknown_chunk_location(png_ptr: NativePtr, info_ptr: NativePtr, chunk: Int, location: Int): Unit

fun png_get_unknown_chunks(png_ptr: png_const_structrp?, info_ptr: png_inforp?, entries: png_unknown_chunkpp?): Int {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _entries = entries.rawValue
    val res = kni_png_get_unknown_chunks(_png_ptr, _info_ptr, _entries)
    return res
}

@SymbolName("png_kni_png_get_unknown_chunks")
private external fun kni_png_get_unknown_chunks(png_ptr: NativePtr, info_ptr: NativePtr, entries: NativePtr): Int

fun png_set_invalid(png_ptr: png_const_structrp?, info_ptr: png_inforp?, mask: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _mask = mask
    val res = kni_png_set_invalid(_png_ptr, _info_ptr, _mask)
    return res
}

@SymbolName("png_kni_png_set_invalid")
private external fun kni_png_set_invalid(png_ptr: NativePtr, info_ptr: NativePtr, mask: Int): Unit

fun png_read_png(png_ptr: png_structrp?, info_ptr: png_inforp?, transforms: Int, params: png_voidp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _transforms = transforms
    val _params = params.rawValue
    val res = kni_png_read_png(_png_ptr, _info_ptr, _transforms, _params)
    return res
}

@SymbolName("png_kni_png_read_png")
private external fun kni_png_read_png(png_ptr: NativePtr, info_ptr: NativePtr, transforms: Int, params: NativePtr): Unit

fun png_write_png(png_ptr: png_structrp?, info_ptr: png_inforp?, transforms: Int, params: png_voidp?): Unit {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val _transforms = transforms
    val _params = params.rawValue
    val res = kni_png_write_png(_png_ptr, _info_ptr, _transforms, _params)
    return res
}

@SymbolName("png_kni_png_write_png")
private external fun kni_png_write_png(png_ptr: NativePtr, info_ptr: NativePtr, transforms: Int, params: NativePtr): Unit

fun png_get_copyright(png_ptr: png_const_structrp?): png_const_charp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_copyright(_png_ptr)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("png_kni_png_get_copyright")
private external fun kni_png_get_copyright(png_ptr: NativePtr): NativePtr

fun png_get_header_ver(png_ptr: png_const_structrp?): png_const_charp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_header_ver(_png_ptr)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("png_kni_png_get_header_ver")
private external fun kni_png_get_header_ver(png_ptr: NativePtr): NativePtr

fun png_get_header_version(png_ptr: png_const_structrp?): png_const_charp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_header_version(_png_ptr)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("png_kni_png_get_header_version")
private external fun kni_png_get_header_version(png_ptr: NativePtr): NativePtr

fun png_get_libpng_ver(png_ptr: png_const_structrp?): png_const_charp? {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_libpng_ver(_png_ptr)
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("png_kni_png_get_libpng_ver")
private external fun kni_png_get_libpng_ver(png_ptr: NativePtr): NativePtr

fun png_permit_mng_features(png_ptr: png_structrp?, mng_features_permitted: png_uint_32): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _mng_features_permitted = mng_features_permitted
    val res = kni_png_permit_mng_features(_png_ptr, _mng_features_permitted)
    return res
}

@SymbolName("png_kni_png_permit_mng_features")
private external fun kni_png_permit_mng_features(png_ptr: NativePtr, mng_features_permitted: Int): Int

fun png_set_user_limits(png_ptr: png_structrp?, user_width_max: png_uint_32, user_height_max: png_uint_32): Unit {
    val _png_ptr = png_ptr.rawValue
    val _user_width_max = user_width_max
    val _user_height_max = user_height_max
    val res = kni_png_set_user_limits(_png_ptr, _user_width_max, _user_height_max)
    return res
}

@SymbolName("png_kni_png_set_user_limits")
private external fun kni_png_set_user_limits(png_ptr: NativePtr, user_width_max: Int, user_height_max: Int): Unit

fun png_get_user_width_max(png_ptr: png_const_structrp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_user_width_max(_png_ptr)
    return res
}

@SymbolName("png_kni_png_get_user_width_max")
private external fun kni_png_get_user_width_max(png_ptr: NativePtr): Int

fun png_get_user_height_max(png_ptr: png_const_structrp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_user_height_max(_png_ptr)
    return res
}

@SymbolName("png_kni_png_get_user_height_max")
private external fun kni_png_get_user_height_max(png_ptr: NativePtr): Int

fun png_set_chunk_cache_max(png_ptr: png_structrp?, user_chunk_cache_max: png_uint_32): Unit {
    val _png_ptr = png_ptr.rawValue
    val _user_chunk_cache_max = user_chunk_cache_max
    val res = kni_png_set_chunk_cache_max(_png_ptr, _user_chunk_cache_max)
    return res
}

@SymbolName("png_kni_png_set_chunk_cache_max")
private external fun kni_png_set_chunk_cache_max(png_ptr: NativePtr, user_chunk_cache_max: Int): Unit

fun png_get_chunk_cache_max(png_ptr: png_const_structrp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_chunk_cache_max(_png_ptr)
    return res
}

@SymbolName("png_kni_png_get_chunk_cache_max")
private external fun kni_png_get_chunk_cache_max(png_ptr: NativePtr): Int

fun png_set_chunk_malloc_max(png_ptr: png_structrp?, user_chunk_cache_max: png_alloc_size_t): Unit {
    val _png_ptr = png_ptr.rawValue
    val _user_chunk_cache_max = user_chunk_cache_max
    val res = kni_png_set_chunk_malloc_max(_png_ptr, _user_chunk_cache_max)
    return res
}

@SymbolName("png_kni_png_set_chunk_malloc_max")
private external fun kni_png_set_chunk_malloc_max(png_ptr: NativePtr, user_chunk_cache_max: Long): Unit

fun png_get_chunk_malloc_max(png_ptr: png_const_structrp?): png_alloc_size_t {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_chunk_malloc_max(_png_ptr)
    return res
}

@SymbolName("png_kni_png_get_chunk_malloc_max")
private external fun kni_png_get_chunk_malloc_max(png_ptr: NativePtr): Long

fun png_get_pixels_per_inch(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_pixels_per_inch(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_pixels_per_inch")
private external fun kni_png_get_pixels_per_inch(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_x_pixels_per_inch(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_x_pixels_per_inch(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_x_pixels_per_inch")
private external fun kni_png_get_x_pixels_per_inch(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_y_pixels_per_inch(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_y_pixels_per_inch(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_y_pixels_per_inch")
private external fun kni_png_get_y_pixels_per_inch(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_x_offset_inches(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): Float {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_x_offset_inches(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_x_offset_inches")
private external fun kni_png_get_x_offset_inches(png_ptr: NativePtr, info_ptr: NativePtr): Float

fun png_get_x_offset_inches_fixed(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_fixed_point {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_x_offset_inches_fixed(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_x_offset_inches_fixed")
private external fun kni_png_get_x_offset_inches_fixed(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_y_offset_inches(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): Float {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_y_offset_inches(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_y_offset_inches")
private external fun kni_png_get_y_offset_inches(png_ptr: NativePtr, info_ptr: NativePtr): Float

fun png_get_y_offset_inches_fixed(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?): png_fixed_point {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_y_offset_inches_fixed(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_y_offset_inches_fixed")
private external fun kni_png_get_y_offset_inches_fixed(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_get_pHYs_dpi(png_ptr: png_const_structrp?, info_ptr: png_const_inforp?, res_x: CValuesRef<png_uint_32Var>?, res_y: CValuesRef<png_uint_32Var>?, unit_type: CValuesRef<IntVar>?): png_uint_32 {
    return memScoped {
        val _png_ptr = png_ptr.rawValue
        val _info_ptr = info_ptr.rawValue
        val _res_x = res_x?.getPointer(memScope).rawValue
        val _res_y = res_y?.getPointer(memScope).rawValue
        val _unit_type = unit_type?.getPointer(memScope).rawValue
        val res = kni_png_get_pHYs_dpi(_png_ptr, _info_ptr, _res_x, _res_y, _unit_type)
        res
    }
}

@SymbolName("png_kni_png_get_pHYs_dpi")
private external fun kni_png_get_pHYs_dpi(png_ptr: NativePtr, info_ptr: NativePtr, res_x: NativePtr, res_y: NativePtr, unit_type: NativePtr): Int

fun png_get_io_state(png_ptr: png_const_structrp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_io_state(_png_ptr)
    return res
}

@SymbolName("png_kni_png_get_io_state")
private external fun kni_png_get_io_state(png_ptr: NativePtr): Int

fun png_get_io_chunk_type(png_ptr: png_const_structrp?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val res = kni_png_get_io_chunk_type(_png_ptr)
    return res
}

@SymbolName("png_kni_png_get_io_chunk_type")
private external fun kni_png_get_io_chunk_type(png_ptr: NativePtr): Int

fun png_get_uint_32(buf: png_const_bytep?): png_uint_32 {
    val _buf = buf.rawValue
    val res = kni_png_get_uint_32(_buf)
    return res
}

@SymbolName("png_kni_png_get_uint_32")
private external fun kni_png_get_uint_32(buf: NativePtr): Int

fun png_get_uint_16(buf: png_const_bytep?): png_uint_16 {
    val _buf = buf.rawValue
    val res = kni_png_get_uint_16(_buf)
    return res
}

@SymbolName("png_kni_png_get_uint_16")
private external fun kni_png_get_uint_16(buf: NativePtr): Short

fun png_get_int_32(buf: png_const_bytep?): png_int_32 {
    val _buf = buf.rawValue
    val res = kni_png_get_int_32(_buf)
    return res
}

@SymbolName("png_kni_png_get_int_32")
private external fun kni_png_get_int_32(buf: NativePtr): Int

fun png_get_uint_31(png_ptr: png_const_structrp?, buf: png_const_bytep?): png_uint_32 {
    val _png_ptr = png_ptr.rawValue
    val _buf = buf.rawValue
    val res = kni_png_get_uint_31(_png_ptr, _buf)
    return res
}

@SymbolName("png_kni_png_get_uint_31")
private external fun kni_png_get_uint_31(png_ptr: NativePtr, buf: NativePtr): Int

fun png_save_uint_32(buf: png_bytep?, i: png_uint_32): Unit {
    val _buf = buf.rawValue
    val _i = i
    val res = kni_png_save_uint_32(_buf, _i)
    return res
}

@SymbolName("png_kni_png_save_uint_32")
private external fun kni_png_save_uint_32(buf: NativePtr, i: Int): Unit

fun png_save_int_32(buf: png_bytep?, i: png_int_32): Unit {
    val _buf = buf.rawValue
    val _i = i
    val res = kni_png_save_int_32(_buf, _i)
    return res
}

@SymbolName("png_kni_png_save_int_32")
private external fun kni_png_save_int_32(buf: NativePtr, i: Int): Unit

fun png_save_uint_16(buf: png_bytep?, i: Int): Unit {
    val _buf = buf.rawValue
    val _i = i
    val res = kni_png_save_uint_16(_buf, _i)
    return res
}

@SymbolName("png_kni_png_save_uint_16")
private external fun kni_png_save_uint_16(buf: NativePtr, i: Int): Unit

fun png_set_check_for_invalid_index(png_ptr: png_structrp?, allowed: Int): Unit {
    val _png_ptr = png_ptr.rawValue
    val _allowed = allowed
    val res = kni_png_set_check_for_invalid_index(_png_ptr, _allowed)
    return res
}

@SymbolName("png_kni_png_set_check_for_invalid_index")
private external fun kni_png_set_check_for_invalid_index(png_ptr: NativePtr, allowed: Int): Unit

fun png_get_palette_max(png_ptr: png_const_structp?, info_ptr: png_const_infop?): Int {
    val _png_ptr = png_ptr.rawValue
    val _info_ptr = info_ptr.rawValue
    val res = kni_png_get_palette_max(_png_ptr, _info_ptr)
    return res
}

@SymbolName("png_kni_png_get_palette_max")
private external fun kni_png_get_palette_max(png_ptr: NativePtr, info_ptr: NativePtr): Int

fun png_image_begin_read_from_file(image: png_imagep?, file_name: String?): Int {
    return memScoped {
        val _image = image.rawValue
        val _file_name = file_name?.cstr?.getPointer(memScope).rawValue
        val res = kni_png_image_begin_read_from_file(_image, _file_name)
        res
    }
}

@SymbolName("png_kni_png_image_begin_read_from_file")
private external fun kni_png_image_begin_read_from_file(image: NativePtr, file_name: NativePtr): Int

fun png_image_begin_read_from_stdio(image: png_imagep?, file: CValuesRef<FILE>?): Int {
    return memScoped {
        val _image = image.rawValue
        val _file = file?.getPointer(memScope).rawValue
        val res = kni_png_image_begin_read_from_stdio(_image, _file)
        res
    }
}

@SymbolName("png_kni_png_image_begin_read_from_stdio")
private external fun kni_png_image_begin_read_from_stdio(image: NativePtr, file: NativePtr): Int

fun png_image_begin_read_from_memory(image: png_imagep?, memory: png_const_voidp?, size: png_size_t): Int {
    val _image = image.rawValue
    val _memory = memory.rawValue
    val _size = size
    val res = kni_png_image_begin_read_from_memory(_image, _memory, _size)
    return res
}

@SymbolName("png_kni_png_image_begin_read_from_memory")
private external fun kni_png_image_begin_read_from_memory(image: NativePtr, memory: NativePtr, size: Long): Int

fun png_image_finish_read(image: png_imagep?, background: png_const_colorp?, buffer: COpaquePointer?, row_stride: png_int_32, colormap: COpaquePointer?): Int {
    val _image = image.rawValue
    val _background = background.rawValue
    val _buffer = buffer.rawValue
    val _row_stride = row_stride
    val _colormap = colormap.rawValue
    val res = kni_png_image_finish_read(_image, _background, _buffer, _row_stride, _colormap)
    return res
}

@SymbolName("png_kni_png_image_finish_read")
private external fun kni_png_image_finish_read(image: NativePtr, background: NativePtr, buffer: NativePtr, row_stride: Int, colormap: NativePtr): Int

fun png_image_free(image: png_imagep?): Unit {
    val _image = image.rawValue
    val res = kni_png_image_free(_image)
    return res
}

@SymbolName("png_kni_png_image_free")
private external fun kni_png_image_free(image: NativePtr): Unit

fun png_image_write_to_file(image: png_imagep?, file: String?, convert_to_8bit: Int, buffer: COpaquePointer?, row_stride: png_int_32, colormap: COpaquePointer?): Int {
    return memScoped {
        val _image = image.rawValue
        val _file = file?.cstr?.getPointer(memScope).rawValue
        val _convert_to_8bit = convert_to_8bit
        val _buffer = buffer.rawValue
        val _row_stride = row_stride
        val _colormap = colormap.rawValue
        val res = kni_png_image_write_to_file(_image, _file, _convert_to_8bit, _buffer, _row_stride, _colormap)
        res
    }
}

@SymbolName("png_kni_png_image_write_to_file")
private external fun kni_png_image_write_to_file(image: NativePtr, file: NativePtr, convert_to_8bit: Int, buffer: NativePtr, row_stride: Int, colormap: NativePtr): Int

fun png_image_write_to_stdio(image: png_imagep?, file: CValuesRef<FILE>?, convert_to_8_bit: Int, buffer: COpaquePointer?, row_stride: png_int_32, colormap: COpaquePointer?): Int {
    return memScoped {
        val _image = image.rawValue
        val _file = file?.getPointer(memScope).rawValue
        val _convert_to_8_bit = convert_to_8_bit
        val _buffer = buffer.rawValue
        val _row_stride = row_stride
        val _colormap = colormap.rawValue
        val res = kni_png_image_write_to_stdio(_image, _file, _convert_to_8_bit, _buffer, _row_stride, _colormap)
        res
    }
}

@SymbolName("png_kni_png_image_write_to_stdio")
private external fun kni_png_image_write_to_stdio(image: NativePtr, file: NativePtr, convert_to_8_bit: Int, buffer: NativePtr, row_stride: Int, colormap: NativePtr): Int

fun png_image_write_to_memory(image: png_imagep?, memory: COpaquePointer?, memory_bytes: CValuesRef<png_alloc_size_tVar>?, convert_to_8_bit: Int, buffer: COpaquePointer?, row_stride: png_int_32, colormap: COpaquePointer?): Int {
    return memScoped {
        val _image = image.rawValue
        val _memory = memory.rawValue
        val _memory_bytes = memory_bytes?.getPointer(memScope).rawValue
        val _convert_to_8_bit = convert_to_8_bit
        val _buffer = buffer.rawValue
        val _row_stride = row_stride
        val _colormap = colormap.rawValue
        val res = kni_png_image_write_to_memory(_image, _memory, _memory_bytes, _convert_to_8_bit, _buffer, _row_stride, _colormap)
        res
    }
}

@SymbolName("png_kni_png_image_write_to_memory")
private external fun kni_png_image_write_to_memory(image: NativePtr, memory: NativePtr, memory_bytes: NativePtr, convert_to_8_bit: Int, buffer: NativePtr, row_stride: Int, colormap: NativePtr): Int

fun png_set_option(png_ptr: png_structrp?, option: Int, onoff: Int): Int {
    val _png_ptr = png_ptr.rawValue
    val _option = option
    val _onoff = onoff
    val res = kni_png_set_option(_png_ptr, _option, _onoff)
    return res
}

@SymbolName("png_kni_png_set_option")
private external fun kni_png_set_option(png_ptr: NativePtr, option: Int, onoff: Int): Int

val PNG_LIBPNG_VER_SONUM: Int = 16

val PNG_LIBPNG_VER_DLLNUM: Int = 16

val PNG_LIBPNG_VER_MAJOR: Int = 1

val PNG_LIBPNG_VER_MINOR: Int = 6

val PNG_LIBPNG_VER_RELEASE: Int = 29

val PNG_LIBPNG_VER_BUILD: Int = 0

val PNG_LIBPNG_BUILD_ALPHA: Int = 1

val PNG_LIBPNG_BUILD_BETA: Int = 2

val PNG_LIBPNG_BUILD_RC: Int = 3

val PNG_LIBPNG_BUILD_STABLE: Int = 4

val PNG_LIBPNG_BUILD_RELEASE_STATUS_MASK: Int = 7

val PNG_LIBPNG_BUILD_PATCH: Int = 8

val PNG_LIBPNG_BUILD_PRIVATE: Int = 16

val PNG_LIBPNG_BUILD_SPECIAL: Int = 32

val PNG_LIBPNG_BUILD_BASE_TYPE: Int = 4

val PNG_LIBPNG_VER: Int = 10629

val PNG_API_RULE: Int = 0

val PNG_DEFAULT_READ_MACROS: Int = 1

val PNG_GAMMA_THRESHOLD_FIXED: Int = 5000

val PNG_IDAT_READ_SIZE: Int = 8192

val PNG_INFLATE_BUF_SIZE: Int = 1024

val PNG_MAX_GAMMA_8: Int = 11

val PNG_QUANTIZE_BLUE_BITS: Int = 5

val PNG_QUANTIZE_GREEN_BITS: Int = 5

val PNG_QUANTIZE_RED_BITS: Int = 5

val PNG_TEXT_Z_DEFAULT_COMPRESSION: Int = -1

val PNG_TEXT_Z_DEFAULT_STRATEGY: Int = 0

val PNG_USER_CHUNK_CACHE_MAX: Int = 1000

val PNG_USER_CHUNK_MALLOC_MAX: Int = 8000000

val PNG_USER_HEIGHT_MAX: Int = 1000000

val PNG_USER_WIDTH_MAX: Int = 1000000

val PNG_ZBUF_SIZE: Int = 8192

val PNG_ZLIB_VERNUM: Int = 4736

val PNG_Z_DEFAULT_COMPRESSION: Int = -1

val PNG_Z_DEFAULT_NOFILTER_STRATEGY: Int = 0

val PNG_Z_DEFAULT_STRATEGY: Int = 1

val PNG_sCAL_PRECISION: Int = 5

val PNG_sRGB_PROFILE_CHECKS: Int = 2

val __DARWIN_ONLY_64_BIT_INO_T: Int = 0

val __DARWIN_ONLY_VERS_1050: Int = 0

val __DARWIN_ONLY_UNIX_CONFORMANCE: Int = 1

val __DARWIN_UNIX03: Int = 1

val __DARWIN_64_BIT_INO_T: Int = 1

val __DARWIN_VERS_1050: Int = 1

val __DARWIN_NON_CANCELABLE: Int = 0

val __DARWIN_C_ANSI: Long = 4096

val __DARWIN_C_FULL: Long = 900000

val __DARWIN_C_LEVEL: Long = 900000

val __STDC_WANT_LIB_EXT1__: Int = 1

val _DARWIN_FEATURE_64_BIT_INODE: Int = 1

val _DARWIN_FEATURE_ONLY_UNIX_CONFORMANCE: Int = 1

val _DARWIN_FEATURE_UNIX_CONFORMANCE: Int = 3

val __DARWIN_CLK_TCK: Int = 100

val CHAR_BIT: Int = 8

val MB_LEN_MAX: Int = 6

val CLK_TCK: Int = 100

val SCHAR_MAX: Int = 127

val SCHAR_MIN: Int = -128

val UCHAR_MAX: Int = 255

val CHAR_MAX: Int = 127

val CHAR_MIN: Int = -128

val USHRT_MAX: Int = 65535

val SHRT_MAX: Int = 32767

val SHRT_MIN: Int = -32768

val UINT_MAX: Int = -1

val INT_MAX: Int = 2147483647

val INT_MIN: Int = -2147483648

val ULONG_MAX: Long = -1

val LONG_MAX: Long = 9223372036854775807

val LONG_MIN: Long = -9223372036854775807 - 1

val ULLONG_MAX: Long = -1

val LLONG_MAX: Long = 9223372036854775807

val LLONG_MIN: Long = -9223372036854775807 - 1

val LONG_BIT: Int = 64

val SSIZE_MAX: Long = 9223372036854775807

val WORD_BIT: Int = 32

val SIZE_T_MAX: Long = -1

val UQUAD_MAX: Long = -1

val QUAD_MAX: Long = 9223372036854775807

val QUAD_MIN: Long = -9223372036854775807 - 1

val ARG_MAX: Int = 262144

val CHILD_MAX: Int = 266

val GID_MAX: Int = 2147483647

val LINK_MAX: Int = 32767

val MAX_CANON: Int = 1024

val MAX_INPUT: Int = 1024

val NAME_MAX: Int = 255

val NGROUPS_MAX: Int = 16

val UID_MAX: Int = 2147483647

val OPEN_MAX: Int = 10240

val PATH_MAX: Int = 1024

val PIPE_BUF: Int = 512

val BC_BASE_MAX: Int = 99

val BC_DIM_MAX: Int = 2048

val BC_SCALE_MAX: Int = 99

val BC_STRING_MAX: Int = 1000

val CHARCLASS_NAME_MAX: Int = 14

val COLL_WEIGHTS_MAX: Int = 2

val EQUIV_CLASS_MAX: Int = 2

val EXPR_NEST_MAX: Int = 32

val LINE_MAX: Int = 2048

val RE_DUP_MAX: Int = 255

val NZERO: Int = 20

val _POSIX_ARG_MAX: Int = 4096

val _POSIX_CHILD_MAX: Int = 25

val _POSIX_LINK_MAX: Int = 8

val _POSIX_MAX_CANON: Int = 255

val _POSIX_MAX_INPUT: Int = 255

val _POSIX_NAME_MAX: Int = 14

val _POSIX_NGROUPS_MAX: Int = 8

val _POSIX_OPEN_MAX: Int = 20

val _POSIX_PATH_MAX: Int = 256

val _POSIX_PIPE_BUF: Int = 512

val _POSIX_SSIZE_MAX: Int = 32767

val _POSIX_STREAM_MAX: Int = 8

val _POSIX_TZNAME_MAX: Int = 6

val _POSIX2_BC_BASE_MAX: Int = 99

val _POSIX2_BC_DIM_MAX: Int = 2048

val _POSIX2_BC_SCALE_MAX: Int = 99

val _POSIX2_BC_STRING_MAX: Int = 1000

val _POSIX2_EQUIV_CLASS_MAX: Int = 2

val _POSIX2_EXPR_NEST_MAX: Int = 32

val _POSIX2_LINE_MAX: Int = 2048

val _POSIX2_RE_DUP_MAX: Int = 255

val _POSIX_AIO_LISTIO_MAX: Int = 2

val _POSIX_AIO_MAX: Int = 1

val _POSIX_DELAYTIMER_MAX: Int = 32

val _POSIX_MQ_OPEN_MAX: Int = 8

val _POSIX_MQ_PRIO_MAX: Int = 32

val _POSIX_RTSIG_MAX: Int = 8

val _POSIX_SEM_NSEMS_MAX: Int = 256

val _POSIX_SEM_VALUE_MAX: Int = 32767

val _POSIX_SIGQUEUE_MAX: Int = 32

val _POSIX_TIMER_MAX: Int = 32

val _POSIX_THREAD_DESTRUCTOR_ITERATIONS: Int = 4

val _POSIX_THREAD_KEYS_MAX: Int = 128

val _POSIX_THREAD_THREADS_MAX: Int = 64

val PTHREAD_DESTRUCTOR_ITERATIONS: Int = 4

val PTHREAD_KEYS_MAX: Int = 512

val PTHREAD_STACK_MIN: Int = 8192

val _POSIX_HOST_NAME_MAX: Int = 255

val _POSIX_LOGIN_NAME_MAX: Int = 9

val _POSIX_SS_REPL_MAX: Int = 4

val _POSIX_SYMLINK_MAX: Int = 255

val _POSIX_SYMLOOP_MAX: Int = 8

val _POSIX_TRACE_EVENT_NAME_MAX: Int = 30

val _POSIX_TRACE_NAME_MAX: Int = 8

val _POSIX_TRACE_SYS_MAX: Int = 8

val _POSIX_TRACE_USER_EVENT_MAX: Int = 32

val _POSIX_TTY_NAME_MAX: Int = 9

val _POSIX2_CHARCLASS_NAME_MAX: Int = 14

val _POSIX2_COLL_WEIGHTS_MAX: Int = 2

val _POSIX_RE_DUP_MAX: Int = 255

val OFF_MIN: Long = -9223372036854775807 - 1

val OFF_MAX: Long = 9223372036854775807

val PASS_MAX: Int = 128

val NL_ARGMAX: Int = 9

val NL_LANGMAX: Int = 14

val NL_MSGMAX: Int = 32767

val NL_NMAX: Int = 1

val NL_SETMAX: Int = 255

val NL_TEXTMAX: Int = 2048

val _XOPEN_IOV_MAX: Int = 16

val IOV_MAX: Int = 1024

val _XOPEN_NAME_MAX: Int = 255

val _XOPEN_PATH_MAX: Int = 1024

val LONG_LONG_MAX: Long = 9223372036854775807

val LONG_LONG_MIN: Long = -9223372036854775807 - 1

val ULONG_LONG_MAX: Long = -1

val __MAC_10_0: Int = 1000

val __MAC_10_1: Int = 1010

val __MAC_10_2: Int = 1020

val __MAC_10_3: Int = 1030

val __MAC_10_4: Int = 1040

val __MAC_10_5: Int = 1050

val __MAC_10_6: Int = 1060

val __MAC_10_7: Int = 1070

val __MAC_10_8: Int = 1080

val __MAC_10_9: Int = 1090

val __MAC_10_10: Int = 101000

val __MAC_10_10_2: Int = 101002

val __MAC_10_10_3: Int = 101003

val __MAC_10_11: Int = 101100

val __MAC_10_11_2: Int = 101102

val __MAC_10_11_3: Int = 101103

val __MAC_10_11_4: Int = 101104

val __MAC_10_12: Int = 101200

val __IPHONE_2_0: Int = 20000

val __IPHONE_2_1: Int = 20100

val __IPHONE_2_2: Int = 20200

val __IPHONE_3_0: Int = 30000

val __IPHONE_3_1: Int = 30100

val __IPHONE_3_2: Int = 30200

val __IPHONE_4_0: Int = 40000

val __IPHONE_4_1: Int = 40100

val __IPHONE_4_2: Int = 40200

val __IPHONE_4_3: Int = 40300

val __IPHONE_5_0: Int = 50000

val __IPHONE_5_1: Int = 50100

val __IPHONE_6_0: Int = 60000

val __IPHONE_6_1: Int = 60100

val __IPHONE_7_0: Int = 70000

val __IPHONE_7_1: Int = 70100

val __IPHONE_8_0: Int = 80000

val __IPHONE_8_1: Int = 80100

val __IPHONE_8_2: Int = 80200

val __IPHONE_8_3: Int = 80300

val __IPHONE_8_4: Int = 80400

val __IPHONE_9_0: Int = 90000

val __IPHONE_9_1: Int = 90100

val __IPHONE_9_2: Int = 90200

val __IPHONE_9_3: Int = 90300

val __IPHONE_10_0: Int = 100000

val __TVOS_9_0: Int = 90000

val __TVOS_9_1: Int = 90100

val __TVOS_9_2: Int = 90200

val __TVOS_10_0: Int = 100000

val __WATCHOS_1_0: Int = 10000

val __WATCHOS_2_0: Int = 20000

val __WATCHOS_3_0: Int = 30000

val __MAC_OS_X_VERSION_MIN_REQUIRED: Int = 101100

val __MAC_OS_X_VERSION_MAX_ALLOWED: Int = 101200

val __PTHREAD_SIZE__: Int = 8176

val __PTHREAD_ATTR_SIZE__: Int = 56

val __PTHREAD_MUTEXATTR_SIZE__: Int = 8

val __PTHREAD_MUTEX_SIZE__: Int = 56

val __PTHREAD_CONDATTR_SIZE__: Int = 8

val __PTHREAD_COND_SIZE__: Int = 40

val __PTHREAD_ONCE_SIZE__: Int = 8

val __PTHREAD_RWLOCK_SIZE__: Int = 192

val __PTHREAD_RWLOCKATTR_SIZE__: Int = 16

val __DARWIN_WCHAR_MAX: Int = 2147483647

val __DARWIN_WCHAR_MIN: Int = -2147483648

val __DARWIN_WEOF: __darwin_wint_t = -1

val _FORTIFY_SOURCE: Int = 2

val RENAME_SECLUDE: Int = 1

val RENAME_SWAP: Int = 2

val RENAME_EXCL: Int = 4

val __SLBF: Int = 1

val __SNBF: Int = 2

val __SRD: Int = 4

val __SWR: Int = 8

val __SRW: Int = 16

val __SEOF: Int = 32

val __SERR: Int = 64

val __SMBF: Int = 128

val __SAPP: Int = 256

val __SSTR: Int = 512

val __SOPT: Int = 1024

val __SNPT: Int = 2048

val __SOFF: Int = 4096

val __SMOD: Int = 8192

val __SALC: Int = 16384

val __SIGN: Int = 32768

val _IOFBF: Int = 0

val _IOLBF: Int = 1

val _IONBF: Int = 2

val BUFSIZ: Int = 1024

val EOF: Int = -1

val FOPEN_MAX: Int = 20

val FILENAME_MAX: Int = 1024

val L_tmpnam: Int = 1024

val TMP_MAX: Int = 308915776

val SEEK_SET: Int = 0

val SEEK_CUR: Int = 1

val SEEK_END: Int = 2

val L_ctermid: Int = 1024

val __CTERMID_DEFINED: Int = 1

val _USE_FORTIFY_LEVEL: Int = 2

val _JBLEN: Int = 37

val CLOCKS_PER_SEC: Int = 1000000

val CLOCK_REALTIME: Int = 0

val CLOCK_MONOTONIC: Int = 6

val CLOCK_MONOTONIC_RAW: Int = 4

val CLOCK_MONOTONIC_RAW_APPROX: Int = 5

val CLOCK_UPTIME_RAW: Int = 8

val CLOCK_UPTIME_RAW_APPROX: Int = 9

val CLOCK_PROCESS_CPUTIME_ID: Int = 12

val CLOCK_THREAD_CPUTIME_ID: Int = 16

val PNG_LIBPNG_BUILD_TYPE: Int = 4

val PNG_TEXT_COMPRESSION_NONE_WR: Int = -3

val PNG_TEXT_COMPRESSION_zTXt_WR: Int = -2

val PNG_TEXT_COMPRESSION_NONE: Int = -1

val PNG_TEXT_COMPRESSION_zTXt: Int = 0

val PNG_ITXT_COMPRESSION_NONE: Int = 1

val PNG_ITXT_COMPRESSION_zTXt: Int = 2

val PNG_TEXT_COMPRESSION_LAST: Int = 3

val PNG_HAVE_IHDR: Int = 1

val PNG_HAVE_PLTE: Int = 2

val PNG_AFTER_IDAT: Int = 8

val PNG_UINT_31_MAX: png_uint_32 = 2147483647

val PNG_UINT_32_MAX: png_uint_32 = -1

val PNG_SIZE_MAX: png_size_t = -1

val PNG_FP_1: Int = 100000

val PNG_FP_HALF: Int = 50000

val PNG_FP_MAX: png_fixed_point = 2147483647

val PNG_FP_MIN: png_fixed_point = -2147483647

val PNG_COLOR_MASK_PALETTE: Int = 1

val PNG_COLOR_MASK_COLOR: Int = 2

val PNG_COLOR_MASK_ALPHA: Int = 4

val PNG_COLOR_TYPE_GRAY: Int = 0

val PNG_COLOR_TYPE_PALETTE: Int = 3

val PNG_COLOR_TYPE_RGB: Int = 2

val PNG_COLOR_TYPE_RGB_ALPHA: Int = 6

val PNG_COLOR_TYPE_GRAY_ALPHA: Int = 4

val PNG_COLOR_TYPE_RGBA: Int = 6

val PNG_COLOR_TYPE_GA: Int = 4

val PNG_COMPRESSION_TYPE_BASE: Int = 0

val PNG_COMPRESSION_TYPE_DEFAULT: Int = 0

val PNG_FILTER_TYPE_BASE: Int = 0

val PNG_INTRAPIXEL_DIFFERENCING: Int = 64

val PNG_FILTER_TYPE_DEFAULT: Int = 0

val PNG_INTERLACE_NONE: Int = 0

val PNG_INTERLACE_ADAM7: Int = 1

val PNG_INTERLACE_LAST: Int = 2

val PNG_OFFSET_PIXEL: Int = 0

val PNG_OFFSET_MICROMETER: Int = 1

val PNG_OFFSET_LAST: Int = 2

val PNG_EQUATION_LINEAR: Int = 0

val PNG_EQUATION_BASE_E: Int = 1

val PNG_EQUATION_ARBITRARY: Int = 2

val PNG_EQUATION_HYPERBOLIC: Int = 3

val PNG_EQUATION_LAST: Int = 4

val PNG_SCALE_UNKNOWN: Int = 0

val PNG_SCALE_METER: Int = 1

val PNG_SCALE_RADIAN: Int = 2

val PNG_SCALE_LAST: Int = 3

val PNG_RESOLUTION_UNKNOWN: Int = 0

val PNG_RESOLUTION_METER: Int = 1

val PNG_RESOLUTION_LAST: Int = 2

val PNG_sRGB_INTENT_PERCEPTUAL: Int = 0

val PNG_sRGB_INTENT_RELATIVE: Int = 1

val PNG_sRGB_INTENT_SATURATION: Int = 2

val PNG_sRGB_INTENT_ABSOLUTE: Int = 3

val PNG_sRGB_INTENT_LAST: Int = 4

val PNG_KEYWORD_MAX_LENGTH: Int = 79

val PNG_MAX_PALETTE_LENGTH: Int = 256

val PNG_INFO_gAMA: Int = 1

val PNG_INFO_sBIT: Int = 2

val PNG_INFO_cHRM: Int = 4

val PNG_INFO_PLTE: Int = 8

val PNG_INFO_tRNS: Int = 16

val PNG_INFO_bKGD: Int = 32

val PNG_INFO_hIST: Int = 64

val PNG_INFO_pHYs: Int = 128

val PNG_INFO_oFFs: Int = 256

val PNG_INFO_tIME: Int = 512

val PNG_INFO_pCAL: Int = 1024

val PNG_INFO_sRGB: Int = 2048

val PNG_INFO_iCCP: Int = 4096

val PNG_INFO_sPLT: Int = 8192

val PNG_INFO_sCAL: Int = 16384

val PNG_INFO_IDAT: Int = 32768

val PNG_TRANSFORM_IDENTITY: Int = 0

val PNG_TRANSFORM_STRIP_16: Int = 1

val PNG_TRANSFORM_STRIP_ALPHA: Int = 2

val PNG_TRANSFORM_PACKING: Int = 4

val PNG_TRANSFORM_PACKSWAP: Int = 8

val PNG_TRANSFORM_EXPAND: Int = 16

val PNG_TRANSFORM_INVERT_MONO: Int = 32

val PNG_TRANSFORM_SHIFT: Int = 64

val PNG_TRANSFORM_BGR: Int = 128

val PNG_TRANSFORM_SWAP_ALPHA: Int = 256

val PNG_TRANSFORM_SWAP_ENDIAN: Int = 512

val PNG_TRANSFORM_INVERT_ALPHA: Int = 1024

val PNG_TRANSFORM_STRIP_FILLER: Int = 2048

val PNG_TRANSFORM_STRIP_FILLER_BEFORE: Int = 2048

val PNG_TRANSFORM_STRIP_FILLER_AFTER: Int = 4096

val PNG_TRANSFORM_GRAY_TO_RGB: Int = 8192

val PNG_TRANSFORM_EXPAND_16: Int = 16384

val PNG_TRANSFORM_SCALE_16: Int = 32768

val PNG_FLAG_MNG_EMPTY_PLTE: Int = 1

val PNG_FLAG_MNG_FILTER_64: Int = 4

val PNG_ALL_MNG_FEATURES: Int = 5

val PNG_ERROR_ACTION_NONE: Int = 1

val PNG_ERROR_ACTION_WARN: Int = 2

val PNG_ERROR_ACTION_ERROR: Int = 3

val PNG_RGB_TO_GRAY_DEFAULT: Int = -1

val PNG_ALPHA_PNG: Int = 0

val PNG_ALPHA_STANDARD: Int = 1

val PNG_ALPHA_ASSOCIATED: Int = 1

val PNG_ALPHA_PREMULTIPLIED: Int = 1

val PNG_ALPHA_OPTIMIZED: Int = 2

val PNG_ALPHA_BROKEN: Int = 3

val PNG_DEFAULT_sRGB: Int = -1

val PNG_GAMMA_MAC_18: Int = -2

val PNG_GAMMA_sRGB: Int = 220000

val PNG_GAMMA_LINEAR: Int = 100000

val PNG_FILLER_BEFORE: Int = 0

val PNG_FILLER_AFTER: Int = 1

val PNG_BACKGROUND_GAMMA_UNKNOWN: Int = 0

val PNG_BACKGROUND_GAMMA_SCREEN: Int = 1

val PNG_BACKGROUND_GAMMA_FILE: Int = 2

val PNG_BACKGROUND_GAMMA_UNIQUE: Int = 3

val PNG_GAMMA_THRESHOLD: Double = bitsToDouble(4587366580439587226) /* == 0.05 */

val PNG_CRC_DEFAULT: Int = 0

val PNG_CRC_ERROR_QUIT: Int = 1

val PNG_CRC_WARN_DISCARD: Int = 2

val PNG_CRC_WARN_USE: Int = 3

val PNG_CRC_QUIET_USE: Int = 4

val PNG_CRC_NO_CHANGE: Int = 5

val PNG_NO_FILTERS: Int = 0

val PNG_FILTER_NONE: Int = 8

val PNG_FILTER_SUB: Int = 16

val PNG_FILTER_UP: Int = 32

val PNG_FILTER_AVG: Int = 64

val PNG_FILTER_PAETH: Int = 128

val PNG_FAST_FILTERS: Int = 56

val PNG_ALL_FILTERS: Int = 248

val PNG_FILTER_VALUE_NONE: Int = 0

val PNG_FILTER_VALUE_SUB: Int = 1

val PNG_FILTER_VALUE_UP: Int = 2

val PNG_FILTER_VALUE_AVG: Int = 3

val PNG_FILTER_VALUE_PAETH: Int = 4

val PNG_FILTER_VALUE_LAST: Int = 5

val PNG_FILTER_HEURISTIC_DEFAULT: Int = 0

val PNG_FILTER_HEURISTIC_UNWEIGHTED: Int = 1

val PNG_FILTER_HEURISTIC_WEIGHTED: Int = 2

val PNG_FILTER_HEURISTIC_LAST: Int = 3

val PNG_DESTROY_WILL_FREE_DATA: Int = 1

val PNG_SET_WILL_FREE_DATA: Int = 1

val PNG_USER_WILL_FREE_DATA: Int = 2

val PNG_FREE_HIST: Int = 8

val PNG_FREE_ICCP: Int = 16

val PNG_FREE_SPLT: Int = 32

val PNG_FREE_ROWS: Int = 64

val PNG_FREE_PCAL: Int = 128

val PNG_FREE_SCAL: Int = 256

val PNG_FREE_UNKN: Int = 512

val PNG_FREE_PLTE: Int = 4096

val PNG_FREE_TRNS: Int = 8192

val PNG_FREE_TEXT: Int = 16384

val PNG_FREE_ALL: Int = 32767

val PNG_FREE_MUL: Int = 16928

val PNG_HANDLE_CHUNK_AS_DEFAULT: Int = 0

val PNG_HANDLE_CHUNK_NEVER: Int = 1

val PNG_HANDLE_CHUNK_IF_SAFE: Int = 2

val PNG_HANDLE_CHUNK_ALWAYS: Int = 3

val PNG_HANDLE_CHUNK_LAST: Int = 4

val PNG_IO_NONE: Int = 0

val PNG_IO_READING: Int = 1

val PNG_IO_WRITING: Int = 2

val PNG_IO_SIGNATURE: Int = 16

val PNG_IO_CHUNK_HDR: Int = 32

val PNG_IO_CHUNK_DATA: Int = 64

val PNG_IO_CHUNK_CRC: Int = 128

val PNG_IO_MASK_OP: Int = 15

val PNG_IO_MASK_LOC: Int = 240

val PNG_INTERLACE_ADAM7_PASSES: Int = 7

val PNG_IMAGE_VERSION: Int = 1

val PNG_IMAGE_WARNING: Int = 1

val PNG_IMAGE_ERROR: Int = 2

val PNG_FORMAT_FLAG_ALPHA: Int = 1

val PNG_FORMAT_FLAG_COLOR: Int = 2

val PNG_FORMAT_FLAG_LINEAR: Int = 4

val PNG_FORMAT_FLAG_COLORMAP: Int = 8

val PNG_FORMAT_FLAG_BGR: Int = 16

val PNG_FORMAT_FLAG_AFIRST: Int = 32

val PNG_FORMAT_GRAY: Int = 0

val PNG_FORMAT_GA: Int = 1

val PNG_FORMAT_AG: Int = 33

val PNG_FORMAT_RGB: Int = 2

val PNG_FORMAT_BGR: Int = 18

val PNG_FORMAT_RGBA: Int = 3

val PNG_FORMAT_ARGB: Int = 35

val PNG_FORMAT_BGRA: Int = 19

val PNG_FORMAT_ABGR: Int = 51

val PNG_FORMAT_LINEAR_Y: Int = 4

val PNG_FORMAT_LINEAR_Y_ALPHA: Int = 5

val PNG_FORMAT_LINEAR_RGB: Int = 6

val PNG_FORMAT_LINEAR_RGB_ALPHA: Int = 7

val PNG_FORMAT_RGB_COLORMAP: Int = 10

val PNG_FORMAT_BGR_COLORMAP: Int = 26

val PNG_FORMAT_RGBA_COLORMAP: Int = 11

val PNG_FORMAT_ARGB_COLORMAP: Int = 43

val PNG_FORMAT_BGRA_COLORMAP: Int = 27

val PNG_FORMAT_ABGR_COLORMAP: Int = 59

val PNG_IMAGE_FLAG_COLORSPACE_NOT_sRGB: Int = 1

val PNG_IMAGE_FLAG_FAST: Int = 2

val PNG_IMAGE_FLAG_16BIT_sRGB: Int = 4

val PNG_MAXIMUM_INFLATE_WINDOW: Int = 2

val PNG_SKIP_sRGB_CHECK_PROFILE: Int = 4

val PNG_IGNORE_ADLER32: Int = 8

val PNG_OPTION_NEXT: Int = 12

val PNG_OPTION_UNSET: Int = 0

val PNG_OPTION_INVALID: Int = 1

val PNG_OPTION_OFF: Int = 2

val PNG_OPTION_ON: Int = 3

class __mbstate_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(128, 8)
    
    val __mbstate8: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var _mbstateL: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class __va_list_tag(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var gp_offset: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var fp_offset: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var overflow_arg_area: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var reg_save_area: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
}

class __builtin_va_list(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
}

class __darwin_pthread_handler_rec(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var __routine: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(0).value = value }
    
    var __arg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var __next: CPointer<__darwin_pthread_handler_rec>?
        get() = memberAt<CPointerVar<__darwin_pthread_handler_rec>>(16).value
        set(value) { memberAt<CPointerVar<__darwin_pthread_handler_rec>>(16).value = value }
    
}

class _opaque_pthread_attr_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(64, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_cond_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(48, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_condattr_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_mutex_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(64, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_mutexattr_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_once_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_rwlock_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(200, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_rwlockattr_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8192, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    var __cleanup_stack: CPointer<__darwin_pthread_handler_rec>?
        get() = memberAt<CPointerVar<__darwin_pthread_handler_rec>>(8).value
        set(value) { memberAt<CPointerVar<__darwin_pthread_handler_rec>>(8).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(16)
    
}

class __sbuf(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var _base: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var _size: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class __sFILE(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(152, 8)
    
    var _p: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var _r: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var _w: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var _flags: Short
        get() = memberAt<ShortVar>(16).value
        set(value) { memberAt<ShortVar>(16).value = value }
    
    var _file: Short
        get() = memberAt<ShortVar>(18).value
        set(value) { memberAt<ShortVar>(18).value = value }
    
    val _bf: __sbuf
        get() = memberAt(24)
    
    var _lbfsize: Int
        get() = memberAt<IntVar>(40).value
        set(value) { memberAt<IntVar>(40).value = value }
    
    var _cookie: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(48).value
        set(value) { memberAt<COpaquePointerVar>(48).value = value }
    
    var _close: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(56).value = value }
    
    var _read: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Int>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Int>>>(64).value = value }
    
    var _seek: CPointer<CFunction<(COpaquePointer?, fpos_t, Int) -> fpos_t>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, fpos_t, Int) -> fpos_t>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, fpos_t, Int) -> fpos_t>>>(72).value = value }
    
    var _write: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Int>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, Int) -> Int>>>(80).value = value }
    
    val _ub: __sbuf
        get() = memberAt(88)
    
    var _extra: CPointer<__sFILEX>?
        get() = memberAt<CPointerVar<__sFILEX>>(104).value
        set(value) { memberAt<CPointerVar<__sFILEX>>(104).value = value }
    
    var _ur: Int
        get() = memberAt<IntVar>(112).value
        set(value) { memberAt<IntVar>(112).value = value }
    
    val _ubuf: CArrayPointer<ByteVar>
        get() = arrayMemberAt(116)
    
    val _nbuf: CArrayPointer<ByteVar>
        get() = arrayMemberAt(119)
    
    val _lb: __sbuf
        get() = memberAt(120)
    
    var _blksize: Int
        get() = memberAt<IntVar>(136).value
        set(value) { memberAt<IntVar>(136).value = value }
    
    var _offset: fpos_t
        get() = memberAt<fpos_tVar>(144).value
        set(value) { memberAt<fpos_tVar>(144).value = value }
    
}

class __sFILEX(override val rawPtr: NativePtr) : COpaque

class timespec(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var tv_sec: __darwin_time_t
        get() = memberAt<__darwin_time_tVar>(0).value
        set(value) { memberAt<__darwin_time_tVar>(0).value = value }
    
    var tv_nsec: Long
        get() = memberAt<LongVar>(8).value
        set(value) { memberAt<LongVar>(8).value = value }
    
}

class tm(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(56, 8)
    
    var tm_sec: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var tm_min: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var tm_hour: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var tm_mday: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var tm_mon: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var tm_year: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var tm_wday: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var tm_yday: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var tm_isdst: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var tm_gmtoff: Long
        get() = memberAt<LongVar>(40).value
        set(value) { memberAt<LongVar>(40).value = value }
    
    var tm_zone: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(48).value
        set(value) { memberAt<CPointerVar<ByteVar>>(48).value = value }
    
}

class png_struct_def(override val rawPtr: NativePtr) : COpaque

class png_info_def(override val rawPtr: NativePtr) : COpaque

class png_color_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(3, 1)
    
    var red: png_byte
        get() = memberAt<png_byteVar>(0).value
        set(value) { memberAt<png_byteVar>(0).value = value }
    
    var green: png_byte
        get() = memberAt<png_byteVar>(1).value
        set(value) { memberAt<png_byteVar>(1).value = value }
    
    var blue: png_byte
        get() = memberAt<png_byteVar>(2).value
        set(value) { memberAt<png_byteVar>(2).value = value }
    
}

class png_color_16_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(10, 2)
    
    var index: png_byte
        get() = memberAt<png_byteVar>(0).value
        set(value) { memberAt<png_byteVar>(0).value = value }
    
    var red: png_uint_16
        get() = memberAt<png_uint_16Var>(2).value
        set(value) { memberAt<png_uint_16Var>(2).value = value }
    
    var green: png_uint_16
        get() = memberAt<png_uint_16Var>(4).value
        set(value) { memberAt<png_uint_16Var>(4).value = value }
    
    var blue: png_uint_16
        get() = memberAt<png_uint_16Var>(6).value
        set(value) { memberAt<png_uint_16Var>(6).value = value }
    
    var gray: png_uint_16
        get() = memberAt<png_uint_16Var>(8).value
        set(value) { memberAt<png_uint_16Var>(8).value = value }
    
}

class png_color_8_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(5, 1)
    
    var red: png_byte
        get() = memberAt<png_byteVar>(0).value
        set(value) { memberAt<png_byteVar>(0).value = value }
    
    var green: png_byte
        get() = memberAt<png_byteVar>(1).value
        set(value) { memberAt<png_byteVar>(1).value = value }
    
    var blue: png_byte
        get() = memberAt<png_byteVar>(2).value
        set(value) { memberAt<png_byteVar>(2).value = value }
    
    var gray: png_byte
        get() = memberAt<png_byteVar>(3).value
        set(value) { memberAt<png_byteVar>(3).value = value }
    
    var alpha: png_byte
        get() = memberAt<png_byteVar>(4).value
        set(value) { memberAt<png_byteVar>(4).value = value }
    
}

class png_sPLT_entry_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(10, 2)
    
    var red: png_uint_16
        get() = memberAt<png_uint_16Var>(0).value
        set(value) { memberAt<png_uint_16Var>(0).value = value }
    
    var green: png_uint_16
        get() = memberAt<png_uint_16Var>(2).value
        set(value) { memberAt<png_uint_16Var>(2).value = value }
    
    var blue: png_uint_16
        get() = memberAt<png_uint_16Var>(4).value
        set(value) { memberAt<png_uint_16Var>(4).value = value }
    
    var alpha: png_uint_16
        get() = memberAt<png_uint_16Var>(6).value
        set(value) { memberAt<png_uint_16Var>(6).value = value }
    
    var frequency: png_uint_16
        get() = memberAt<png_uint_16Var>(8).value
        set(value) { memberAt<png_uint_16Var>(8).value = value }
    
}

class png_sPLT_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 8)
    
    var name: png_charp?
        get() = memberAt<png_charpVar>(0).value
        set(value) { memberAt<png_charpVar>(0).value = value }
    
    var depth: png_byte
        get() = memberAt<png_byteVar>(8).value
        set(value) { memberAt<png_byteVar>(8).value = value }
    
    var entries: png_sPLT_entryp?
        get() = memberAt<png_sPLT_entrypVar>(16).value
        set(value) { memberAt<png_sPLT_entrypVar>(16).value = value }
    
    var nentries: png_int_32
        get() = memberAt<png_int_32Var>(24).value
        set(value) { memberAt<png_int_32Var>(24).value = value }
    
}

class png_text_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(56, 8)
    
    var compression: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var key: png_charp?
        get() = memberAt<png_charpVar>(8).value
        set(value) { memberAt<png_charpVar>(8).value = value }
    
    var text: png_charp?
        get() = memberAt<png_charpVar>(16).value
        set(value) { memberAt<png_charpVar>(16).value = value }
    
    var text_length: png_size_t
        get() = memberAt<png_size_tVar>(24).value
        set(value) { memberAt<png_size_tVar>(24).value = value }
    
    var itxt_length: png_size_t
        get() = memberAt<png_size_tVar>(32).value
        set(value) { memberAt<png_size_tVar>(32).value = value }
    
    var lang: png_charp?
        get() = memberAt<png_charpVar>(40).value
        set(value) { memberAt<png_charpVar>(40).value = value }
    
    var lang_key: png_charp?
        get() = memberAt<png_charpVar>(48).value
        set(value) { memberAt<png_charpVar>(48).value = value }
    
}

class png_time_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 2)
    
    var year: png_uint_16
        get() = memberAt<png_uint_16Var>(0).value
        set(value) { memberAt<png_uint_16Var>(0).value = value }
    
    var month: png_byte
        get() = memberAt<png_byteVar>(2).value
        set(value) { memberAt<png_byteVar>(2).value = value }
    
    var day: png_byte
        get() = memberAt<png_byteVar>(3).value
        set(value) { memberAt<png_byteVar>(3).value = value }
    
    var hour: png_byte
        get() = memberAt<png_byteVar>(4).value
        set(value) { memberAt<png_byteVar>(4).value = value }
    
    var minute: png_byte
        get() = memberAt<png_byteVar>(5).value
        set(value) { memberAt<png_byteVar>(5).value = value }
    
    var second: png_byte
        get() = memberAt<png_byteVar>(6).value
        set(value) { memberAt<png_byteVar>(6).value = value }
    
}

class png_unknown_chunk_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 8)
    
    val name: CArrayPointer<png_byteVar>
        get() = arrayMemberAt(0)
    
    var data: CPointer<png_byteVar>?
        get() = memberAt<CPointerVar<png_byteVar>>(8).value
        set(value) { memberAt<CPointerVar<png_byteVar>>(8).value = value }
    
    var size: png_size_t
        get() = memberAt<png_size_tVar>(16).value
        set(value) { memberAt<png_size_tVar>(16).value = value }
    
    var location: png_byte
        get() = memberAt<png_byteVar>(24).value
        set(value) { memberAt<png_byteVar>(24).value = value }
    
}

class png_row_info_struct(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 8)
    
    var width: png_uint_32
        get() = memberAt<png_uint_32Var>(0).value
        set(value) { memberAt<png_uint_32Var>(0).value = value }
    
    var rowbytes: png_size_t
        get() = memberAt<png_size_tVar>(8).value
        set(value) { memberAt<png_size_tVar>(8).value = value }
    
    var color_type: png_byte
        get() = memberAt<png_byteVar>(16).value
        set(value) { memberAt<png_byteVar>(16).value = value }
    
    var bit_depth: png_byte
        get() = memberAt<png_byteVar>(17).value
        set(value) { memberAt<png_byteVar>(17).value = value }
    
    var channels: png_byte
        get() = memberAt<png_byteVar>(18).value
        set(value) { memberAt<png_byteVar>(18).value = value }
    
    var pixel_depth: png_byte
        get() = memberAt<png_byteVar>(19).value
        set(value) { memberAt<png_byteVar>(19).value = value }
    
}

class png_control(override val rawPtr: NativePtr) : COpaque

class png_image(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(104, 8)
    
    var opaque: png_controlp?
        get() = memberAt<png_controlpVar>(0).value
        set(value) { memberAt<png_controlpVar>(0).value = value }
    
    var version: png_uint_32
        get() = memberAt<png_uint_32Var>(8).value
        set(value) { memberAt<png_uint_32Var>(8).value = value }
    
    var width: png_uint_32
        get() = memberAt<png_uint_32Var>(12).value
        set(value) { memberAt<png_uint_32Var>(12).value = value }
    
    var height: png_uint_32
        get() = memberAt<png_uint_32Var>(16).value
        set(value) { memberAt<png_uint_32Var>(16).value = value }
    
    var format: png_uint_32
        get() = memberAt<png_uint_32Var>(20).value
        set(value) { memberAt<png_uint_32Var>(20).value = value }
    
    var flags: png_uint_32
        get() = memberAt<png_uint_32Var>(24).value
        set(value) { memberAt<png_uint_32Var>(24).value = value }
    
    var colormap_entries: png_uint_32
        get() = memberAt<png_uint_32Var>(28).value
        set(value) { memberAt<png_uint_32Var>(28).value = value }
    
    var warning_or_error: png_uint_32
        get() = memberAt<png_uint_32Var>(32).value
        set(value) { memberAt<png_uint_32Var>(32).value = value }
    
    val message: CArrayPointer<ByteVar>
        get() = arrayMemberAt(36)
    
}

typealias clockid_tVar = IntVarOf<clockid_t>
typealias clockid_t = Int

val _CLOCK_REALTIME: clockid_t = 0
val _CLOCK_MONOTONIC: clockid_t = 6
val _CLOCK_MONOTONIC_RAW: clockid_t = 4
val _CLOCK_MONOTONIC_RAW_APPROX: clockid_t = 5
val _CLOCK_UPTIME_RAW: clockid_t = 8
val _CLOCK_UPTIME_RAW_APPROX: clockid_t = 9
val _CLOCK_PROCESS_CPUTIME_ID: clockid_t = 12
val _CLOCK_THREAD_CPUTIME_ID: clockid_t = 16

typealias ptrdiff_tVar = LongVarOf<ptrdiff_t>
typealias ptrdiff_t = Long

typealias size_tVar = LongVarOf<size_t>
typealias size_t = Long

typealias rsize_tVar = LongVarOf<rsize_t>
typealias rsize_t = Long

typealias wchar_tVar = IntVarOf<wchar_t>
typealias wchar_t = Int

typealias __int8_tVar = ByteVarOf<__int8_t>
typealias __int8_t = Byte

typealias __uint8_tVar = ByteVarOf<__uint8_t>
typealias __uint8_t = Byte

typealias __int16_tVar = ShortVarOf<__int16_t>
typealias __int16_t = Short

typealias __uint16_tVar = ShortVarOf<__uint16_t>
typealias __uint16_t = Short

typealias __int32_tVar = IntVarOf<__int32_t>
typealias __int32_t = Int

typealias __uint32_tVar = IntVarOf<__uint32_t>
typealias __uint32_t = Int

typealias __int64_tVar = LongVarOf<__int64_t>
typealias __int64_t = Long

typealias __uint64_tVar = LongVarOf<__uint64_t>
typealias __uint64_t = Long

typealias __darwin_intptr_tVar = LongVarOf<__darwin_intptr_t>
typealias __darwin_intptr_t = Long

typealias __darwin_natural_tVar = IntVarOf<__darwin_natural_t>
typealias __darwin_natural_t = Int

typealias __darwin_ct_rune_tVar = IntVarOf<__darwin_ct_rune_t>
typealias __darwin_ct_rune_t = Int

typealias __darwin_mbstate_t = __mbstate_t

typealias __darwin_ptrdiff_tVar = LongVarOf<__darwin_ptrdiff_t>
typealias __darwin_ptrdiff_t = Long

typealias __darwin_size_tVar = LongVarOf<__darwin_size_t>
typealias __darwin_size_t = Long

typealias __darwin_va_listVar = CPointerVarOf<__darwin_va_list>
typealias __darwin_va_list = CArrayPointer<__builtin_va_list>

typealias __darwin_wchar_tVar = IntVarOf<__darwin_wchar_t>
typealias __darwin_wchar_t = Int

typealias __darwin_rune_tVar = IntVarOf<__darwin_rune_t>
typealias __darwin_rune_t = __darwin_wchar_t

typealias __darwin_wint_tVar = IntVarOf<__darwin_wint_t>
typealias __darwin_wint_t = Int

typealias __darwin_clock_tVar = LongVarOf<__darwin_clock_t>
typealias __darwin_clock_t = Long

typealias __darwin_socklen_tVar = IntVarOf<__darwin_socklen_t>
typealias __darwin_socklen_t = __uint32_t

typealias __darwin_ssize_tVar = LongVarOf<__darwin_ssize_t>
typealias __darwin_ssize_t = Long

typealias __darwin_time_tVar = LongVarOf<__darwin_time_t>
typealias __darwin_time_t = Long

typealias __darwin_blkcnt_tVar = LongVarOf<__darwin_blkcnt_t>
typealias __darwin_blkcnt_t = __int64_t

typealias __darwin_blksize_tVar = IntVarOf<__darwin_blksize_t>
typealias __darwin_blksize_t = __int32_t

typealias __darwin_dev_tVar = IntVarOf<__darwin_dev_t>
typealias __darwin_dev_t = __int32_t

typealias __darwin_fsblkcnt_tVar = IntVarOf<__darwin_fsblkcnt_t>
typealias __darwin_fsblkcnt_t = Int

typealias __darwin_fsfilcnt_tVar = IntVarOf<__darwin_fsfilcnt_t>
typealias __darwin_fsfilcnt_t = Int

typealias __darwin_gid_tVar = IntVarOf<__darwin_gid_t>
typealias __darwin_gid_t = __uint32_t

typealias __darwin_id_tVar = IntVarOf<__darwin_id_t>
typealias __darwin_id_t = __uint32_t

typealias __darwin_ino64_tVar = LongVarOf<__darwin_ino64_t>
typealias __darwin_ino64_t = __uint64_t

typealias __darwin_ino_tVar = LongVarOf<__darwin_ino_t>
typealias __darwin_ino_t = __darwin_ino64_t

typealias __darwin_mach_port_name_tVar = IntVarOf<__darwin_mach_port_name_t>
typealias __darwin_mach_port_name_t = __darwin_natural_t

typealias __darwin_mach_port_tVar = IntVarOf<__darwin_mach_port_t>
typealias __darwin_mach_port_t = __darwin_mach_port_name_t

typealias __darwin_mode_tVar = ShortVarOf<__darwin_mode_t>
typealias __darwin_mode_t = __uint16_t

typealias __darwin_off_tVar = LongVarOf<__darwin_off_t>
typealias __darwin_off_t = __int64_t

typealias __darwin_pid_tVar = IntVarOf<__darwin_pid_t>
typealias __darwin_pid_t = __int32_t

typealias __darwin_sigset_tVar = IntVarOf<__darwin_sigset_t>
typealias __darwin_sigset_t = __uint32_t

typealias __darwin_suseconds_tVar = IntVarOf<__darwin_suseconds_t>
typealias __darwin_suseconds_t = __int32_t

typealias __darwin_uid_tVar = IntVarOf<__darwin_uid_t>
typealias __darwin_uid_t = __uint32_t

typealias __darwin_useconds_tVar = IntVarOf<__darwin_useconds_t>
typealias __darwin_useconds_t = __uint32_t

typealias __darwin_uuid_tVar = CPointerVarOf<__darwin_uuid_t>
typealias __darwin_uuid_t = CArrayPointer<ByteVar>

typealias __darwin_uuid_string_tVar = CPointerVarOf<__darwin_uuid_string_t>
typealias __darwin_uuid_string_t = CArrayPointer<ByteVar>

typealias __darwin_pthread_attr_t = _opaque_pthread_attr_t

typealias __darwin_pthread_cond_t = _opaque_pthread_cond_t

typealias __darwin_pthread_condattr_t = _opaque_pthread_condattr_t

typealias __darwin_pthread_key_tVar = LongVarOf<__darwin_pthread_key_t>
typealias __darwin_pthread_key_t = Long

typealias __darwin_pthread_mutex_t = _opaque_pthread_mutex_t

typealias __darwin_pthread_mutexattr_t = _opaque_pthread_mutexattr_t

typealias __darwin_pthread_once_t = _opaque_pthread_once_t

typealias __darwin_pthread_rwlock_t = _opaque_pthread_rwlock_t

typealias __darwin_pthread_rwlockattr_t = _opaque_pthread_rwlockattr_t

typealias __darwin_pthread_tVar = CPointerVarOf<__darwin_pthread_t>
typealias __darwin_pthread_t = CPointer<_opaque_pthread_t>

typealias __darwin_nl_itemVar = IntVarOf<__darwin_nl_item>
typealias __darwin_nl_item = Int

typealias __darwin_wctrans_tVar = IntVarOf<__darwin_wctrans_t>
typealias __darwin_wctrans_t = Int

typealias __darwin_wctype_tVar = IntVarOf<__darwin_wctype_t>
typealias __darwin_wctype_t = __uint32_t

typealias fpos_tVar = LongVarOf<fpos_t>
typealias fpos_t = __darwin_off_t

typealias FILE = __sFILE

typealias off_tVar = LongVarOf<off_t>
typealias off_t = __darwin_off_t

typealias ssize_tVar = LongVarOf<ssize_t>
typealias ssize_t = __darwin_ssize_t

typealias jmp_bufVar = CPointerVarOf<jmp_buf>
typealias jmp_buf = CArrayPointer<IntVar>

typealias sigjmp_bufVar = CPointerVarOf<sigjmp_buf>
typealias sigjmp_buf = CArrayPointer<IntVar>

typealias clock_tVar = LongVarOf<clock_t>
typealias clock_t = __darwin_clock_t

typealias time_tVar = LongVarOf<time_t>
typealias time_t = __darwin_time_t

typealias png_byteVar = ByteVarOf<png_byte>
typealias png_byte = Byte

typealias png_int_16Var = ShortVarOf<png_int_16>
typealias png_int_16 = Short

typealias png_uint_16Var = ShortVarOf<png_uint_16>
typealias png_uint_16 = Short

typealias png_int_32Var = IntVarOf<png_int_32>
typealias png_int_32 = Int

typealias png_uint_32Var = IntVarOf<png_uint_32>
typealias png_uint_32 = Int

typealias png_size_tVar = LongVarOf<png_size_t>
typealias png_size_t = size_t

typealias png_ptrdiff_tVar = LongVarOf<png_ptrdiff_t>
typealias png_ptrdiff_t = ptrdiff_t

typealias png_alloc_size_tVar = LongVarOf<png_alloc_size_t>
typealias png_alloc_size_t = png_size_t

typealias png_fixed_pointVar = IntVarOf<png_fixed_point>
typealias png_fixed_point = png_int_32

typealias png_voidpVar = CPointerVarOf<png_voidp>
typealias png_voidp = COpaquePointer

typealias png_const_voidpVar = CPointerVarOf<png_const_voidp>
typealias png_const_voidp = COpaquePointer

typealias png_bytepVar = CPointerVarOf<png_bytep>
typealias png_bytep = CPointer<png_byteVar>

typealias png_const_bytepVar = CPointerVarOf<png_const_bytep>
typealias png_const_bytep = CPointer<png_byteVar>

typealias png_uint_32pVar = CPointerVarOf<png_uint_32p>
typealias png_uint_32p = CPointer<png_uint_32Var>

typealias png_const_uint_32pVar = CPointerVarOf<png_const_uint_32p>
typealias png_const_uint_32p = CPointer<png_uint_32Var>

typealias png_int_32pVar = CPointerVarOf<png_int_32p>
typealias png_int_32p = CPointer<png_int_32Var>

typealias png_const_int_32pVar = CPointerVarOf<png_const_int_32p>
typealias png_const_int_32p = CPointer<png_int_32Var>

typealias png_uint_16pVar = CPointerVarOf<png_uint_16p>
typealias png_uint_16p = CPointer<png_uint_16Var>

typealias png_const_uint_16pVar = CPointerVarOf<png_const_uint_16p>
typealias png_const_uint_16p = CPointer<png_uint_16Var>

typealias png_int_16pVar = CPointerVarOf<png_int_16p>
typealias png_int_16p = CPointer<png_int_16Var>

typealias png_const_int_16pVar = CPointerVarOf<png_const_int_16p>
typealias png_const_int_16p = CPointer<png_int_16Var>

typealias png_charpVar = CPointerVarOf<png_charp>
typealias png_charp = CPointer<ByteVar>

typealias png_const_charpVar = CPointerVarOf<png_const_charp>
typealias png_const_charp = CPointer<ByteVar>

typealias png_fixed_point_pVar = CPointerVarOf<png_fixed_point_p>
typealias png_fixed_point_p = CPointer<png_fixed_pointVar>

typealias png_const_fixed_point_pVar = CPointerVarOf<png_const_fixed_point_p>
typealias png_const_fixed_point_p = CPointer<png_fixed_pointVar>

typealias png_size_tpVar = CPointerVarOf<png_size_tp>
typealias png_size_tp = CPointer<png_size_tVar>

typealias png_const_size_tpVar = CPointerVarOf<png_const_size_tp>
typealias png_const_size_tp = CPointer<png_size_tVar>

typealias png_FILE_pVar = CPointerVarOf<png_FILE_p>
typealias png_FILE_p = CPointer<FILE>

typealias png_doublepVar = CPointerVarOf<png_doublep>
typealias png_doublep = CPointer<DoubleVar>

typealias png_const_doublepVar = CPointerVarOf<png_const_doublep>
typealias png_const_doublep = CPointer<DoubleVar>

typealias png_byteppVar = CPointerVarOf<png_bytepp>
typealias png_bytepp = CPointer<CPointerVar<png_byteVar>>

typealias png_uint_32ppVar = CPointerVarOf<png_uint_32pp>
typealias png_uint_32pp = CPointer<CPointerVar<png_uint_32Var>>

typealias png_int_32ppVar = CPointerVarOf<png_int_32pp>
typealias png_int_32pp = CPointer<CPointerVar<png_int_32Var>>

typealias png_uint_16ppVar = CPointerVarOf<png_uint_16pp>
typealias png_uint_16pp = CPointer<CPointerVar<png_uint_16Var>>

typealias png_int_16ppVar = CPointerVarOf<png_int_16pp>
typealias png_int_16pp = CPointer<CPointerVar<png_int_16Var>>

typealias png_const_charppVar = CPointerVarOf<png_const_charpp>
typealias png_const_charpp = CPointer<CPointerVar<ByteVar>>

typealias png_charppVar = CPointerVarOf<png_charpp>
typealias png_charpp = CPointer<CPointerVar<ByteVar>>

typealias png_fixed_point_ppVar = CPointerVarOf<png_fixed_point_pp>
typealias png_fixed_point_pp = CPointer<CPointerVar<png_fixed_pointVar>>

typealias png_doubleppVar = CPointerVarOf<png_doublepp>
typealias png_doublepp = CPointer<CPointerVar<DoubleVar>>

typealias png_charpppVar = CPointerVarOf<png_charppp>
typealias png_charppp = CPointer<CPointerVar<CPointerVar<ByteVar>>>

typealias png_libpng_version_1_6_29Var = CPointerVarOf<png_libpng_version_1_6_29>
typealias png_libpng_version_1_6_29 = CPointer<ByteVar>

typealias png_struct = png_struct_def

typealias png_const_structpVar = CPointerVarOf<png_const_structp>
typealias png_const_structp = CPointer<png_struct>

typealias png_structpVar = CPointerVarOf<png_structp>
typealias png_structp = CPointer<png_struct>

typealias png_structppVar = CPointerVarOf<png_structpp>
typealias png_structpp = CPointer<CPointerVar<png_struct>>

typealias png_info = png_info_def

typealias png_infopVar = CPointerVarOf<png_infop>
typealias png_infop = CPointer<png_info>

typealias png_const_infopVar = CPointerVarOf<png_const_infop>
typealias png_const_infop = CPointer<png_info>

typealias png_infoppVar = CPointerVarOf<png_infopp>
typealias png_infopp = CPointer<CPointerVar<png_info>>

typealias png_structrpVar = CPointerVarOf<png_structrp>
typealias png_structrp = CPointer<png_struct>

typealias png_const_structrpVar = CPointerVarOf<png_const_structrp>
typealias png_const_structrp = CPointer<png_struct>

typealias png_inforpVar = CPointerVarOf<png_inforp>
typealias png_inforp = CPointer<png_info>

typealias png_const_inforpVar = CPointerVarOf<png_const_inforp>
typealias png_const_inforp = CPointer<png_info>

typealias png_color = png_color_struct

typealias png_colorpVar = CPointerVarOf<png_colorp>
typealias png_colorp = CPointer<png_color>

typealias png_const_colorpVar = CPointerVarOf<png_const_colorp>
typealias png_const_colorp = CPointer<png_color>

typealias png_colorppVar = CPointerVarOf<png_colorpp>
typealias png_colorpp = CPointer<CPointerVar<png_color>>

typealias png_color_16 = png_color_16_struct

typealias png_color_16pVar = CPointerVarOf<png_color_16p>
typealias png_color_16p = CPointer<png_color_16>

typealias png_const_color_16pVar = CPointerVarOf<png_const_color_16p>
typealias png_const_color_16p = CPointer<png_color_16>

typealias png_color_16ppVar = CPointerVarOf<png_color_16pp>
typealias png_color_16pp = CPointer<CPointerVar<png_color_16>>

typealias png_color_8 = png_color_8_struct

typealias png_color_8pVar = CPointerVarOf<png_color_8p>
typealias png_color_8p = CPointer<png_color_8>

typealias png_const_color_8pVar = CPointerVarOf<png_const_color_8p>
typealias png_const_color_8p = CPointer<png_color_8>

typealias png_color_8ppVar = CPointerVarOf<png_color_8pp>
typealias png_color_8pp = CPointer<CPointerVar<png_color_8>>

typealias png_sPLT_entry = png_sPLT_entry_struct

typealias png_sPLT_entrypVar = CPointerVarOf<png_sPLT_entryp>
typealias png_sPLT_entryp = CPointer<png_sPLT_entry>

typealias png_const_sPLT_entrypVar = CPointerVarOf<png_const_sPLT_entryp>
typealias png_const_sPLT_entryp = CPointer<png_sPLT_entry>

typealias png_sPLT_entryppVar = CPointerVarOf<png_sPLT_entrypp>
typealias png_sPLT_entrypp = CPointer<CPointerVar<png_sPLT_entry>>

typealias png_sPLT_t = png_sPLT_struct

typealias png_sPLT_tpVar = CPointerVarOf<png_sPLT_tp>
typealias png_sPLT_tp = CPointer<png_sPLT_t>

typealias png_const_sPLT_tpVar = CPointerVarOf<png_const_sPLT_tp>
typealias png_const_sPLT_tp = CPointer<png_sPLT_t>

typealias png_sPLT_tppVar = CPointerVarOf<png_sPLT_tpp>
typealias png_sPLT_tpp = CPointer<CPointerVar<png_sPLT_t>>

typealias png_text = png_text_struct

typealias png_textpVar = CPointerVarOf<png_textp>
typealias png_textp = CPointer<png_text>

typealias png_const_textpVar = CPointerVarOf<png_const_textp>
typealias png_const_textp = CPointer<png_text>

typealias png_textppVar = CPointerVarOf<png_textpp>
typealias png_textpp = CPointer<CPointerVar<png_text>>

typealias png_time = png_time_struct

typealias png_timepVar = CPointerVarOf<png_timep>
typealias png_timep = CPointer<png_time>

typealias png_const_timepVar = CPointerVarOf<png_const_timep>
typealias png_const_timep = CPointer<png_time>

typealias png_timeppVar = CPointerVarOf<png_timepp>
typealias png_timepp = CPointer<CPointerVar<png_time>>

typealias png_unknown_chunk = png_unknown_chunk_t

typealias png_unknown_chunkpVar = CPointerVarOf<png_unknown_chunkp>
typealias png_unknown_chunkp = CPointer<png_unknown_chunk>

typealias png_const_unknown_chunkpVar = CPointerVarOf<png_const_unknown_chunkp>
typealias png_const_unknown_chunkp = CPointer<png_unknown_chunk>

typealias png_unknown_chunkppVar = CPointerVarOf<png_unknown_chunkpp>
typealias png_unknown_chunkpp = CPointer<CPointerVar<png_unknown_chunk>>

typealias png_row_info = png_row_info_struct

typealias png_row_infopVar = CPointerVarOf<png_row_infop>
typealias png_row_infop = CPointer<png_row_info>

typealias png_row_infoppVar = CPointerVarOf<png_row_infopp>
typealias png_row_infopp = CPointer<CPointerVar<png_row_info>>

typealias png_error_ptrVar = CPointerVarOf<png_error_ptr>
typealias png_error_ptr = CPointer<CFunction<(png_structp?, png_const_charp?) -> Unit>>

typealias png_rw_ptrVar = CPointerVarOf<png_rw_ptr>
typealias png_rw_ptr = CPointer<CFunction<(png_structp?, png_bytep?, png_size_t) -> Unit>>

typealias png_flush_ptrVar = CPointerVarOf<png_flush_ptr>
typealias png_flush_ptr = CPointer<CFunction<(png_structp?) -> Unit>>

typealias png_read_status_ptrVar = CPointerVarOf<png_read_status_ptr>
typealias png_read_status_ptr = CPointer<CFunction<(png_structp?, png_uint_32, Int) -> Unit>>

typealias png_write_status_ptrVar = CPointerVarOf<png_write_status_ptr>
typealias png_write_status_ptr = CPointer<CFunction<(png_structp?, png_uint_32, Int) -> Unit>>

typealias png_progressive_info_ptrVar = CPointerVarOf<png_progressive_info_ptr>
typealias png_progressive_info_ptr = CPointer<CFunction<(png_structp?, png_infop?) -> Unit>>

typealias png_progressive_end_ptrVar = CPointerVarOf<png_progressive_end_ptr>
typealias png_progressive_end_ptr = CPointer<CFunction<(png_structp?, png_infop?) -> Unit>>

typealias png_progressive_row_ptrVar = CPointerVarOf<png_progressive_row_ptr>
typealias png_progressive_row_ptr = CPointer<CFunction<(png_structp?, png_bytep?, png_uint_32, Int) -> Unit>>

typealias png_user_transform_ptrVar = CPointerVarOf<png_user_transform_ptr>
typealias png_user_transform_ptr = CPointer<CFunction<(png_structp?, png_row_infop?, png_bytep?) -> Unit>>

typealias png_user_chunk_ptrVar = CPointerVarOf<png_user_chunk_ptr>
typealias png_user_chunk_ptr = CPointer<CFunction<(png_structp?, png_unknown_chunkp?) -> Int>>

typealias png_longjmp_ptrVar = CPointerVarOf<png_longjmp_ptr>
typealias png_longjmp_ptr = CPointer<CFunction<(jmp_buf?, Int) -> Unit>>

typealias png_malloc_ptrVar = CPointerVarOf<png_malloc_ptr>
typealias png_malloc_ptr = CPointer<CFunction<(png_structp?, png_alloc_size_t) -> png_voidp?>>

typealias png_free_ptrVar = CPointerVarOf<png_free_ptr>
typealias png_free_ptr = CPointer<CFunction<(png_structp?, png_voidp?) -> Unit>>

typealias png_controlpVar = CPointerVarOf<png_controlp>
typealias png_controlp = CPointer<png_control>

typealias png_imagepVar = CPointerVarOf<png_imagep>
typealias png_imagep = CPointer<png_image>

