package LesOpdrachten.School;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Het aanmaken van een object gebeurd pas na het gebruiken van operator "new".
        Je kan dus ook alleen een variabel declareren van het type (hieronder student).
        Een object wordt pas aangemaakt wanneer het referentievariabele wordt geïnitialiseerd
        ex :
        Student student; (= referentievariabel.)
        Student student = new Student(); ( = object van class Student, initialisatie student = nieuw object)

        Encapsulation = making sure that sesitive data is hidden to users.
        To ensure this, class variables and attributes must be declared private.
        Get and Set methods must be public to acces andd update pivate variables.

        Private variables can only be accessed within the same class(no outside class has acces)
        But they are accessible when we you use Get and Set methods.

        Get method : returns the value of variables, Set methods sets the values.
        */


        Student student = new Student("Henk", "henk1@hotmail.com", 32, "deemtah", "henk12345");


        Student student1 = new Student("Stefan", "stefan1235@hotmail.com",
                32, "Almelo", "stefan12345");
        Student student2 = new Student("Mike", "mike12345@hotmail.com", 33,
                "koog aan de zaan", "1234567");
        Student student3 = new Student("Stefan", "stefan1235@hotmail.com",
                32, "Almelo", "stefan12345");
        Student student4 = new Student("Stefan", "stefan1235@hotmail.com",
                32, "Almelo", null);

        // Teachers
//      Teacher teacher = new Teacher();
        Teacher teacher = new Teacher("herman", "herman12345@hotmail.com");
        Teacher teacher1 = new Teacher("Joris", "joris12345@hotmail.com");
        Teacher teacher2 = new Teacher("Daniel", "daniel12345@hotmail.com");
        System.out.println(teacher);

        // Courses
        Course course = new Course(teacher, student);
        course.addStudents(student2, student3, student4);


        List<Student> students = course.getStudents();
        for (Student s : students){
            s.printDetails();
        }
        course.printDetails();
    }
}
