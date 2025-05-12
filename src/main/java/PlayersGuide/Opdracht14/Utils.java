package PlayersGuide.Opdracht14;
/*
Stefan Kiers
12-05-'25

Modify your program from before to also ask the user for their name.
If their name equals your name, divide the cost in half.
 */

import java.util.Scanner;

public class Utils  extends MainBuyingInventory {
    public static int price(int choice) {
        switch (choice) {
            case 1:
                return 10;
            case 2:
                return 15;
            case 3:
                return 25;
            case 4, 7:
                return 1;
            case 5:
                return 20;
            case 6:
                return 200;
            default:
                System.out.println("That product doesn't exists, please choose a productnumber between 1 and 7 : ");
                return 0;
        }
    }

    public static int makeChoice(Scanner scanner) {
        int product = -1;
        //Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What product would you like to see the price of?");
            System.out.println("1 - Rope");
            System.out.println("2 - Torches");
            System.out.println("3 - Climbing Equipment");
            System.out.println("4 - Clean Water");
            System.out.println("5 - Machete");
            System.out.println("6 - Canoe");
            System.out.println("7 - Food Supplies");
            System.out.println("Enter the number of the product : ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Returning to main menu.");
                return 0;
            }
            try {
                product = Integer.parseInt(input);
                if (product >= 1 && product <= 7) {
                    return product;
                } else {
                    System.out.println("Please enter a number between 1 & 7 ; ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number ; ");
            }
            //parseint throws error because it cannot convert "no" into numbers.
            //int product = Integer.parseInt(scanner.nextLine());
            return product;
        }
    }
}

