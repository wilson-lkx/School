package my.com.wilson.controller;

import my.com.wilson.model.Student;
import my.com.wilson.model.StudentCourse;
import my.com.wilson.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student/courses")
public class StudentCourseController {

    @Autowired
    StudentService studentService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    public void createStudentCourse(@RequestBody StudentCourse studentCourse) {
        studentService.saveStudentCourse(studentCourse);
    }
}
