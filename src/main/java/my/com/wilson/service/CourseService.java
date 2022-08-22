package my.com.wilson.service;

import my.com.wilson.model.Course;

import java.util.List;

public interface CourseService {

    Course findCourseById(int id);

    List<Course> findCourses();

    void saveCourse(Course course);

    void updateCourse(Course course);

    void deleteCourse(int id);
}
