package my.com.wilson.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Courses")
public class Course implements Serializable {

    @Id
    @Column(name = "CourseID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseID;

    @Column(name = "Course", nullable = false)
    private String course;

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
