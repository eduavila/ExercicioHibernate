/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.modelo;


import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
@Entity
public class Livro {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nome;
    
    @ManyToMany
    private Collection<Autor> autores   = new ArrayList<Autor>();

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the autores
     */
    public Collection<Autor> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(Collection<Autor> autores) {
        this.autores = autores;
    }
    
    
}
