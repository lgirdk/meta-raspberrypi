FILESEXTRAPATHS_prepend := "${THISDIR}/linux-raspberrypi:"

LINUX_VERSION ?= "4.19.57"
LINUX_RPI_BRANCH ?= "rpi-4.19.y"

SRCREV = "e95c533eba52d1879d94bdd1ede00548ad1cf622"
SRC_URI = " \
    git://github.com/raspberrypi/linux.git;protocol=git;branch=${LINUX_RPI_BRANCH} \
    "
SRC_URI_append_raspberrypi4-64 = " file://rpi4-64-kernel-misc.cfg"

require linux-raspberrypi.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

KERNEL_EXTRA_ARGS_append_rpi = " DTC_FLAGS='-@ -H epapr'"
