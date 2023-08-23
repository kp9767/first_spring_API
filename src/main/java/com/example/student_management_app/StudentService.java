package com.example.student_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student) {
       studentRepository.addStudent(student);
       return "Student added successfully";
    }

    public Student getStudent(int regNO){
        return studentRepository.getStudent(regNO);
    }

    public Student getStudentbypath(int regNO) {
      return studentRepository.getStudentbypath(regNO);

    }

    public Student updateAge(int regNO, int newage) {
       return studentRepository.updateAge(regNO,newage);
    }

    public String deleteStudent(int regNO) {
        return studentRepository.deleteStudent(regNO);
    }
}
