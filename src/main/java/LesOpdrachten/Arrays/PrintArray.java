package LesOpdrachten.Arrays;
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
        Scanner scanner = new Scanner(System.in);



        int num_items = scanner.nextInt();

        scanner.close();
    }
}
