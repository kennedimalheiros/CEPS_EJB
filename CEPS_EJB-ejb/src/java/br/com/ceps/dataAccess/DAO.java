/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ceps.dataAccess;

import br.com.ceps.domainModel.Repository;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/**
 *
 * @author www
 */
public class DAO<T> implements Repository<T> {

    private EntityManager manager;
    private Class classe;

    public DAO(Class t) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CEPS_EJB-PU");
        manager = factory.createEntityManager();
        classe = t;
    }

    protected EntityManager getEntityManager() {
        return manager;
    }

    @Override
    public void salvar(T obj) {
        EntityTransaction tran = manager.getTransaction();
        try {
            tran.begin();
            manager.persist(obj);
            tran.commit();
        } catch (Exception ex) {
            tran.rollback();
            ex.printStackTrace();
        }
    }

    @Override
    public T abrir(long id) {
        return (T) manager.find(classe, id);
    }

    @Override
    public void apagar(T obj) {
        EntityTransaction tran = manager.getTransaction();
        try {
            tran.begin();
            manager.remove(obj);
            tran.commit();
        } catch (Exception ex) {
            tran.rollback();
            ex.printStackTrace();
        }

    }

    @Override
    public List<T> listar() {
        CriteriaBuilder query = manager.getCriteriaBuilder();
        Query q2 = manager.createQuery(query.createQuery());
        return q2.getResultList();
    }
}
