package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ImplIDAO implements IDAO{
    @Override
    public <T> List<T> getAll(String nameQuery, Class<T> clazz) {
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            TypedQuery<T> query = em.createNamedQuery(nameQuery,clazz);
            return query.getResultList();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return null;
    }

    @Override
    public <T> void insert(T entity) {

    }

    @Override
    public <T> T update(T entity) {
        return null;
    }
}
