konanc $COMPILER_ARGS -target macbook src/main/kotlin/logogen.kt \
       -library build/c_interop/png \
       -linkerOpts "-L/usr/local/lib -lpng" \
       -o build/bin/logogen || exit 1