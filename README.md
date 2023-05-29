# AscendingPerfectSquares
Demo code for Ascending Perfect Squares problem

This project contains demonstration code that will take a series of numbers and return any values that are perfect squares in ascending order.

Ex: [1, 33, 4, 16, 9, 55, 2] should return [1, 4, 9, 16]


Requires Java 1.8+, Maven 3.9.x

Assumptions - the list of numbers will be passed as an argument to main.  

Build by running:
mvn clean install

this runs the unit tests, you can run them explicitly with
mvn test

To invoke the program:
java -cp target/AscendingPerfectSquares-0.0.1-SNAPSHOT.jar org.tarver.app.Demo 1 33 4 16 9 55 2

If any arguments are not valid integers, they will be omitted from further processing.
The program prints the list of numbers to be processed, then the list of perfect squares in ascending order.
'
java -cp target/AscendingPerfectSquares-0.0.1-SNAPSHOT.jar org.tarver.app.Demo 1 33 4 16 9 55 2

List of valid integers:
[1, 33, 4, 16, 9, 55, 2]
List of perfect squares in ascending order:
[1, 4, 9, 16]
'
