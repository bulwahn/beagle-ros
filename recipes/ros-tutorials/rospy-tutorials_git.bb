DESCRIPTION = "Beginner_tutorials, talker/listener ROS package"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;md5=c96da2dcb1bfa0b951df4c8cb073db67"

DEPENDS = "roscpp"

SRC_URI = "git://github.com/ros/ros_tutorials.git;branch=groovy-devel"

SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCREV}"

S = "${WORKDIR}/git/rospy_tutorials"

inherit catkin
