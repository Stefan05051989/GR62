package PlayersGuide.Opdracht11;
import java.util.Scanner;
// i've made a package for all the colours i'm importing here.
import PlayersGuide.Utils.Colours;
// the awt toolkit from java has multiple options to add to a program.
import java.awt.Toolkit;

/*
Stefan Kiers
18-04-'25
Ask the user for the target row and column.
Compute the neighboring rows and columns of where to deploy the squad.
Display the deployment instructions in a different color of your choosing.
Play a sound with Toolkit.getDefaultToolkit().beep(); when the results have been computed and displayed.
 */
public class TheDefenseOfConcolas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which row will the attack be in : ");
        int row = scanner.nextInt();
        System.out.println("Which column will the attack be in : ");
        int col = scanner.nextInt();

        System.out.println(Colours.BLUE_BOLD + "(" + row + "," + (col+1) + ")" + Colours.RESET);
        System.out.println(Colours.GREEN_BACKGROUND + "(" + row + "," + (col-1) + ")" + Colours.RESET);
        System.out.println(Colours.RED_BOLD + "(" + (row+1) + "," + col + ")" + Colours.RESET);
        System.out.println(Colours.YELLOW_BACKGROUND_BRIGHT + "(" + (row-1) + "," + col + ")" + Colours.RESET);
        Toolkit.getDefaultToolkit().beep();
    }
}
