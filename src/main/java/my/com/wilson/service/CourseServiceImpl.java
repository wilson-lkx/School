package my.com.wilson.service;

import my.com.wilson.dao.CourseDao;
import my.com.wilson.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseDao<Course> courseDao;

    @Override
    public Course findCourseById(int id) {
        return courseDao.findOne(id);
    }

    @Override
    public List<Course> findCourses() {
        return courseDao.findAll();
    }

    @Override
    public void saveCourse(Course course) {
        courseDao.save(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.update(course);
    }

    @Override
    public void deleteCourse(int id) {
        courseDao.deleteById(id);
    }
}
