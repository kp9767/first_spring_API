package com.example.student_management_app;

public class Student {
    private int regNO;
    private String name;
    private int age;
    private String course;

    public Student() {

    }

    public Student(int regNO, String name, int age, String course) {
        this.regNO = regNO;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRegNO() {
        return regNO;
    }

    public void setRegNO(int regNO) {
        this.regNO = regNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

