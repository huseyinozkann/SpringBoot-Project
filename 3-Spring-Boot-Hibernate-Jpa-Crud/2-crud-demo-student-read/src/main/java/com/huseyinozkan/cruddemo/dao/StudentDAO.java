package com.huseyinozkan.cruddemo.dao;

import com.huseyinozkan.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

}
