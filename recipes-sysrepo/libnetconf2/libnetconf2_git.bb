SUMMARY = "libnetconf2 is a NETCONF library in C intended for building NETCONF clients and servers"
DESCRIPTION = "The library provides functions to connect NETCONF client and server to each other via SSH and to send, receive and process NETCONF messages."
SECTION = "libs"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08a5578c9bab06fb2ae84284630b973f"

SRC_URI = "git://github.com/CESNET/libnetconf2.git;protocol=https;branch=devel"

PV = "2.1.23+git${SRCPV}"
SRCREV = "9b7f03e050f38866275772de62c0b7a305e71268"

S = "${WORKDIR}/git"

DEPENDS = "libssh openssl libyang libxcrypt libpam"

inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
#EXTRA_OECMAKE = " -DCMAKE_INSTALL_PREFIX:PATH=/usr -DCMAKE_BUILD_TYPE:String=Release -DLIBYANG_INCLUDE_DIR=/usr/include -DLIBYANG_LIBRARY=/usr/lib "
EXTRA_OECMAKE = " -DCMAKE_INSTALL_PREFIX:PATH=/usr -DCMAKE_BUILD_TYPE:String=Release "

BBCLASSEXTEND = "native nativesdk"
