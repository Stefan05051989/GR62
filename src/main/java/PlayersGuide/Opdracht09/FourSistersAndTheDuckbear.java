package PlayersGuide.Opdracht09;
import java.util.Scanner;

/*
Stefan Kiers
15-04-'25

Create a program that lets the user enter the number of chocolate eggs gathered that day.
Using / and %, compute how many eggs each sister should get and how many are left over for the
duckbear.
Answer this question: What are the total egg counts where the duckbear gets more than each
sister does? You can use the program you created to help you find the answer.

formula : eggs per sister v= numbers of eggs / 4;
          eggs for the duckbear = number of eggs % 4
 */

public class FourSistersAndTheDuckbear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of eggs found : ");
        int numberOfEggs = input.nextInt();
        int eggsPerSister = (numberOfEggs / 4);
        System.out.println("Each sister will get : " + eggsPerSister + " eggs.");
        int eggsForTheDuckbear = (numberOfEggs % 4);
        System.out.println("The Duckbear gets : " + eggsForTheDuckbear + " eggs.");

        for(int eggs = 0; eggs < 1000; eggs++){
            if (eggs % 4 > eggs /4){
                System.out.println("The duckbear gets more eggs at " + eggs + "eggs in total." );
            }
        }
        input.close();
    }
}
