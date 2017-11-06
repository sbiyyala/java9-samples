#! /bin/bash
# Run from classes
java --module-path target/classes -m jlinkdemo/net.nycjava.jlinkdemo.Main

# Run from jar
java -p target/jlinkdemo-1.0-SNAPSHOT.jar -m jlinkdemo/net.nycjava.jlinkdemo.Main

# Run from linked command
jlinkdemo/bin/run
