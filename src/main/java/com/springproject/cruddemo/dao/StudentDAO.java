package com.springproject.cruddemo.dao;

import com.springproject.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
