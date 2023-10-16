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
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.flush();
            em.getTransaction().commit();
        }
        catch(Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }

    }

    @Override
    public <T> T update(T entity) {
        EntityManager em = EntityManagerAdmin.getInstance();
        try {
            em.getTransaction().begin();
            T ent = em.merge(entity);
            em.flush();
            em.getTransaction().commit();
            return ent;
        }
        catch(Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
           em.close();
        }
        return null;
    }
}
