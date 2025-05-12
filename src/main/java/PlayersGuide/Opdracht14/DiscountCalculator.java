package PlayersGuide.Opdracht14;

/*
12-05-'25
Stefan Kiers

Modify your program from before to also ask the user for their name.
If their name equals your name, divide the cost in half.

 */
import java.util.ArrayList;
import java.util.Scanner;

public class DiscountCalculator extends MainBuyingInventory{
    // add scanner as parameter in getDiscount method : getDiscount(Scanner scanner), remove scanner close from method
    static int getDiscount(Scanner scanner){
        //Scanner scanner = new Scanner(System.in);
        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("Stefan");
        userNames.add("Carlo");
        userNames.add("Siem");
        userNames.add("Marijn");
        userNames.add("Jelle");

        System.out.println("Enter your name: ");
        String employeeName = scanner.nextLine();
        if(userNames.contains(employeeName)){
            System.out.println("Hey " + employeeName + " you get discount!");
            return 50;
        }else {
            return 0;
        }
    }
}
