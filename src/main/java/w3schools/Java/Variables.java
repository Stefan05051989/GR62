package w3schools.Java;
/*
Stefan Kiers
05-05-'25

Here's a program and explanation that explains variables in Java
 */

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        /*
        Primitive variables in java  are : Byte, Short, Int, Long, Float, double, boolean and char.
        Non-Primitive data types are Strings, Arrays and classes.

        To print a variable you need to declare them first.
        Declaration method :
        1 : the type of variable
        2 : the identifier ( unique name for the type of variable)
        3 : a value
        example : int thisInt = 1000; (type variableName = value;
         */
        byte myByte = 1;
        short myShort = 2;
        int myInt = 3;
        long myLong = 4;
        float myFloat = 5.99f;
        double myDouble = 3.55;
        boolean myBoolean = false;
        char myChar = 23;

        System.out.print(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myChar);
        /*
        now they are all printed out in one statement
         */
        System.out.println("-----------------------");
        System.out.println();
        // next example, declaring without assigning a value :

        int a;
        a = 100;
        a = a + 1;
        System.out.println(a + myShort + myInt);

        int b = 1990;
        String c = "Year of birth : ";
        System.out.println(c + b);

        int d = 6;
        int e = 6;
        System.out.println(d + "-" + e + "-" + b);

        String name = "John";
        System.out.println(name);

        System.out.println();

        // you can also overwrith an existing value, assigned to a variable :
        int f = 15; // original value
        f = 20; // overwrites the original value with 20
        System.out.println(f); // prints 20 instead of 15

        // in you don't want others to overwrite you're value, you can use the final keyword.
        /*
         This can be helpfull with value that do not change like
         your date of birth
         your age etc
         something that is definitive and will not change in value over time
         */
        final int yearOfBirth = 1989;
        System.out.println(yearOfBirth);

        /*
        You can also print variables with the + operator which then functions as a mathematical solution :
         */
        int g = 5;
        int h = 6;
        System.out.println(g + h); // will output 11, as 5 + 6 = 11.
        // You can do this with every mathmetical operator
        System.out.println(myByte * myShort); // 1 x 2 = 2

        /*
        you can also declare multiple variables if they are the same type like this :
         */
        int j, k, l, m;
        j = k = l = m = 10;
        System.out.println(j + k + l + m);

    }
}
