package com.example.student_management_app;

import ch.qos.logback.core.net.SyslogOutputStream;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("Student")
@Component
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

    @PostMapping("/getbypath/{id}")
    public ResponseEntity getStudentbypath(@PathVariable("id") int regNO){

       Student student= studentService.getStudentbypath(regNO);
       if(student==null) {
           return new ResponseEntity("id does not exits", HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity(student,HttpStatus.FOUND);
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
