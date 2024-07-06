package com.huseyinozkan.cruddemo.dao;

import com.huseyinozkan.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

}