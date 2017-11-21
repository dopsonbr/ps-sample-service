#!/bin/sh

echo '************************************************************************'
echo "waiting for the config server to start on port $CONFIG_SERVER_PORT"
echo '************************************************************************'

while ! `nc -z config-server $CONFIG_SERVER_PORT `;
  [ ca ]; do sleep 3; done
echo '>>>>>>>>>>>>>>> config server has started'

java -agentlib:jdwp=transport=dt_socket,address=5006,server=y,suspend=n \
	-Djava.security.egd=file:/dev/./urandom \
	-Dspring.cloud.config.uri=$CONFIG_SERVER_URI
	-jar /work/*.jar 
