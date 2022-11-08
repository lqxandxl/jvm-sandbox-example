source /etc/profile
cd ./target
echo > nohup.out
kill -9 $(ps -ef | grep ClockTest-1.0-SNAPSHOT | awk '{print $2}' | xargs)
nohup java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar ClockTest-1.0-SNAPSHOT.jar &
