import data.Student;
import data.Teacher;
import view.StudentView;
import view.TeacherView;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan",18,"math");
        Student student2 = new Student("Petr",20,"IT");

        StudentView studentView = new StudentView();
        studentView.createStudent(student1);
        studentView.createStudent(student2);
        studentView.readStudent();

        System.out.println("----------------------------------");

        Teacher teacher1 = new Teacher("Maria",44,"math");
        Teacher teacher2 = new Teacher("Oleg",55,"IT");
        TeacherView teacherView = new TeacherView();
        teacherView.createTeacher(teacher1);
        teacherView.createTeacher(teacher2);
        teacherView.readTeacher();
    }
}
