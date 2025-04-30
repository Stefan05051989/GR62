package PlayersGuide.Opdracht08;
import java.util.Locale;
import java.util.Scanner;

/*
Stefan Kiers
15-04-'25

Write a program that lets you input the triangle’s base size and height.
Compute the area of a triangle by turning the above equation into code.
Write the result of the computation.

I've used the double variable for a more accurate method.

The formula for calculating the surface of triangle is : base * height / 2.
 */

public class TheTriangleFarmer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        instead of using exception handeling i've edited the scanner to alow only dots (.) as input
        via changing the origins of the scanner to US with the use local adaption
        it works.. don't touch it! haha
         */

        // make a print statement and ask user input for the base of the triangle through scanner input
        System.out.println("What is the base of the Triangle?" + "\n" + "Enter base : ");
        double base = input.nextDouble();

        // make a print statement and ask the user for the height of the triangle via scanner input
        System.out.println("What is the height of the Triangle?" + "\n" + "Enter Height : " );
        double height = input.nextDouble();

        // calculate the surface via the correct formula and print it to the console.
        double surface = ((base * height) / 2);
        System.out.println(surface);

        input.close();

    }
}
