#! /bin/bash
java8JreSize=`du -sh $JAVA_8_HOME/jre/`
jlinkSize=`du -sh jlinkdemo`
echo "Java8 JDK size:  $java8JreSize"
echo "jlinkdemo size:  $jlinkSize"

