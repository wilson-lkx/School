package my.com.wilson.model;

import javax.persistence.*;

@Table(name = "StudentCourses")
public class StudentCourse {

    @Column(name = "StudentID", nullable = false)
    private Integer studentID;

    @Column(name = "CourseID", nullable = false)
    private Integer courseID;

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }
}
