package w3schools.Java.OOP2;

/*

 */

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Stefan", "1", 37, 2345);
        Student s2 = new Student("Mike", "1010101", 37, 5678);
        Docent d1 = new Docent("Joris");
        Course c1 = new Course(d1, s1, s2);
        c1.printDetails();
    }
}

/*/
        1 : maak nieuwe student aan!
        new Student(); = INSTANTIEREN! / instanciate.
        class maken = gewoon data typ (int etc)
         */
// = new Student(PARAMETERS TUSSEN BRACES!)
/*
  // = datatype - identifier = instantie aanmaken
        System.out.println(student1.id);
        System.out.println(student1.nameStudent);
        System.out.println(docent1.nameDocent);
        System.out.println(docent1.email);
 */