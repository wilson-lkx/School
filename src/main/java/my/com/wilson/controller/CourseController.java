package my.com.wilson.controller;

import my.com.wilson.model.Course;
import my.com.wilson.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.OK)
    public void createCourse(@RequestBody Course course) {
        courseService.saveCourse(course);
    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<Course> getCourses(@RequestParam(required = false) Integer courseID) {
        return courseService.findCourses();
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Course getCourseById(@PathVariable(value = "id") Integer id) {
        return courseService.findCourseById(id);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteCourse(@PathVariable(value = "id") Integer id) {
        courseService.deleteCourse(id);
    }
}
