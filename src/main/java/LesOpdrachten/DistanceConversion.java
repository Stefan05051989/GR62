package LesOpdrachten;
import java.util.*;

/*
Stefan Kiers
08-05-'25
Create a program that calculates the numbers of meters travelled per second.

Pseudo :
Schrijf een programma om de gebruiker een afstand (in meters) en de tijd te nemen
(als drie getallen: uren, minuten, seconden), en geef de snelheid weer, in meters per seconde,
 kilometers per uur en mijlen per uur (hint: 1 mijl = 1609 meter)

 - Ask input for distance in meters
 - Ask input for time (hours, minutes, seconds)
 - Display speed.
 - Display speed in kilometers per hour.
 - Display speed in miles per hour.
 - 1 mile = 1609 meters.

formula :
Time total in seconds = (number of hours * 3600f) + ( numberofminutes / 60)  + number of seconds
Speed equals distance divided by time.
Time equals distance divided by speed.
Distance equals speed multiplied by time.

 */


public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask user for input:
        System.out.println("Distance conversion app.");
        System.out.print("What is the distance in Meters? : ");
        int inputMeters = input.nextInt();
        System.out.print("What is the time in Hours? : ");
        int inputHours = input.nextInt();
        System.out.print("What is the time in Minutes? : ");
        int inputMinutes = input.nextInt();
        System.out.print("What is the time in Seconds? : ");
        int inputSeconds = input.nextInt();

        // calculation is correct! (checked with 2500 - 1 - 1 - 15)
        double totalTimeInSeconds = ((inputHours * 3600) + (inputMinutes * 60) + inputSeconds);
        System.out.println("Total time in seconds : " + totalTimeInSeconds);
        System.out.println();

        System.out.println("Expected results : ");

        // calculate speeds:
        //double meterPerSecond = distanceInMeters / totalTimeInSeconds;
        // checked : correct! (0.11etc)
        //double speedAtKMPerHour = (distanceInMeters / 1000.0) / totalTimeInHours;
        //double milesPerHour = (distanceInMeters / 1609) / totalTimeInHours;

        //display the results
        //System.out.println("Your speed in meters per second : " + meterPerSecond);
        //System.out.println("Your speed in km per hour : " + speedAtKMPerHour);
        //System.out.println("Your speed in Miles per hour : " + milesPerHour);

        input.close();
    }
}


//        // calculate the Time :
//        double kilometersPerhour = (distanceInMeters / 1000) / totalTimeInSeconds;
//        System.out.println("Your speed in Kilometers per hour : " + kilometersPerhour );

//        // calculate the Distance :
//        double milesPerHour = (distanceInMeters / 1609) / totalTimeInSeconds;
//        System.out.println("Your speed in Miles per hour : " + milesPerHour );
//
//
//        float seconds = (float) ((totalTimeInSeconds * 60f) + (inputTimePerMinutes * 3600f) * inputTimePerHours);
//        System.out.println(seconds);
//        float metersPerSecond = (float) (distanceInMeters / distanceInMeters);
//        System.out.println(metersPerSecond + " meters per second");
//          calculate speeds:
//          double meterPerSecond = distanceInMeters / totalTimeInSeconds;
//          checked : correct! (0.11etc)
//          double speedAtKMPerHour = (distanceInMeters / 1000.0) / totalTimeInHours;
//          double milesPerHour = (distanceInMeters / 1609) / totalTimeInHours;

//          display the results
//          System.out.println("Your speed in meters per second : " + meterPerSecond);
//          System.out.println("Your speed in km per hour : " + speedAtKMPerHour);
//          System.out.println("Your speed in Miles per hour : " + milesPerHour);