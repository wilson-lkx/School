package my.com.wilson.dao;

import java.io.Serializable;
import java.util.List;

public interface StudentDao<T extends Serializable> extends AbstractHibernateDao<T> {

    List<T> getStudentsByCourseId(int courseID);
}
