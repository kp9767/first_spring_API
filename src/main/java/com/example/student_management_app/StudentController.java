package com.example.student_management_app;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNO){
       return studentService.getStudent(regNO);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
         return studentService.addStudent(student);

    }

    @PostMapping("/getbypath{id}")
    public Student getStudentbypath(@PathVariable("id") int regNO){
       return studentService.getStudentbypath(regNO);
    }

    @PutMapping("updateAge/{id}")
    public Student updateAge(@PathVariable("id") int regNO,@PathParam("q") int newage){
       return studentService.updateAge(regNO,newage);
    }

   @DeleteMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int regNO){
        return studentService.deleteStudent(regNO);
    }



}
