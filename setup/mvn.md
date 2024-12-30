#mvn install
---
- apt install maven

### Commands
---
```bash
    # create new simple maven project 
    mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5
    mvn compile # it compile java codes and create a target directory where all .class file will be present
    mvn test # it test the java code and create a .class in same target directory
    mvn clean # it cleans the .class files by deleting the target  
    mvn package # it create a portable package by creating jar file 
    mvn install # it compile, test, unpack the jar and store in linux system at ~/.m2/repository/
                # it also usefull for when dependency is added this Command will download the jar 
    mvn validate
    mvn exec:java -Dexec.mainClass="com.package.MainClass" # run the main application
```

