#! /bin/bash
jdkSize=`du -sh $JAVA_8_HOME/jre/`
jlinkSize=`du -sh jlinkdemo`
echo "JDK size: $jdkSize"
echo "jlinkdemo size: $jlinkSize"

