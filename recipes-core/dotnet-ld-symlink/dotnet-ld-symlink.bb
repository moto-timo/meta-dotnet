SUMMARY = "Create a symlink for ld-*.so in /lib64 that dotnet hard codes"
LICENSE = "MIT"
LIC_FILES_CHSUM = "files://LICENSE;md5=0835ade698e0bcf8506ecda2f7b4f302"

RDEPENDS:${PN} += "glibc"

COMPATIBLE_HOST = 'x86_64.*-linux'

do_install() {
  install -d ${D}/lib64
}

# This recipe exists such that this symlink is only created ONCE no matter
# how many .NET recipes are built and how many applications are installed.
#
# Creating this symlink in the sysrootfs and building with the dotnet class
# in a recipe leads to host contamination in the way .NET links to the
# /lib64/ld-linux*.so
# 
# https://github.com/dotnet/core/YoctoInstructions.md
pkg_postinst_ontarget_${PN} () {
    mkdir -p /lib64
    ln -sf /lib/ld-linux-x86-64.so.2 /lib64/ld-linux-x86-64.so.2
}

FILES_${PN} += "/lib64"
