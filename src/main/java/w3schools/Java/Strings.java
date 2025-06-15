package w3schools.Java;
/*
15-06-'25
Stefan Kiers

Working with Strings and StringBuilder objects examples

 */

public class Strings {
    public static void main(String[] args) {
        /*
        A String is also a data type, only it is not primitive.
        This data type refers to an object, a sequence of char's so to speak.
        Therefore it is a non-primitive data type.
        Primitive data types a static, a non-primitive data type is not and can
        be valued differently.
        Strings have to be surrounded by "double quotes", unlike char data types
        that have to be surrounded by 'single quotes'.

        Strings can also be named as Object reference data types.

       They are defined in the java API (lava.lang package), and the counting of a string starts at 0.
       Index of last character is : string.length - 1

       Methods of String class :
        - Query position of chars : charAt, indexOf, substring
        - Seem to modify String : substring (also) trim, replace.
        - Others : length, startsWith, endsWith.

         */

        // This is the printable use of a string with can be printed to the console.
        String greeting = "Hello Java.";
        String reply = "Hello User from the interface.";
        System.out.println(greeting);
        System.out.println(reply);

        // You can also make an Object of a String :
        String name = new String("My Name is Stefan");
        // the next printstatement with print the Object value of the String declaration.
        System.out.println(name);
        // Next we will use different methods to extract or clarify specific chars in the string,
        // to make it easier i will make a different object with 10 chars :
        String stringChar = new String("ABCDE");
        // .length will print the length of a string, which is 5 chars.
        System.out.println(stringChar.length());
        // charAt will print the char in the string at the possition given as parameter.
        // 0 will print A
        System.out.println(stringChar.charAt(0));
        // 5 will give exception out of bounds error cause a String starts with 0.
        // it contains 5 chars, but counts 0, 1, 2, 3, 4.
        //System.out.println(stringChar.charAt(5));
        // Index of provides the possition of the specific Char asked as parameter :
        System.out.println(stringChar.indexOf('C')); // prints out 2 (position 3, 3rd char)

        //SUBSTRING
        // Substring : starts printing the string from the position given as parameter in the sub method.
        String exam = "Oracle";
        String sub = exam.substring(2);
        System.out.println(sub);
        // you can also combine these with different mehods like printing the length of the substring :
        System.out.println(sub.length()); // prints out 4
        // combining 2 numbers marks the strats of the 1st, and the end of the last.
        // When we print out 1 and 5, the output will be racl, excluding the 1st and last char.
        String result = exam.substring(1, 5);
        System.out.println(result);

        String varWithSpaces = " AB DE GHI ";
        System.out.print(":"); // prints :
        System.out.print(varWithSpaces); // prints the variable declaration
        System.out.print(":"); // : AB DE GHI :
        System.out.println();
        //TRIM
        // next we are gonna trim the whitespace.
        System.out.print(":"); //
        System.out.print(varWithSpaces.trim()); // trims the whitespace between the doublepoints and the varWithSpaces
        // but not the spaces between the varWithSpaces, because this is not considered whitespace.
        System.out.print(":");
        System.out.println();

        // REPLACE
        // you can also replace chars by switching them in the parameters, seperated by a comma.
        System.out.println(exam.replace('O', 'o'));

        // REPEAT
        // or repeat them several times
        System.out.println(exam.repeat(5));

        // COUNT
        // To count the length, we add the .length method
        System.out.println(exam.length());

        // STARTS - ENDS with
        // you can also identify where a string starts or ends with, this works as a boolean.
        System.out.println(exam.startsWith("Or")); // prints true
        System.out.println(exam.endsWith("cle")); // prints true
        // To check if the char(s) also start at the correct offset, seperate them by a comma
        // and enter the position ( remember a string starts counting at 0)
        System.out.println(exam.startsWith("O", 1)); // prints false
        System.out.println(exam.startsWith("O", 0)); // prints true
        // The same can be aplied with its end :
        System.out.println(exam.endsWith("e"));
        System.out.println(exam.endsWith("cle"));
    }
}
