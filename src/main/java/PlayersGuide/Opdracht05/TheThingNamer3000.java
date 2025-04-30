package PlayersGuide.Opdracht05;
import java.util.Scanner;
/*
Stefan Kiers
14-04-2025
------------------------------------------------------------
System.out.println("What kind of thing are we talking about?");
Scanner input = new Scanner(System.in);
String a = input.next();
System.out.println("How would you describe it? Big? Azure? Tattered?");
String b = input.next();
String c = "of Doom";
String d = "3000";
System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
------------------------------------------------------------
Rebuild the program above on your computer.
Add comments near each of the four variables that describe what they store.
You must use at least one of each comment type
Find the bug in the text displayed and fix it.
Answer this question: Aside from comments, what else could you do to make this code more understandable?
*/

public class TheThingNamer3000 {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        // String a stores the input from the user via Scanner which reply's the question of the first SOUT statement.
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next();
        // String b stores the value of Big, Azure or Tattered that is answered by the input from the user.
        String c = "Doom";
        // String c has the value of the text Doom
        int d = (3000);
        /*String d has the value of the number 3000 (between double quotes -> "3000",
        it is possible to print this, but it is better to assign a variable of int to declare the numbers like
        i did in the program. Int stores the data of numbers, a String makes an object from the numbers.
         */
        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");

        input.close();
    }
}
