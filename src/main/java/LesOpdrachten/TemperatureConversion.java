package LesOpdrachten;

/*
Stefan Kiers
07-05-'25

Writ a program that converts the temperature from Celsius to Fahrenheit, and vice versa.
This time with the correct formula.
 */

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose 1 for Fahrenheit, Choose 2 for Celsius : ");
        int choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter the temperature in Fahrenheit : ");
            float fahrenheit = scanner.nextFloat();
            float celcius = (fahrenheit - 32) / 1.8f;
            System.out.println(STR."It's \{celcius}degrees Celsius.");
        }else {
            System.out.print("Enter the temperature in Celsius : ");
            float celcius = scanner.nextInt();
            float fahrenheit = (celcius * 9/5) + 32;
            System.out.println(STR."It's \{fahrenheit} degrees Fahrenheit");

            }
        scanner.close();
    }
}
