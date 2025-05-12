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

        // uitkomsten zijn nog niet goed, pas ik later aan. opzet klopt verder.

 */

import java.util.Scanner;


public class Watchtower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What column is the enemy?");
        int X = scanner.nextInt();
        System.out.println("What row is the enemy?");
        int Y = scanner.nextInt();

        if (X == 0 && Y == 0) System.out.println("The enemy is Here!"); // row 0 - column 0


        if (X == 0 && Y > 0) System.out.println("The enemy is North");  // row  = column
        if (X == 0 && Y < 0) System.out.println("The enemy is South!"); // row 0  - column -1
        if (X < 0 && Y == 0) System.out.println("The enemy is East!"); // row  - column
        if (X > 0 && Y == 0) System.out.println("The enemy is West!"); // row   - column

        if (X > 0 && Y > 0) System.out.println("The enemy is North-West!"); // row  - column
        if (X > 0 && Y > 0) System.out.println("The enemy is North-East!"); // row  - column
        if (X < 0 && Y < 0) System.out.println("The enemy is South-West!"); // row  - column
        if (X > 0 && Y < 0) System.out.println("The enemy is South-East!"); // row  - column



        scanner.close();

    }
}
