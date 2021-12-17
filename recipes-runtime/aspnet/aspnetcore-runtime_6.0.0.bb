
DESCRIPTION = "ASP.NET Core 6.0 Runtime (v6.0.0) - Linux x64 Binaries"
HOMEPAGE = "https://dotnet.microsoft.com/en-us/download/dotnet/6.0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9fc642ff452b28d62ab19b7eea50dfb9"

SOURCE_FILE = "aspnetcore-runtime-6.0.0-linux-x64.tar.gz"
SOURCE_URL = "https://download.visualstudio.microsoft.com/download/pr/0ce1c34f-0d9e-4d9b-964e-da676c8e605a/7a6c353b36477fa84f85b2821f2350c2/
SOURCE_URL = "https://download.visualstudio.microsoft.com/download/pr/a8dd1c9d-1a47-4135-8ad8-7091ff6bbe1e/6af53c3eee71038248937daf4599f06a/${SOURCE_FILE}"


SRC_URI = "${SOURCE_URL};unpack=0 \
           file://LICENSE.txt \
"
SRC_URI[sha512sum] = "6a1ae878efdc9f654e1914b0753b710c3780b646ac160fb5a68850b2fd1101675dc71e015dbbea6b4fcf1edac0822d3f7d470e9ed533dd81d0cfbcbbb1745c6c"

include dotnet_installer.inc
