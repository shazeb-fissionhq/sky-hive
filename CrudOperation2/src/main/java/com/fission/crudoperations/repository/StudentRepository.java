package com.fission.crudoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fission.crudoperations.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
