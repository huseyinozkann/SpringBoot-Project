package com.huseyinozkan.demo.rest;

import com.huseyinozkan.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data ... only once!

    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Huseyin", "Ozkan"));
        theStudents.add(new Student("Ali", "Veli"));
        theStudents.add(new Student("Hasan", "Ozkan"));
    }


    // define endpoint for "/students" - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    // define endpoint or "/students/{studentId}" - return student at index


    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        // just index into the list ... keep it simple for now
        return theStudents.get(studentId);
    }
}
