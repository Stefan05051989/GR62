package LesOpdrachten.OOP2;

import java.util.List;

public class Course {
    Docent docent;
    List<Student> students;

    public Course(Docent docent, Student... students) {
        this.docent = docent;
        this.students = List.of(students);
    }
    void printDetails(){
        this.docent.printDetails();
        for(Student student : students){
            student.printDetails();
        }
    }
}
