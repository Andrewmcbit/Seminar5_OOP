package view;

import controller.Controller;
import data.Student;

public class StudentView {
    private Controller controller = new Controller();

    public void createStudent(Student student){
        controller.createUser(student, student.getDirection());
        System.out.println("Student created successfully");
    }
    public void readStudent(){
        System.out.println("Student list:");
        controller.read("student");
    }
}
