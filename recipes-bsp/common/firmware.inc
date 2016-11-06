RPIFW_DATE ?= "20160620"
RPIFW_SRC_URI ?= "https://github.com/raspberrypi/firmware/archive/1.${RPIFW_DATE}.tar.gz"
RPIFW_S ?= "${WORKDIR}/firmware-1.${RPIFW_DATE}"

SRC_URI = "${RPIFW_SRC_URI}"
SRC_URI[md5sum] = "de5d279832d5a4bc4d391201b4ea479a"
SRC_URI[sha256sum] = "e503360cbbbae2a70a0ae2d60d067d6dbf98cf88d23fc920194bec39b978b8e0"

PV = "${RPIFW_DATE}"
