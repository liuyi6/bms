#!/bin/bash



case "`uname`" in
    Linux)
        bin_abs_path=$(readlink -f $(dirname $0))
        ;;
    *)
        bin_abs_path=`cd $(dirname $0); pwd`
        ;;
esac

echo "脚本位置: $bin_abs_path"
base=${bin_abs_path}/..
#base=$(dirname $(cd `dirname $0`;pwd))
echo "base path: $base"
echo "cd to $base"
cd $base


export LANG=en_US.UTF-8
export BASE=$base

echo "cd to: $base"

#can't run repeatedly
if [ -f $base/bin/addr.pid ] ; then
    echo "found bin/addr.pid , Please run stop.sh first ,then startup.sh" 2>&2
    exit 1
fi

## set java path
if [ -z "$JAVA" ] ; then
  JAVA=$(which java)
fi



str=`file $JAVA_HOME/bin/java | grep 64-bit`
if [ -n "$str" ]; then
    JAVA_OPTS="-server -Xms1024m -Xmx1536m -Xmn256m -XX:SurvivorRatio=2 -XX:PermSize=96m -XX:MaxPermSize=256m -Xss256k -XX:-UseAdaptiveSizePolicy -XX:MaxTenuringThreshold=15 -XX:+DisableExplicitGC -XX:+UseConcMarkSweepGC -XX:+CMSParallelRemarkEnabled -XX:+UseCMSCompactAtFullCollection -XX:+UseFastAccessorMethods -XX:+UseCMSInitiatingOccupancyOnly -XX:+HeapDumpOnOutOfMemoryError"
else
    JAVA_OPTS="-server -Xms1024m -Xmx1024m -XX:NewSize=256m -XX:MaxNewSize=256m -XX:MaxPermSize=128m "
fi

JAVA_OPTS=" $JAVA_OPTS -Djava.awt.headless=true -Djava.net.preferIPv4Stack=true -Dfile.encoding=UTF-8"

for i in $base/lib/*;
    do CLASSPATH=$i:"$CLASSPATH";
done


#$JAVA $JAVA_OPTS -classpath .:$CLASSPATH com.jfai.addr.StartUp 1>>$base/bin/nohup.out 2>&1 &
$JAVA $JAVA_OPTS -classpath .:$CLASSPATH com.jfai.addr.StartUp 1>$base/bin/nohup.out 2>&1 &

echo $! > $base/bin/addr.pid
echo "Process addr is running..., pid=$!"