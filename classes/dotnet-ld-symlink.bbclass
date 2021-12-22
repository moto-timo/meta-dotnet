# For pre-built or externally built .NET stand-alone binaries
# or Yocto Project built binaries without inheriting multilib.
RDEPENDS_$PN}_append = " packagegroup-dotnet-deps"
RDEPENDS_${PN}_append = " dotnet-ld-symlink"
