package edu.miu.cs.cs425.studentmgmt.repository;

import edu.miu.cs.cs425.studentmgmt.enitity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
