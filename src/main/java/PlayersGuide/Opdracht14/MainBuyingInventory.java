package PlayersGuide.Opdracht14;

/*
Stefan Kiers
12-05-2025

Build a program that will show the menu illustrated above.
Ask the user to enter a number from the menu.
Using the information above, use a switch (either type) to show the item’s cost.

Rope
Torches
Climbing Equipment
Clean Water
Machete
Canoe
Food Supplies

 */

import java.util.Scanner;

public class MainBuyingInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueShopping = true;
        System.out.println("Welcome to the Store");
        int discount = DiscountCalculator.getDiscount(scanner);

        while (continueShopping) {
            int product = Utils.makeChoice(scanner);
            int price = Utils.price(product);
            System.out.println("Price is " + price * discount / 100 + " gold");

            System.out.println("Would you like to see the price of another product? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                continueShopping = false;
                System.out.println("Thank you for shopping with us! ");
            }
        }
        // close scanner here, remove all the other scanners and give add them ass parameters in all the other methods.
        scanner.close();
    }
}

