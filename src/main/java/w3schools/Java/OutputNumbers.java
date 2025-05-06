package w3schools.Java;

/*
Stefan Kiers
03-05-'25

explanation to printing numbers and mathematical statements in Java
 */

public class OutputNumbers {
    public static void main(String[] args) {
        /*
        Printing numbers doesn't require double quotes, you can just add them to the print statement.
         */
        System.out.println(123); // print on one line
        System.out.print(1);// print all three statements on one line
        System.out.print(2);
        System.out.print(3);
        System.out.println(); // here im using an empty statement to create a blank line

        /*
        You can also perform mathematical calculations inside the println() method
         */
        System.out.println(1+2);
        System.out.println(2345654 * 4);
        System.out.println(100 - 50);
        System.out.println(20 % 50);
    }
}
