#! /bin/bash

rm -rf jlinkdemo

jhome=`echo $JAVA_HOME`
$jhome/bin/jlink \
        --strip-debug \
        --compress=2 \
        --module-path $jhome/jmods:target/jlinkdemo-1.0-SNAPSHOT.jar \
        --add-modules jlinkdemo \
        --output jlinkdemo  \
        --launcher run=jlinkdemo/net.nycjava.jlinkdemo.Main \
        --no-header-files \
        --no-man-pages
