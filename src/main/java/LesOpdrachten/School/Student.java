package LesOpdrachten.School;

public class Student {

    String name;
    String email;
    int age;
    String birthPlace;
    String password;


    public Student(String name, String email, int age, String birthPlace, String password) {
        this.name = "Stefan";
        this.email = "stefankiers@12345.com";
        this.age = 23;
        this.birthPlace = birthPlace;
        this.password = password;
    }
    void printDetails(){
        System.out.println("Student name : " + this.name + "," + "E-mail : " + this.email + "," +
                           "Age : " + this.age + "," + "Place of birth : " + this.birthPlace +
                           "Password : " + this.password);
    }
}


