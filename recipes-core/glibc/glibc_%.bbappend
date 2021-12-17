# https://github.com/dotnet/core/YoctoInstructions.md
do_install_append() {
    if [ "${TARGET_ARCH}" = "x86_64" ]; then
      mkdir -p ${D}/lib64
      ln -sf ${D}/lib/ld-linux-x86-64.so.2 ${D}/lib64/ld-linux-x86-64.so.2
    fi
}

FILES_${PN}_append = " /lib64/ld-linux-x86-64.so.2"
