package LesOpdrachten.Arrays;
import LesOpdrachten.Methods.OddEvenTest.IsOdd;

import java.util.Arrays;
import java.util.Scanner;


/*
Stefan Kiers
05-05-2025

- Schrijf een programma met de naam PrintArray dat de gebruiker vraagt om het aantal items in een array
 (een niet-negatief geheel getal) en het opslaat in een int variable met de naam NUM_ITEMS.
- Vervolgens wordt de gebruiker gevraagd om de waarden van alle items en worden deze opgeslagen
  in een int array met de naam items.
- Het programma zal dan de inhoud van de array afdrukken in de vorm van [x1, x2, ..., xn]

Bonus:
Laat het programma de inhoud van de array in een grafische vorm afdrukken
waarbij de waarden worden weergegeven door het aantal sterren


 */

public class PrintArray {
    public static void main(String[] args) {
        // create scanner object for input
        Scanner scanner = new Scanner(System.in);
        //welcome message and var / array declaration
        System.out.println("Enter the number of items in the array : ");
        int NUM_ITEMS = scanner.nextInt();
        int[] items = new int[NUM_ITEMS];

        // ask for values
        System.out.println("Enter the values : ");
        for (int i = 0; i < NUM_ITEMS; i++){
            int value;
            do{
                System.out.print("Item " + (i + 1) + ": ");
                value = scanner.nextInt();
                if (value < 0){
                    System.out.println("Enter a non-negative number: ");
                } else if (IsOdd.isOdd(value)) {
                    System.out.println("Enter an even number : ");
                }
            }while (value < 0 || IsOdd.isOdd(value));
            items[i] = value;
        }
        // print array in in format. option 1
        System.out.println("Option 1");
        System.out.print("Array contains: [");
        for (int i = 0; i < NUM_ITEMS; i++){
            System.out.print(items[i]);
            if (i < NUM_ITEMS - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]"+"\n");
        // i didn't take in account that the array was just a virtual
        // printstatement so the brackets where in the wrong places
        // and had to be printed seperately.

        // print array the easier way, option 2
        System.out.println("Option 2");
        System.out.println("Array contains : ");
        System.out.println(Arrays.toString(items));

        System.out.println("Print in different symbols : ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.print("Item " + (i + 1) + " : (" + items[i] + ")");
            for (int j = 0; j < items[i]; j++) {
                System.out.print("*");
                System.out.println();
            }

//        //Bonus for graphical print statement with *
//        System.out.println("Print value's of items in different symbols");
//        for (int j = 0; j < items[NUM_ITEMS]; j++){
//            System.out.println("*");
//        }
        }
        scanner.close();
    }
}
