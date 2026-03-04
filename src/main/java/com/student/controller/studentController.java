package com.student.controller;

import com.student.entity.student;
import com.student.service.studentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {
    private final studentService service;
    public studentController(studentService service) {
        this.service=service;
    }

    //    @GetMapping("/get")
//    public List<student> getStudent(){
//        return List.of(new student(1L,"akhilesh","b.tech"),
//                new student(2L,"rahul","bca"),
//                new student(3L,"mohit","bsc"));
//    }

    @PostMapping("/post")
    public student created(@RequestBody student s){
        return service.create(s);
    }
    @GetMapping("/get")
    public List<student> get(){
        return service.getAll();
    }
}
