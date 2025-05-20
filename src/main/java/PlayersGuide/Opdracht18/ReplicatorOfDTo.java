package PlayersGuide.Opdracht18;
import java.util.Arrays;
import java.util.Scanner;

/*
Stefan Kiers
20-05-2025

- Make a program that creates an array of length 5.
- Ask the user for five numbers and put them in the array.
- Make a second array of length 5.
- Use a loop to copy the values out of the original array and into the new one.
- Display the contents of both arrays one at a time to illustrate that the Replicator of D’To works again.
 */

public class ReplicatorOfDTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 Integers to put in an array : ");
        int[] replicator = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt()};



        int[] replicator2 = new int[5];
        for (int i = 0; i < replicator.length; i++){
            replicator2[i] = replicator[replicator.length - 1 - i];
        }
        System.out.println("Original Array : " + Arrays.toString(replicator));
        System.out.println("Flipped Array : " + Arrays.toString(replicator2));

        scanner.close();
    }
}
