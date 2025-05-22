package LesOpdrachten.OOP2;

public class Student {
    /*
    1 : maak variabelen aan zonder waarde
    2 : creeer een constructor (rechter muisknop generate)
    3 : creeer methode (void print details)
     */

    String nameStudent;
    String id;
    int age;
    int postcode;

    // DIT IS EEN CONSTRUCTOR!
    // Student (){
    //}

    public Student(String nameStudent, String id, int age, int postcode) {
        this.nameStudent = nameStudent;
        this.id = id;
        this.age = age;
        this.postcode = postcode;
    }
    void printDetails(){
        System.out.println("Student - name : " + this.nameStudent + " " + "id : " + this.id);
    }
}
