/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.modelo;


import javax.persistence.*;
import java.util.*;
/**
 *
 * @author suporte
 */

@Entity
public class Departamento {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nome;
    
    @OneToMany
    private Collection<Funcionario> funcionario = new ArrayList<Funcionario>();

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
     * @return the funcionario
     */
    public Collection<Funcionario> getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Collection<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
}
