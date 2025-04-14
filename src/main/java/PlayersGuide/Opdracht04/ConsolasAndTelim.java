package PlayersGuide.Opdracht04;
import java.util.Scanner;

/*
Exercise 4 of the Players Guide
Stefan Kiers
14-04-'25

Make a program that that asks input from the user to show who has rights to the bread.
 */

public class ConsolasAndTelim {
    public static void main(String[] args) {
        Scanner myName = new Scanner(System.in);

        System.out.println("The bread is ready!\nFor who is the bread?");
        System.out.print("Type name : " ); String callName = myName.nextLine();
        System.out.println(callName + " got his bread!");
    }
}
