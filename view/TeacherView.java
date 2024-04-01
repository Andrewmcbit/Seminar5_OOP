package view;

import controller.Controller;
import data.Teacher;

public class TeacherView {
    private Controller controller = new Controller();

    public void createTeacher(Teacher teacher){
        controller.createUser(teacher, teacher.getDiscipline());
        System.out.println("Teacher created successfully");
    }
    public void readTeacher(){
        System.out.println("Teacher list:");
        controller.read("teacher");
    }
}
