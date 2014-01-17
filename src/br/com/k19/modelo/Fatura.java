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
public class Fatura {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy="fatura")
    private Collection<Ligacao> ligacoes = new ArrayList<Ligacao>();

    @Temporal(TemporalType.DATE)
    private Calendar venciamento;

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
     * @return the ligacoes
     */
    public Collection<Ligacao> getLigacoes() {
        return ligacoes;
    }

    /**
     * @param ligacoes the ligacoes to set
     */
    public void setLigacoes(Collection<Ligacao> ligacoes) {
        this.ligacoes = ligacoes;
    }

    /**
     * @return the venciamento
     */
    public Calendar getVenciamento() {
        return venciamento;
    }

    /**
     * @param venciamento the venciamento to set
     */
    public void setVenciamento(Calendar venciamento) {
        this.venciamento = venciamento;
    }

}
