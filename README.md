# take-home-challenge
 Autodesk Infrastructure Engineer coding challenge

## Installation and run guide
STEP 1: install JDK 1.8.0_202 or above <br />
STEP 2: install Maven 3.6.3 or above <br />
STEP 3: configure $JAVA_HOME at the system  level as an Environment Variable<br />
STEP 4: configure $MAVEN_HOME at the system level as an Environment Variable<br />
STEP 5: Clone the git code <br />
STEP 6: Open terminal at project root directory <br />
        <Strong> (TO RUN)</Strong> mvn spring-boot:run<br />
        <Strong>(TO execute UNIT TESTS) </Strong>mvn test    <br />
        
## Testing scenarios

To run application in debug mode change log level to<Strong> DEBUG</Strong> in <br />
 <ins><Strong>take-home-challenge/src/main/resources/application.properties</Strong><br /></ins>
 
 To test application from command line <br />

<Strong> REQUEST 1:  curl -i  http://localhost:8080/ <br /> 
REQUEST 2: curl -i --header "content-type:application/json"  http://localhost:8080/<br /> </Strong>

## Other trace out help
1) We may need to restart (windows)system after configuring Environment Variable in step 3&4 <br />
2) If default port is already in use, please update it from <ins><Strong>take-home-challenge/src/main/resources/application.properties</Strong><br /></ins><br />

 
