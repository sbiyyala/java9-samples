Run from classes:

    java --module-path target/classes -m jlinkdemo/net.nycjava.jlinkdemo.Main

Run from jar:

    java -p target/jlinkdemo-1.0-SNAPSHOT.jar -m jlinkdemo/net.nycjava.jlinkdemo.Main

Link:

    /Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/bin/jlink \
        --strip-debug \
        --compress=2 \
        --module-path /Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home/jmods:target/jlinkdemo-1.0-SNAPSHOT.jar \
        --add-modules jlinkdemo \
        --output jlinkdemo  \
        --launcher run=jlinkdemo/net.nycjava.jlinkdemo.Main \
        --no-header-files \
        --no-man-pages

Run from linked command:

    jlinkdemo/bin/run

Compare size:

    du -sh /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/

    du -sh jlinkdemo
