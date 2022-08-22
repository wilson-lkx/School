package my.com.wilson.dao;

import my.com.wilson.model.Student;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl extends AbstractHibernateDaoImpl<Student> implements StudentDao<Student> {

    public StudentDaoImpl() {
        super(Student.class);
    }

    @Override
    public List<Student> getStudentsByCourseId(int courseID) {
        String statement = "SELECT Students.* FROM Students LEFT JOIN StudentCourses ON Students.StudentID = StudentCourses.StudentID LEFT JOIN Courses ON Courses.CourseID = StudentCourses.CourseID WHERE Courses.CourseID = " + courseID + ";";

        List<Object[]> objects = entityManager.createNativeQuery(statement).getResultList();
        List<Student> students = new ArrayList<>();
        for (Object[] object : objects) {
            Student student = new Student();
            student.setStudentID((Integer) object[0]);
            student.setLastName((String) object[1]);
            student.setFirstName((String) object[2]);
            student.setAddress((String) object[3]);
            student.setCity((String) object[4]);
            student.setDateOfBirth((Date) object[5]);
            student.setIntakeYear((Integer) object[6]);
            student.setHp((String) object[7]);
            student.setGender((Character) object[8]);
            students.add(student);
        }
        return students;
    }
}
