package my.com.wilson.controller;

import my.com.wilson.model.Student;
import my.com.wilson.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    public void createStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<Student> getStudents(@RequestParam(required = false) Integer courseID) {
        return courseID != null ? studentService.findStudents(courseID) : studentService.findStudents();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Student getStudentById(@PathVariable(value = "id") Integer id) {
        return studentService.findStudentById(id);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteStudent(@PathVariable(value = "id") Integer id) {
        studentService.deleteStudent(id);
    }
}
