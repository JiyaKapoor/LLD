package com.example.demo.StudentManagement.Manager;
import com.example.demo.StudentManagement.Entity.Student;

public class StudentManager {
    //This manager will basically create all the student objects
    public void createDefaultStudent(){
        Student defaultStudent=new Student();
        System.out.println("Default student details: ");
        System.out.println(defaultStudent.getStudentId());
        System.out.println(defaultStudent.getName());
        System.out.println(defaultStudent.getStandard());
        System.out.println(Student.getSchoolName());//calling static method using class and not an object
    }
    public void createCustomStudent(String name,Long studId,Integer standard){
        Student customisedStudent=new Student(name,studId,standard);
        System.out.println("Custom student details: ");
        System.out.println(customisedStudent.getStudentId());
        System.out.println(customisedStudent.getName());
        System.out.println(customisedStudent.getStandard());
        System.out.println(Student.getSchoolName());//calling static method using class and not an object
    }

}
