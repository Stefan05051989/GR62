package w3schools.Java;

public class Identifiers {
    public static void main(String[] args) {
        /*
        All Java variables must be identified with unique names,
        which are called identifiers.
        These can be short (like x, y, z), or more clearly like age, sum, totalVolume, dateOfBirth etc
         */

        // example :
        String myClock = "Clock";
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;
        System.out.println("A " + myClock + " has " + hoursPerDay + " hours per day, "
                           + minutesPerHour + " minutes per hour," + "and " + secondsPerMinute +
                           " seconds per minute");
        /*
        identifiers are important to create a clean and readable program for everyone to understand.
        make sure you create readable code so it doesn't become a puzzle to understand your program.
         */
    }
}
