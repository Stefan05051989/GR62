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
        */
        // Students
        Student student1 = new Student("Stefan", "stefan1235@hotmail.com",
                32, "Almelo", "stefan12345");
        Student student2 = new Student("Mike", "mike12345@hotmail.com", 33,
                "koog aan de zaan", "1234567");
        Student student3 = new Student("Stefan", "stefan1235@hotmail.com",
                32, "Almelo", "stefan12345");
        Student student4 = new Student("Stefan", "stefan1235@hotmail.com",
                32, "Almelo", null);

        // Teachers
        Teacher teacher1 = new Teacher("Joris", "joris12345@hotmail.com");

        // Courses
        Course course1 = new Course(teacher1, student1);

        Course course = new Course(teacher1, student1, student3);
        course.printDetails();
    }
}
