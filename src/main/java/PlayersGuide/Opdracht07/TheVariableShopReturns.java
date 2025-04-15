package PlayersGuide.Opdracht07;
/*
Stefan Kiers
15-04-'25

Modify your Variable Shop program to assign a new, different literal value to each of the 9 original
variables. Do not declare any additional variables.
Use System.out.println to display the updated contents of each variable.

Syntax for declaring variables :
type variableName = value;
 */

public class TheVariableShopReturns {
    public static void main(String[] args) {

        // String name : Stefan
        String optionalValue = null;
        String firstName = "Stefan";
        String secondName = "NotGonnaSay";
        String placeOfBirth = "Enschede";
        // Byte size : -128 t/m 127

        byte newByte = -128;
        byte areaCodeCity = 053;

        // Short size : -32768 t/m 32767
        short newShort = -32768;
        short myShort = 32767;

        // Int Size : -2147483648 t/m 2147483647
        int newInt = -2147483648;
        int myInt = 2147483647;

        // Long size :  -9223372036854775808 t/m 9223372036854775807
        long newLong = -9223372036854779L;

        // Float : Sufficient for storing 6 to 7 decimal digits
        float newFloat = 19.999999f;

        // Double : Sufficient for storing 15 to 16 decimal digits
        double newDouble = 1.0123456789123456d;

        // Boolean only stores 2 values : true or false!
        boolean newBoolean = true;

        // Char stores single character/letters or values (as used above) from the ASCII table
        // 64 in the ASCII table = @
        char newChar = 64;
        char char1 = 83;
        char char2 = 116;
        char char3 = 101;
        char char4 = 102;
        char char5 = 97;
        char char6 = 110;
        char char7 = 32;


        System.out.println(optionalValue + "\n" + firstName + "\n" + secondName + "\n" + placeOfBirth + "\n" +
                           newByte + "\n" + areaCodeCity + "\n" + newShort + "\n" + myShort
                           + "\n" + newInt + "\n" + myInt + "\n" + newLong + "\n" +
                           newFloat + "\n" + newDouble + "\n" + newBoolean + "\n" + newChar + char7 +
                           char1 + char2 + char3 + char4 + char5 + char6);

    }
}
