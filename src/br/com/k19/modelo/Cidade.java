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
@Cacheable(true)
public class Cidade {
    @Id @GeneratedValue
    private Long id;
    
    private String nome;
    
    private String nomeDoEstado;

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
     * @return the nomeDoEstado
     */
    public String getNomeDoEstado() {
        return nomeDoEstado;
    }

    /**
     * @param nomeDoEstado the nomeDoEstado to set
     */
    public void setNomeDoEstado(String nomeDoEstado) {
        this.nomeDoEstado = nomeDoEstado;
    }
    
}
