package LesOpdrachten.School;

public class Teacher {
    String name;
    String email;

    public Teacher(String name, String email){
        this.name = name;
        this.email = email;
    }
    void printDetails(){
        System.out.println("Teacher Name : " + this.name + "," + "E-mail : " + this.email);
    }
}
