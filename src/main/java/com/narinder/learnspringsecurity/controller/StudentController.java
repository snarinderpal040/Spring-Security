package com.narinder.learnspringsecurity.controller;

import com.narinder.learnspringsecurity.models.Student;
import com.narinder.learnspringsecurity.models.Users;
import com.narinder.learnspringsecurity.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private UsersService service;

    private static Integer id = 0;
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(++id, "Michael"),
            new Student(++id, "Kennedey"),
            new Student(++id, "Tom"),
            new Student(++id, "Don"),
            new Student(++id, "Patrick"),
            new Student(++id, "Hasterix"),
            new Student(++id, "Chris")
    );

    @GetMapping(path = "/students")
    public List<Student> getStudent(){
        return STUDENTS;
    }

    @PostMapping(path = "/register")
    public String saveuser(@RequestBody Users user){
        return service.save(user);
    }

    @DeleteMapping(path = "/delete/{username}")
    public String deleteUser(@PathVariable("username") String username){
        return service.deleteById(username);
    }
}
