package my.com.wilson.service;

import my.com.wilson.dao.StudentDao;
import my.com.wilson.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao<Student> studentDao;

    @Override
    public Student findStudentById(int id) {
        return studentDao.findOne(id);
    }

    @Override
    public List<Student> findStudents() {
        return studentDao.findAll();
    }

    @Override
    public List<Student> findStudents(int courseId) {
        return studentDao.getStudentsByCourseId(courseId);
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.update(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDao.deleteById(id);
    }
}
