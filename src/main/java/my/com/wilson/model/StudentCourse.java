package my.com.wilson.model;

import javax.persistence.*;

@Entity
@Table(name = "StudentCourses")
public class StudentCourse {

    @Id
    @Column(name = "StudentCourseID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentCourseID;

    @Column(name = "StudentID", nullable = false)
    private Integer studentID;

    @Column(name = "CourseID", nullable = false)
    private Integer courseID;

    public Integer getStudentCourseID() {
        return studentCourseID;
    }

    public void setStudentCourseID(Integer studentCourseID) {
        this.studentCourseID = studentCourseID;
    }

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
