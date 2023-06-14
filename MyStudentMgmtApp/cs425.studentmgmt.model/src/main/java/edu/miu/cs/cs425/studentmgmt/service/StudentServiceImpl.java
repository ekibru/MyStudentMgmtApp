package edu.miu.cs.cs425.studentmgmt.service;

import edu.miu.cs.cs425.studentmgmt.enitity.Student;
import edu.miu.cs.cs425.studentmgmt.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


}
