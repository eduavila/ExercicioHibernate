/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.modelo;



import javax.persistence.*;
import java.util.Calendar;
/**
 *
 * @author suporte
 */

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(unique=true)
    private String email;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataDeCadastro;
    
    @Lob
    private byte[] foto;

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dataDeCadastro
     */
    public Calendar getDataDeCadastro() {
        return dataDeCadastro;
    }

    /**
     * @param dataDeCadastro the dataDeCadastro to set
     */
    public void setDataDeCadastro(Calendar dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
}
