package LesOpdrachten;
import java.util.Scanner;

/*
Stefan Kiers
07-05-'25

Create a program that allows the user to encrypt en message after input.

 */


public class CeasarsCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Define variables : you need a word to encrypt, and a message to output.
         */
        String wordToEncrypt = "";
        String outputWord = "";

        // Start the program with a welcoming message.
        System.out.println("Enter the message you want to encrypt : ");
        /*
        WTE = what the user puts in (input on the line!), convert this message to all uppercase letters.
         */
        wordToEncrypt = input.nextLine().toUpperCase();
        /*
        For loop : integer i = 0, (when) i  = < (greater than) the word to encrypt, in it's entire length, put a char at i.
        This means that java will compile the message to put a char data type on every item in user input.

         */
        for (int i = 0; i < wordToEncrypt.length(); i++){
            int number = wordToEncrypt.charAt(i);
            if (number > 64 && number < 91){
                number = number + 3;
                if (number > 90){
                    number = number - 26;
                }
            }
            char charNew = (char) (number);
            outputWord = (charNew + outputWord);
        }
        System.out.println("The awnser is : ");
        System.out.println(outputWord);
    }
}
