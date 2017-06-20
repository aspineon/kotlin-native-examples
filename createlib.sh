#cinterop -def src/main/c_interop/png.def -copt -I/usr/local/include -o build/c_interop/png
#cinterop -def src/main/c_interop/stdio.def -copt -I/usr/local/include -o build/c_interop/stdio

mkdir -p build/c_interop/
mkdir -p build/bin/

#cinterop -def src/main/c_interop/stdio.def -copt "$CFLAGS" -target macbook \
#         -o build/c_interop/stdio || exit 1
cinterop -def src/main/c_interop/png.def -copt "$CFLAGS" -target macbook \
         -o build/c_interop/png || exit 1