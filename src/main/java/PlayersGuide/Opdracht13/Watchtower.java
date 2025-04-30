package PlayersGuide.Opdracht13;
import java.util.Scanner;


public class Watchtower {
    public static void main(String[] args) {
        Scanner towerLocation = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int wx = 0;
        int wy = 0;

        int location = towerLocation.nextInt();

        if (x > wx){
            if (y > wy){
                System.out.println("The enemy is north-east.");
            }else{
                System.out.println("The enemy is south-east.");
            }
        }else{
            if(y > wy){
                System.out.println("The enemy is north-west.");
            }else{
                System.out.println("The enemy is south-west.");
            }
        }
    }
}
