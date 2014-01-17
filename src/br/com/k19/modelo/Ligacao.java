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
public class Ligacao {
    @Id @GeneratedValue
    private Long id;
    
    @ManyToOne
    private Fatura fatura;
    
    private Integer duracao;

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
     * @return the fatura
     */
    public Fatura getFatura() {
        return fatura;
    }

    /**
     * @param fatura the fatura to set
     */
    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    /**
     * @return the duracao
     */
    public Integer getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
    
}
