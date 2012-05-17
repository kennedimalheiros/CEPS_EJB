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
public interface Repository<T> {

    void salvar(T obj);

    T abrir(long Id);

    void apagar(T obj);

    List<T> listar();
}
