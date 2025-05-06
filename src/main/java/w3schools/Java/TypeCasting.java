package w3schools.Java;
/*
Stefan Kiers
06-05-'25

Explanation on type casting
 */

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Type casting is when you assign a value of one primitive data type to another.
        There are 2 types of casting, widening and narrowing.
        Widening happens automatically, narrowing has to be done manually.

        Small to large (widening):
        byte -> short -> char -> int -> long -> float -> double.
        Reversed is off course narrowing (other way around)
         */

        // widening (happens automatically)
        // base value :
        int myInt = 9;
        // convert to larger type :
        double myDouble = myInt;
        // print both statements.
        System.out.println(myInt); // outputs 9
        System.out.println(myDouble); // outputs 9.0

        // Narrowing (must be done manually)

        // Declare the syntax for narrowing :
        // myValue = (previous data-type) largerDataType;
        myInt = (int) myDouble;
        // print new output
        System.out.println(myDouble);
        // print output.
        System.out.println(myInt);

        /*
        Here a real life example for calculating a test score :
         */
        // As you can see, we are narrowing the value cause it starts higher
        // the result of the student
        int maxScore = 500;
        int userScore = 423;

        /*
        Calculate the score with the following formula :
        percentage = (float / .00 data-type) userScore divided by maxScore times 100.0f = percentage
         */
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("User's percentage is " + percentage);

        // to check if the calculation is correct, you can also use value's of 100 max to make it easier to check.
    }
}
