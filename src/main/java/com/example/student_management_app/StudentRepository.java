package com.example.student_management_app;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
     Map<Integer,Student> db= new HashMap<>();

    public void addStudent(Student student) {
        db.put(student.getRegNO(),student);
        return;
    }

    public Student getStudentbypath(int regNO) {
       return db.get(regNO);
    }

    public Student updateAge(int regNO, int newage) {
        db.get(regNO).setAge(newage);
        return db.get(regNO);
    }

    public String deleteStudent(int regNO) {
        db.remove(regNO);
        return "Student remove successfully";
    }

    public Student getStudent(int regNO){
        return db.get(regNO);
    }
}
