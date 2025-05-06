package w3schools.Java;

public class VariablesExamples {
    public static void main(String[] args) {
        /*
        Often you use variables to make calculations or list etc
        here are two examples how they can be used in real life
         */

        // Student data :
        String stdentName = "John";
        int studentID = 36987;
        int studentAge = 63;
        float tuitionFee = 12345.99f;
        char examGrade = '9';

        System.out.println("Student Name : " + stdentName);
        System.out.println("Student ID : " + studentID);
        System.out.println("Student Age : " + studentAge);
        System.out.println("Tuition fee : " + tuitionFee);
        System.out.println("Examen grade : " + examGrade );

        System.out.println("--------------------------------------------------------");

        // we can also create the area of a rectangle like this:

        int length = 4;
        int width = 6;
        int area; // leave this one empty to perform the calculation in the formula, like so:

        area = length * width;

        System.out.println("Length is: " + length);
        System.out.println("Width is : " + width);
        System.out.println("Area of the rectangle is : " + area);
    }
}
