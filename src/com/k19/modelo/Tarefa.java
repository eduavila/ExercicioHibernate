/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.k19.modelo;


import java.util.Calendar;
// importacao do persist
import javax.persistence.*;

/**
 *
 * @author suporte
 */
@Entity
@Table(name="tarefas2")
public class Tarefa {
    @Id
    @GeneratedValue
    private Long id;
    
    private String descricao;
    private boolean finalizado;
    @Temporal(TemporalType.DATE)
    private Calendar dataFinalizado;

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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the finalizado
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * @param finalizado the finalizado to set
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    /**
     * @return the dataFinalizado
     */
    public Calendar getDataFinalizado() {
        return dataFinalizado;
    }

    /**
     * @param dataFinalizado the dataFinalizado to set
     */
    public void setDataFinalizado(Calendar dataFinalizado) {
        this.dataFinalizado = dataFinalizado;
    }
}
