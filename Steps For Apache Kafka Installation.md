https://www.youtube.com/watch?v=2wQ2XIy5WDM

# Steps For Apache Kafka Installation



1. ### Logs Directory Path

 

log.dirs=/tmp/kraft-combined-logs ----> log.dirs=(kafka Folder Path)/kraft-combined-logs





### 2\. Generate a Cluster UUID



.\\bin\\windows\\kafka-storage.bat random-uuid





### 3\. Format Log Directories



.\\bin\\windows\\kafka-storage.bat format --standalone -t (Generated Cluster UUID) -c config\\server.properties





### 4\. Start the Kafka Server



.\\bin\\windows\\kafka-server-start.bat config\\server.properties

