package PlayersGuide.Opdracht13;

/*
Stefan Kiers
12-05-2025

Ask the user for an x value and a y value. These are coordinates of
the enemy relative to the watchtower’s location. Positive x-values are east,
positive y-values are north (as they would be on a normal graph)
Using if statements and relational operators, display a message about what direction the enemy is coming from.
For example, “The enemy is to the northwest!” or “The enemy is here!

if : input is less / more than var, output location.
operators :
> = Greater then
< = Less than
== Equal to
&& = Returns true when both statements are true.

                            X
                x < 0       x = 0       x > 0
        y > 0     NW          N           NE

    Y   y = 0     W           ! (0)       E

        y < 0     SW          S           SE

 */

import java.util.Scanner;


public class Watchtower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String north = "North!";
        String south = "South!";
        String east = "East!";
        String west = "West!";
        String northWest = "North-West!";
        String northEast = "North-East!";
        String southWest = "South-West!";
        String southEast = "South-East!";



        System.out.println("What column is the enemy?");
        int X = scanner.nextInt();
        System.out.println("What row is the enemy?");
        int Y = scanner.nextInt();

        if (X == 0 && Y == 0) System.out.println("The enemy is Here!");// X = 0, Y = 0.


        if (X == 0 && Y > 0) System.out.println("The enemy is " + north); // X = 0, Y = +1
        if (X == 0 && Y < 0) System.out.println("The enemy is " + south);// X = 0, Y = -1
        if (X > 0 && Y == 0) System.out.println("The enemy is " + east); // X = +1, Y = 0
        if (X < 0 && Y == 0) System.out.println("The enemy is " + west); // X = 0, Y = -1

        if (X < 0 && Y > 0) System.out.println("The enemy is " + northWest); //
        if (X > 0 && Y > 0) System.out.println("The enemy is " + northEast); //
        if (X < 0 && Y < 0) System.out.println("The enemy is " + southWest); //
        if (X > 0 && Y < 0) System.out.println("The enemy is " + southEast); //


        scanner.close();

    }
}
