
DESCRIPTION = ".NET Core 6.0 SDK (v6.0.100) - Linux x64 Binaries"
HOMEPAGE = "https://dotnet.microsoft.com/download/dotnet/6.0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9fc642ff452b28d62ab19b7eea50dfb9"

SOURCE_FILE = "dotnet-sdk-6.0.100-linux-x64.tar.gz"

SRC_URI = "https://download.visualstudio.microsoft.com/download/pr/17b6759f-1af0-41bc-ab12-209ba0377779/e8d02195dbf1434b940e0f05ae086453/${SOURCE_FILE};unpack=0 \
           file://LICENSE.txt \
"
SRC_URI[sha512sum] = "cb0d174a79d6294c302261b645dba6a479da8f7cf6c1fe15ae6998bc09c5e0baec810822f9e0104e84b0efd51fdc0333306cb2a0a6fcdbaf515a8ad8cf1af25b"

inherit native

S="${WORKDIR}"

do_install() {
    echo "Installing ${DESCRIPTION} ..."

    install -d ${D}${bindir}
    tar -xvzf ${WORKDIR}/${SOURCE_FILE} -C ${D}${bindir}
}

INSANE_SKIP_${PN}  = "already-stripped"
