/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.modelo;
import java.util.Calendar;
 import javax.persistence.*;
/**
 *
 * @author suporte
 */

@Entity
public class Candidato {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nome;
    
    @Temporal(TemporalType.DATE)
    private Calendar nascimento;
    
    @Embedded
    private Endereco endereco;

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
     * @return the nascimento
     */
    public Calendar getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
