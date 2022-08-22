package my.com.wilson.dao;

import my.com.wilson.model.Course;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseDaoImpl extends AbstractHibernateDaoImpl<Course> implements CourseDao<Course> {

    public CourseDaoImpl() {
        super(Course.class);
    }
}
