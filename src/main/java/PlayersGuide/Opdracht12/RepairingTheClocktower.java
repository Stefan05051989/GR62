package PlayersGuide.Opdracht12;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
Stefan Kiers
23-04-'25
Players Guide : repairing the clocktower

Take a number as input from the console.
Display the word “Tick” if the number is even. Display the word “Tock” if the number is odd.
Hint: Remember that you can use the remainder operator to determine if a number is even or odd.

 */

public class RepairingTheClocktower {
    public static void main(String[] args) {
        // create new object for the user input
        Scanner myObject = new Scanner(System.in);
        System.out.println("Welcome to The Clocktower" + "\n" + "Enter a number between 0 & 59 : ");

        // declare
        int myNumb = myObject.nextInt();

        // if : input - modules 2 (percentages) == (is equal to 0) : is even / is odd
        if (myNumb % 2 == 0){
            System.out.println(myNumb + " is even.");
        }else{
            System.out.println(myNumb + " is odd.");
        }
    }
}
