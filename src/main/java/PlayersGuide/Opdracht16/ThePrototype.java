package PlayersGuide.Opdracht16;
/*
Stefan Kiers
12-05-'25

Build a program that will allow a user, the pilot, to enter a number.
If the number is above 100 or less than 0, keep asking.
Clear the screen once the program has collected a good number (you can just write 50 blank lines to clear the screen :) ).
Ask a second user, the hunter,to guess numbers.
Indicate whether the user guessed too high, too low, or guessed right.
Loop until they get it right, then end the program.

I've made this program before, now i want to add a method for adding a number instead of using
a scanner every time.
 */

import java.util.Scanner;

public class ThePrototype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //new ClearConsole();
        //new WriterMethod();
        int userGuess = -1;

        System.out.println("Hello pilot, fill in the number you want the hunter to find!");
        int numberToGuess = scanner.nextInt();
        // vraag gebruiker nmr in te voeren dmv input tussen 0 en 100
        if (numberToGuess < 0 || numberToGuess > 100) { // als: NTG groter is dan 0 en kleiner dan 100, || geeft waar terug als 1 vd voorwarden klopt
            // of nummer kleiner dan 100..
            System.out.println("Enter a number between 0 and 100");
            if (numberToGuess > 0 || numberToGuess < 100){
                return;
            }
            ; // stopt het programma als het getal ongeldig is, dit moet anders maar geen idee hoe.
        }
        System.out.println("\n".repeat((50))); // de console kan niet worden gecleared,
        // daarom voeg ik 50 lege regels in.

        /*
         WriterMethod.WriterMethod();
         ClearConsole.clearConsole();
         There was a way to "flush" the console but it doesn't work on my computer.
         It's based on the ANSI escape codes, i've added it as a method but it only prints a certain char
         that can't be read on my computer.
         */

        System.out.println("Guess the correct number starting from 0 to 100!"); // console opdracht
        while (userGuess != numberToGuess) {
            // terwijl gebruikersinput != -> niet gelijk is aan -> NTG (te raden nummer...)
            //System.out.println("Guess again !"); // vraag nogmaals
            if (scanner.hasNextInt()) { // als : input geldig geheel getal is
                userGuess = scanner.nextInt(); // input gebruiker : volgende int
                if (userGuess < numberToGuess) { // kleiner dan te raden nummer
                    System.out.println("Too Low! Guess again!"); // output if statement
                } else if (userGuess > numberToGuess) { // groter dan te raden nummer
                    System.out.println("Too high! Guess again!"); // output if statement
                } else { // anders :
                    System.out.println("HIT! Pilot down! "); // nummer geraden
                }
            }
        }
        scanner.close(); // sluit scanner
    }
}
