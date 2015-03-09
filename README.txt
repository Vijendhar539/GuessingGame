Assumptions:
a) User will only choose a positive Integer number (0 to Integer.MAX_NUMBER)
b) Assuming that user is ready after picking up the number.

Run Instructions:

Using CommandLine:
>java NumberGuessingMain

Maven:
mvn exec:java -Dexec.mainClass="com.practice.main.NumberGuessingMain"


Overview:

Main program is responsible for creating the actors in the GuessingGame and calling the
runGame on the playGuessingGame object. The program uses the idea of BinarySearch approach.
The runtime complexity of the algorithm is O(logn). The space complexity is negligible as it uses
few variables to store the state of search.

The Logic work as below, Assuming that user always chooses a positive Integer, The range of the
binary search assumes as 0 to INT_MAX. The program start with initial guess as
INT_MAX/2 ( which is low + high / 2 ( i.e. (0 + INT_MAX)/2  ), Depending
on the user response, The program changes boundaries of low value and high value based on the previous guessed values.
The process repeats until the user says YES.

