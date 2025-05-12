package LesOpdrachten;
import java.util.Scanner;

/*
Stefan Kiers
07-05-'25

Create a program that allows the user to encrypt en message after input.

1 : Define variables : you need a word to encrypt, and a message to output.
2 : WTE = what the user puts in (input on the line!), convert this message to all uppercase letters.
For loop : integer i = 0, (when) i  = < (greater than) the word to encrypt, in it's entire length, put a char at i.
This means that java will compile the message to put a char data type on every item in user input.

Edit method : (Intellj tip)
            char charNew = (char) (number);
            outputWord = (charNew + outputWord);
Intellj geeft aan :
String concatenation '+' in loop :  Convert variable outputWord to Stringbuilder.
Adjust to suggested tip, output in code.
*/


public class CeasarsCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wordToEncrypt = "";
        StringBuilder outputWord = new StringBuilder();

        System.out.println("Enter the message you want to encrypt : ");

        wordToEncrypt = input.nextLine().toUpperCase();

        for (int i = 0; i < wordToEncrypt.length(); i++){
            int number = wordToEncrypt.charAt(i);
            if (number > 64 && number < 91){
                number = number + 3;
                if (number > 90){
                    number = number - 26;
                }
            }
            char charNew = (char) (number);
            outputWord.insert(0, charNew);
        }
        System.out.println("The encryptmessage is : " + outputWord);
    }
}
