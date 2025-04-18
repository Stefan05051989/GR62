package PlayersGuide.Opdracht10;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
Stefan Kiers
17-04-'25
Create a program that allows users to enter how many provinces, duchies, and estates they have.
Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
Display the point total to the user.
 */

public class TheDominionOfKings {
    public static void main(String[] args) {
        String kingMelik = "Melik";
        String kingCasik = "Casik";
        String kingBalik = "Balik";

        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("What is your name?" + "\n" + "Enter 1: " + kingMelik + "\n" + "Enter 2: " + kingCasik + "\n" +
                               "Enter 3: " + kingBalik);
            System.out.print("Your choice : ");
            int input = scanner.nextInt();
            String selectedKing;

            switch (input) {
                case 1:
                    selectedKing = kingMelik;
                    break;
                case 2:
                    selectedKing = kingCasik;
                    break;
                case 3:
                    selectedKing = kingBalik;
                    break;
                default:
                    selectedKing = "Unknown.";
            }

            if (selectedKing.equalsIgnoreCase("Unknown")) {
                System.out.println("Invalid selection" + "\n" + "Please select any option as stated above.");
                return;
            }
            System.out.println("Hello King " + selectedKing);

            System.out.println("How many Estates do you have?" + "\n" + "Enter here :");
            int myEstates = scanner.nextInt();
            System.out.println("How many Duchies do you have?" + "\n" + "Enter here :");
            int myDuchies = scanner.nextInt();
            System.out.println("How many Provinces do you have?" + "\n" + "Enter here :");
            int myProvinces = scanner.nextInt();

            int totalScore = myEstates * 1 + myDuchies * 3 + myProvinces * 6;
            System.out.println("My total score is : " + totalScore);
            scanner.nextLine();

            System.out.println("Would you like to return to start? " + "\n" + "Enter Y/N : ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("You will be re-directed to the start.");
            }else{
                System.out.println("Thank you for using the Dominion Calculator.");
                repeat = false;
            }
        }
    }
}
