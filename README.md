### WATER MANAGEMENT

This project is returning a water bill when a set of parameters are given. 
The parameters are: apartment type, number of residents, ratio allocated for Corporation and Borewell.

## Requirements
- Java 8
- Install Gradle

## Testing

run `gradle test` to run the tests
or `./gradlew test` 

## Running the application
To run the application, run the following command:
`gradle run -args="sample_input/input4.txt"`

Change the file location accordingly or change the content of the file accordingly.

Some improvements to 
- add are remove the magic numbers in the `WaterAllotment.java`
- Make the WaterAllotment class a class
 