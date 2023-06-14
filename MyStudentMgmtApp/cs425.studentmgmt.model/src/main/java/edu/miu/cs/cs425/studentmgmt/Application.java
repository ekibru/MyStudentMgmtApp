package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.enitity.Classroom;
import edu.miu.cs.cs425.studentmgmt.enitity.Course;
import edu.miu.cs.cs425.studentmgmt.enitity.Student;
import edu.miu.cs.cs425.studentmgmt.enitity.Transcript;
import edu.miu.cs.cs425.studentmgmt.service.StudentService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
private StudentService studentService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application is Started");



        var transcript1 = new Transcript("BS Computer Science");
        var transcript2 = new Transcript("BS Computer Science");

        var classroom1 = new Classroom("McLaughlin building","M105");
        var classroom2 = new Classroom("Verihill building","V11");

        var course1 = new Course("CS401","Modern Prog Practices");
        var course2 = new Course("CS390","FPP");
        var course3 = new Course("CS4750","WAP");

        var anna = new Student("000-61-0001","Anna","Lynn","Smith",
                               3.45, LocalDate.of(2019,05,24));
        var mike = new Student("000-61-0002","Mike","Lala","John",
                3.75, LocalDate.of(2012,05,24));

         List<Student> studentLists = new ArrayList<>(Arrays.asList(anna,mike));
         List<Course> courseLists = new ArrayList<>(Arrays.asList(course1,course2,course3));

        anna.setTranscript(transcript1);
        mike.setTranscript(transcript2);
        anna.setClassroom(classroom1);
        mike.setClassroom(classroom2);
        anna.setCourses(courseLists);
        mike.setCourses(courseLists);

        transcript1.setStudent(anna);
        transcript2.setStudent(mike);

        classroom1.setStudents(studentLists);
        classroom2.setStudents(studentLists);

        course1.setStudentList(studentLists);
        course2.setStudentList(studentLists);
        course3.setStudentList(studentLists);

        var student1 = createsStudent(anna);
        var student2 = createsStudent(mike);










        System.out.println(student1);
        System.out.println(student2);
        System.out.println("Application is End");

    }
    private Student createsStudent(Student student){

        return studentService.saveStudent(student);
    }
}
