Java program files are in /src/main/java/com/example/mySpringProject
Ensure OpenJDK ver 11 is installed with JAVA_HOME variable set to the installation location of OpenJDK
Run the program using ./mvnw spring-boot:run in the terminal
In the terminal:
The data of all pilots can be accessed using: curl localhost:4001/pilots
Data of a particular pilot can be accessed by using: curl localhost:4001/pilots/pilot_id
Data of a pilot can be added by: curl -X POST --data  '{\"name\": \"John\", \"base\": \"Munich\",\"workDays\":\"["Monday"]\"}' "https://localhost:4001/pilots/addNew"
