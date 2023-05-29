# AscendingPerfectSquares
Demo code for Ascending Perfect Squares problem

This project contains demonstration code that will take a series of numbers and return any values that are perfect squares in ascending order.

Ex: [1, 33, 4, 16, 9, 55, 2] should return [1, 4, 9, 16]

## Requirements
Java 1.8+, Maven 3.9.x

## Assumptions 
The list of numbers will be passed as an argument to main.  

Build by running:

`mvn clean install`

The install goal also runs the unit tests - if you want to solely run the tests you can invoke:

`mvn test`

To invoke the program:

`java -cp target/AscendingPerfectSquares-0.0.1-SNAPSHOT.jar org.tarver.app.Demo 1 33 4 16 9 55 2`

## Notes
If any arguments are not valid integers, they will be ignored.

The program prints the list of valid integers, then the perfect squares in ascending order.

```
java -cp target/AscendingPerfectSquares-0.0.1-SNAPSHOT.jar org.tarver.app.Demo 1 33 4 16 9 55 2
List of valid integers:
[1, 33, 4, 16, 9, 55, 2]
List of perfect squares in ascending order:
[1, 4, 9, 16]
```
