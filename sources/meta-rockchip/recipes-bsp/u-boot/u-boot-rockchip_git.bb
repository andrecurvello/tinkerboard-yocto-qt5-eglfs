# Copyright (C) 2017 Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

DEFAULT_PREFERENCE = "-1"

include u-boot-rockchip.inc

SRC_URI = " \
	git://github.com/rockchip-linux/u-boot.git;branch=release; \
	file://binutils-2.28-ld-fix.patch \
"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
