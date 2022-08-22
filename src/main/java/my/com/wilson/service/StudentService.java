package my.com.wilson.service;

import my.com.wilson.model.Student;

import java.util.List;

public interface StudentService {

    Student findStudentById(int id);

    List<Student> findStudents();

    List<Student> findStudents(int courseId);

    void saveStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);
}
