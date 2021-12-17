
DESCRIPTION = ".NET Core 6.0 Runtime (v6.0.0) - Linux x86_64 Binaries"
HOMEPAGE = "https://dotnet.microsoft.com/en-us/download/dotnet/6.0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9fc642ff452b28d62ab19b7eea50dfb9"

SOURCE_FILE = "dotnet-runtime-6.0.0-linux-x64.tar.gz"
SOURCE_URL = "https://download.visualstudio.microsoft.com/download/pr/0ce1c34f-0d9e-4d9b-964e-da676c8e605a/7a6c353b36477fa84f85b2821f2350c2/${SOURCE_FILE}"


SRC_URI = "${SOURCE_URL};unpack=0 \
           file://LICENSE.txt \
"
SRC_URI[sha512sum] = "7cc8d93f9495b516e1b33bf82af3af605f1300bcfeabdd065d448cc126bd97ab4da5ec5e95b7775ee70ab4baf899ff43671f5c6f647523fb41cda3d96f334ae5"

RCONFLICTS:${PN} += "dotnet"

include dotnet_installer.inc
