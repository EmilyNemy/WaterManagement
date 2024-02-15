### WATER MANAGEMENT

This project is returning a water bill when a set of parameters are given. 
The parameters are: apartment type, number of residents, ratio allocated for Corporation and Borewell.

## Requirements
- Java 8
- Gradle

## Testing

run `gradle test` to run the tests
or `./gradlew test` 

## Running the application
To run the application, run the following command:
`gradle run`

Change the file location in the `Main.java` file to the location of the input file.
e.g `String filePath = "sample_input/input4.txt";`

Som improvements to add are remove the magic numbers in the `WaterAllotment.java`