package w3schools.Java;

/*
Stefan Kiers
06-05-'25

Explanation about the add (+) operator
 */

public class Operators {
    public static void main(String[] args) {
        /*
        Operators are used to perform operations on variables and values.
        Like adding to values, incrementing with 1, decrementing with 1 etc.

        There are 5 different groups of operators :
        1 : Arithmetic operators
        2 : Assignment operators
        3 : Comparison operators
        4 : Logical operators
        5 : Bitwise operators
         */

        // + (add) Example :
        int a = 10;
        a += 5; // reads as : a = a + 5;
        System.out.println(a); // prints 15, because 5 + 10 = 15;

        // - (minus) Example :
        int b = 10;
        b -= 5; // a = a - 5
        System.out.println(b); // prints 5 because b(10) = b - 5 = 5.

        // * (times) Example;
        int c = 10;
        c *= 5; // reads as : c = c times 5
        System.out.println(c); // outputs 50 (5 times 10 = 50)

        int d = 10;
        d /= 5;
        System.out.println(d); // 10 divided by 5 = 2

        /*
        This is a tricky one, it doesn't calculate the percentage, it calculates the rest number
        that remains, after the maximum value is divided within the e value.
        the maximum to divide with three, is 3 x 3 (9), so the remaining value is 1 (9 + 1 = 10).
         */
        int e = 10;
        e %= 3;
        System.out.println(e);

        /*
        The & operator is known as the Bitwise operator.
        Bitwise operators work on individual bits, so if you want to work on binary numbers
        and perform operations on/with them, then you need to use bitwise operators.
        They used to be used a lot more than they do now, because computers didn't have as much
        memory before. If you are using devices with limited storage space, they are still very usefull.

        The smallest amount of space that a variable can take up is 1 byte (which is equal to 8 bits)
        The reason for this is it's because it's the smallest unit of addressable space that a CPU
        can reference. Even a Boolean variable that can only have the values of true
        and false, should only take up 1 bit (0000 0001 = true / the 1 represents 1 bit).
        But what it does is, it takes up a whole byte (8 bits / 0000 0001), so the other 7 bits are just wasted space.

         */
        int f = 10;
        f &= 3;
        System.out.println(f);

    }
}
