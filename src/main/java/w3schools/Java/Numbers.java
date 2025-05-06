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
        // notice that the parameters aere inclosing the calculation!
        // if this was not there, the outcome would be very different.
    }
}
