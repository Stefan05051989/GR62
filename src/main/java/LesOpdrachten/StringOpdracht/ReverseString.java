package LesOpdrachten.StringOpdracht;

/*
Stefan Kiers
21-05-2025

Gegeven een willekeurige string als invoer, reverse deze string:
Abcdef -> fedcba

Bonus : Check of palindrome.

 */

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "saippuakivikauppias";
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
            System.out.println("Paling");
        } else {
            System.out.println("No Senor");
        }
    }
}
