package com.telusko.SpringSecurityEx.controller;

import com.telusko.SpringSecurityEx.model.Student;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
        new Student(1, "s1", "s1@com", 90),
        new Student(2, "s2", "s2@com", 80),
        new Student(3, "s3", "s3@com", 70)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students ;
    }


    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody  Student student) {
        students.add(student);
        return student;
    }
}
