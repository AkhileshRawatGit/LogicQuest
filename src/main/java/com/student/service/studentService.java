package com.student.service;

import com.student.entity.student;
import com.student.repo.studentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    private final studentRepo repo;
    studentService(studentRepo repo){
        this.repo=repo;
    }
    public student create(student s){
            return repo.save(s);
    }
    public List<student> getAll(){
        return repo.findAll();
    }
}
