
package com.mycompany.restaurant.Persistencia;

import com.mycompany.restaurant.Logica.ReservaUsuarios;
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


public class ReservaUsuariosJpaController implements Serializable {

    public ReservaUsuariosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    // Se inicializa el EntityManagerFactory a partir del persistence.xml
    // para desacoplar la lógica de negocio de la configuración de la BD
       public ReservaUsuariosJpaController(){
        emf=Persistence.createEntityManagerFactory("RestaurantPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ReservaUsuarios reservaUsuarios) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(reservaUsuarios);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ReservaUsuarios reservaUsuarios) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            reservaUsuarios = em.merge(reservaUsuarios);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = reservaUsuarios.getId();
                if (findReservaUsuarios(id) == null) {
                    throw new NonexistentEntityException("The reservaUsuarios with id " + id + " no longer exists.");
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
            ReservaUsuarios reservaUsuarios;
            try {
                reservaUsuarios = em.getReference(ReservaUsuarios.class, id);
                reservaUsuarios.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reservaUsuarios with id " + id + " no longer exists.", enfe);
            }
            em.remove(reservaUsuarios);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ReservaUsuarios> findReservaUsuariosEntities() {
        return findReservaUsuariosEntities(true, -1, -1);
    }

    public List<ReservaUsuarios> findReservaUsuariosEntities(int maxResults, int firstResult) {
        return findReservaUsuariosEntities(false, maxResults, firstResult);
    }

    private List<ReservaUsuarios> findReservaUsuariosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ReservaUsuarios.class));
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

    public ReservaUsuarios findReservaUsuarios(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ReservaUsuarios.class, id);
        } finally {
            em.close();
        }
    }

    public int getReservaUsuariosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ReservaUsuarios> rt = cq.from(ReservaUsuarios.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
