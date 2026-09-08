package com.example.demo.StudentManagement.Entity;

public class Student {
    private String name;
    private Long studentId;
    private Integer standard;
    private static String SchoolName; //since all the objects of student class will have the same school so we kept it static
    public Student(String name,Long studentId,Integer standard){
        this.name=name;
        this.studentId=studentId;
        this.standard=standard;
    }
    public Student(){
        this.name="dummyStudent";
        this.studentId=0L;
        this.standard=10;
    }
    public String getName(){
        return this.name;
    }
    public Long getStudentId(){
        return this.studentId;
    }
    public int getStandard(){
        return this.standard;
    }
    //static method to access the static variable of the class
    public static String getSchoolName(){
        return Student.SchoolName;
    }
}
