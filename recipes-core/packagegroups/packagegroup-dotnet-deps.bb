SUMMARY = "Packages needed to run standalone DotNet applications"
#
# packages which have content that depends on MACHINE_FEATURES need to be MACHINE_ARCH
#
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# https://github.com/dotnet/core/samples/YoctoInstructions.md
RDEPENDS_${PN} = " \
    libunwind \
    icu \
    libcurl \
    openssl \
"
