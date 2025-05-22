package PlayersGuide.Opdracht19;
/*
Stefan Kiers
20-05-2025

- Start with the code for computing an array’s minimum and average values (see below)
- Modify the code to use foreach loops instead of for loops

There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):
This is the syntax :

for (type variableName : arrayName) {
  // code block to be executed
}
 */

public class LawsOfFreach {
    public static void main(String[] args) {
        int[] array = {4, 51, -7, 13, -99, 15, -8, 45, 90};
        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
        /*
        The Integer class wraps a value of the primitive type int in an object.
        An object of type Integer contains a single field whose type is int.
        In addition, this class provides several methods for converting an int to a String and a String to an int,
         as well as other constants and methods useful when dealing with an int.
        This is a value-based class;
        programmers should treat instances that are equal as interchangeable and should not use instances for synchronization,
         or unpredictable behavior may occur.
        For example, in a future release, synchronization may fail
        */

        /*

         */
        for (int valueOfArray : array) {
            {
                if (valueOfArray < currentSmallest) currentSmallest = valueOfArray;
            }
        }
        System.out.println(currentSmallest);

        int total = 0;
        for (int valueOfArray : array)
            total += valueOfArray;
        double average = (double) total / array.length;
        System.out.println(average);
    }
}

