package LesOpdrachten.School;
import java.util.ArrayList;
import java.util.List;


public class Course {
   private Teacher teacher;
   private List<Student> students = new ArrayList<>();

   public Course(Teacher teacher, Student... students) {
      this.teacher = teacher;
      this.students.addAll(List.of(students));

   }
   void printDetails(){
      this.teacher.printDetails();
      for (Student student : students){
         student.printDetails();
      }
   }
}
