package LesOpdrachten.StringOpdracht;
import java.util.Scanner;

/*
Stefan Kiers
21-05-2025

Gegeven een willekeurige string als invoer, reverse deze string:
Abcdef -> fedcba

Bonus : Check of palindrome.

 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input to Reverse String : ");
        String originalString = scanner.nextLine();
        StringBuilder reversedString = new StringBuilder();

        // Option 1 : works!
        for (int i = 0; i < originalString.length(); i++) {
            reversedString.insert(0, originalString.charAt(i));
        }

        // option 2 : works!
        StringBuilder stringBufferMethod = new StringBuilder(originalString);
        stringBufferMethod.reverse();

        System.out.println(reversedString); // option 1 output
        System.out.println(stringBufferMethod);

        if (reversedString.toString().equals(originalString)){
            System.out.println("Palindrome : Si! Palingdroom");
        } else {
            System.out.println("Palindrome : No Senor. no Palindroom!");
        }
    }
}
