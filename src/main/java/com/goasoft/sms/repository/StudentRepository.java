package com.goasoft.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goasoft.sms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
