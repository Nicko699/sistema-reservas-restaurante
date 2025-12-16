
package com.mycompany.restaurant.Persistencia;

import com.mycompany.restaurant.Logica.Mesas;
import com.mycompany.restaurant.Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class MesasJpaController implements Serializable {

    public MesasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    // Se inicializa el EntityManagerFactory a partir del persistence.xml
    // para desacoplar la lógica de negocio de la configuración de la BD
       public MesasJpaController(){
        emf=Persistence.createEntityManagerFactory("RestaurantPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mesas mesas) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(mesas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Mesas mesas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            mesas = em.merge(mesas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = mesas.getId();
                if (findMesas(id) == null) {
                    throw new NonexistentEntityException("The mesas with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mesas mesas;
            try {
                mesas = em.getReference(Mesas.class, id);
                mesas.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mesas with id " + id + " no longer exists.", enfe);
            }
            em.remove(mesas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Mesas> findMesasEntities() {
        return findMesasEntities(true, -1, -1);
    }

    public List<Mesas> findMesasEntities(int maxResults, int firstResult) {
        return findMesasEntities(false, maxResults, firstResult);
    }

    private List<Mesas> findMesasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Mesas.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Mesas findMesas(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mesas.class, id);
        } finally {
            em.close();
        }
    }

    public int getMesasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Mesas> rt = cq.from(Mesas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
