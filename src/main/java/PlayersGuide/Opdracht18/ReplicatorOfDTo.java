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
        // Java suggested : String can be replaced with template
        /*
        This class contains various methods for manipulating arrays (such as sorting and searching).
        This class also contains a static factory that allows arrays to be viewed as lists.
        The methods in this class all throw a NullPointerException, if the specified array reference is null,
            except where noted.
        The documentation for the methods contained in this class includes brief descriptions of the implementations.
        Such descriptions should be regarded as implementation notes, rather than parts of the specification.
         Implementors should feel free to substitute other algorithms, so long as the specification itself is adhered to.
        (For example, the algorithm used by sort(Object[]) does not have to be a MergeSort,
         but it does have to be stable.)
        This class is a member of the Java Collections Framework.
         */

        System.out.println(STR."Original Array : \{Arrays.toString(replicator)}");
        // difference between String template (original) and my version (flipped) :
        System.out.println("Flipped Array : " + Arrays.toString(replicator2));

        scanner.close();
    }
}
