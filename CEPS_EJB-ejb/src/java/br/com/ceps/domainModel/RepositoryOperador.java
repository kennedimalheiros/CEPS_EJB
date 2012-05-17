/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ceps.domainModel;

import java.util.List;

/**
 *
 * @author www
 */
public interface RepositoryOperador extends Repository<Operador> {

    List<Operador> getTodosOperadores();
}
