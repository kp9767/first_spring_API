package com.example.student_management_app;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db= new HashMap<>();

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNO){
        return db.get(regNO);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        db.put(student.getRegNO(),student);
        return "Student has been added Successfully";
    }

    @PostMapping("/getbypath{id}")
    public Student getStudentbypath(@PathVariable("id") int regNO){
        return db.get(regNO);
    }

    @PutMapping("updateAge/{id}")
    public Student updateAge(@PathVariable("id") int regNO,@PathParam("q") int newage){
        db.get(regNO).setAge(newage);
        return db.get(regNO);
    }

}
