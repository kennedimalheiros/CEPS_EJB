/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ceps.domainModel;

import java.io.Serializable;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author www
 */
@Entity
@Table(name="operadores")
public class Operador implements Serializable{
    
    @Id
    @Column (name="cod", length=100, nullable=false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    
    @Column (name="nomeFuncionario")
    private String nome;

    public Operador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
