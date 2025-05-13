package PlayersGuide.Opdracht17;
import PlayersGuide.Utils.Colours;
//import java.util.Scanner;
//import PlayersGuide.Methods.*;
//


/*
Stefan Kiers
13-05-'25

 - Write a program that will loop through the values between 1 and 100 and display what kind of blast
the crew should expect. (The % operator may be of use.)
 - Change the color of the output based on the type of blast. (For example, red for Fire, yellow for
Electric, and blue for Electric and Fire).

A partial output of the desired program looks like this:

1: Normal
2: Normal
3: Fire
4: Normal
5: Electric
6: Fire
7: Normal

 */


public class TheMagicCanon {
    public static void main(String[] args) {


        for (int index = 1; index < 100; index++){
            if (index % 3 == 0 && index % 5 == 0){
                System.out.println(STR."\{Colours.BLUE_BOLD}KAMEHAMEHARAKET\{Colours.RESET}");
            }else if(index % 3 == 0){
                System.out.println(STR."\{Colours.RED_BOLD}Zonuh grote vuurbal jonguh\{Colours.RESET}");
            } else if (index % 5 == 0) {
                System.out.println(STR."\{Colours.YELLOW_UNDERLINED}PIKAPIKATSJOE\{Colours.RESET}");
            }else {
                System.out.println("losse flodder..");
            }
        }
    }
}
