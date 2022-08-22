package my.com.wilson.dao;

import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

@Configuration
public abstract class AbstractHibernateDaoImpl< T extends Serializable> {

    private final Class< T > clazz;

    @PersistenceContext
    EntityManager entityManager;

    public AbstractHibernateDaoImpl(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T findOne( final long id ){
        return entityManager.find( clazz, id );
    }

    public List findAll(){
        return entityManager
                .createQuery("from " + clazz.getName())
                .getResultList();
    }

    public void save( T entity ){
        entityManager.persist( entity );
    }

    public void update(T entity ){
        entityManager.merge(entity);
    }

    public void delete( T entity ){
        entityManager.remove( entity );
    }

    public void deleteById( final long entityId ){
        T entity = findOne( entityId );
        delete( entity );
    }

    public T findOne( String field, String id ){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = builder.createQuery(clazz);
        Root<T> root = criteriaQuery.from(clazz);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get(field), id));
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList().get(0);
    }

    public List< T > findAll(String sort){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = builder.createQuery(clazz);
        Root<T> root = criteriaQuery.from(clazz);
        criteriaQuery.select(root);

        if (sort != null) {
            criteriaQuery.orderBy(builder.asc(root.get(sort)));
        }
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
