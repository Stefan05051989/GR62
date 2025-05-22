package LesOpdrachten.School;
/*

 */

public class Teacher {
    private String name;
    private String email;

    public Teacher(String name, String email){
        this.name = name;
        this.email = email;
    }
    // method for printing specific details of teacher
    void printDetails(){
        System.out.println("Teacher Name : " + this.name + "," + "E-mail : " + this.email);
    }
    //
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
