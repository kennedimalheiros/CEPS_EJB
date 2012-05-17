/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ceps.dataAccess;

import br.com.ceps.domainModel.*;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author www
 */
public class OperadorDAO extends DAO<Operador> implements RepositoryOperador {

    public OperadorDAO() {
        super(Operador.class);
    }

    @Override
    public List<Operador> getTodosOperadores() {
        Query consulta = getEntityManager().createQuery("select c operadores");
        return consulta.getResultList();
    }
}
