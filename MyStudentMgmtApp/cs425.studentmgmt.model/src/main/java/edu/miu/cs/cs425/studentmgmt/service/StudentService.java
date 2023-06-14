package edu.miu.cs.cs425.studentmgmt.service;

import edu.miu.cs.cs425.studentmgmt.enitity.Student;
import jakarta.persistence.EntityManager;

public interface StudentService {
    Student saveStudent(Student student);

}