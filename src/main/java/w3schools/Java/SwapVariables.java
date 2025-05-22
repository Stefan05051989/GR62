package w3schools.Java;
/*
Stefan Kiers
04-05-'25

Here i wil explain how to swap 2 variables

off topic
a++ = +1
++a = +1 with variables.


 */

public class SwapVariables {
    public static void main(String[] args) {
        // you can declare multiple variables if they are from the same type, like this :
        int a, b, c, d; // <-
        a = 10;
        b = 20;



        a = b;
        b = a;



        System.out.println(a);
        System.out.println(b);


        /*
        You would expect the outcome to be :
        20
        30
        40
        10
        But you have overwritten the value of int A with int B, the code reads from top to bottom.
        That's because you have to store 1 value in a temp

         */

    }
}
