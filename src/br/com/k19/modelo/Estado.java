/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.modelo;
import javax.persistence.*;
/**
 *
 * @author suporte
 */

@Entity
public class Estado {
    @Id @GeneratedValue
    private Long id;
    
    private String nome;
    
    @OneToOne
    private Governador gorvernador;

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
     * @return the gorvernador
     */
    public Governador getGorvernador() {
        return gorvernador;
    }

    /**
     * @param gorvernador the gorvernador to set
     */
    public void setGorvernador(Governador gorvernador) {
        this.gorvernador = gorvernador;
    }
    
    
}
