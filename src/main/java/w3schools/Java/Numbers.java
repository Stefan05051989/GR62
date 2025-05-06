package w3schools.Java;

public class Numbers {
    public static void main(String[] args) {
        /*
        Primitive numbers are divided into 2 groups : integer type and floating point type.
        Integer types are : byte, short, int and long.
        The integer types are numbers without decimals, possitive or negative.
        byte : -128 to 127.
        short : -32768 to 32767.
        int : -2147483648 to 2147483647.
        long : -9223372036854775808L to 9223372036854775807L.
         - NOTE THAT THE LONG DATA TYPE ENDS WITH AN L AT THE END!
        Floating point types are : float and double
        float : use whenever you need a number with a decimal like 9.99 of 3.14545
        float : 9.99f;
        Float also ends with a specific character at the end, f.
        Double : 19.99d;
        Double also ends with a specific character, d.

        These to compared, it is safer to use double in most calculations because
        a double has a precision of 16 digits, while the float only has 6 or 7, depening onde size before the comma.
         */
        float myFloat = 5.75f;
        double myDouble = 19.99d;
        System.out.println("My float + my double = " + (myFloat + myDouble));
        // notice that the parameters are inclosing the calculation in the method!
        // if these were not there, the outcome would be very different.

        /*
        Also, a floating point can be a
        specific number with an "e" to indicate the power of 10, like so:
         */
        float f1 = 35e3f;
        // 35 (e = * 10 to the power of 3)
        // e means :  * 10 to the power of . . .
        // 35 * 10 * 10 * 10 + = 35000.0
        double d1 = 12E4d;
        // 12 (E = 10 to the power of...)
        // 12 (E to the power 0f 4 =
        // 12 * 10 * 10 * 10 * 10 = 120000.0
        System.out.println(f1);
        System.out.println(d1);
    }
}
