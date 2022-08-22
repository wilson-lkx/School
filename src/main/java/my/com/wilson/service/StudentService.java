package my.com.wilson.service;

import my.com.wilson.model.Student;
import my.com.wilson.model.StudentCourse;

import java.util.List;

public interface StudentService {

    Student findStudentById(int id);

    List<Student> findStudents();

    List<Student> findStudents(int courseId);

    void saveStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);

    void saveStudentCourse(StudentCourse studentCourse);
}
