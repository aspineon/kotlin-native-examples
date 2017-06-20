#kotlinc src/main/kotlin/logogen.kt
#kotlinc -target macbook src/main/kotlin/logogen.kt src/main/kotlin/stdio/stdio.kt src/main/kotlin/png/png.kt -library build/c_interop/png build/c_interop/stdio

konanc $COMPILER_ARGS -target macbook src/main/kotlin/logogen.kt \
       -library build/c_interop/stdio \
       -library build/c_interop/png \
       -o build/bin/logogen || exit 1