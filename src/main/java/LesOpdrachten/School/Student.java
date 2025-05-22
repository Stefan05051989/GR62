package LesOpdrachten.School;

public class Student {

    private String name;
    private String email;
    private int age;
    private String birthPlace;
    private String password;


    public Student(String name, String email, int age, String birthPlace, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.birthPlace = birthPlace;
        this.password = password;
    }
    void printDetails(){
        System.out.println("Student name : " + this.name + "," + "E-mail : " + this.email + "," +
                           "Age : " + this.age + "," + "Place of birth : " + this.birthPlace +
                           "Password : " + this.password);
    }
}


