/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.modelo;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
@Entity
public class Topico {
    @Id @GeneratedValue
    private Long id;
    
    @OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Comentario> comenctarios= new ArrayList<Comentario>();
    
    private String titulo;

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
     * @return the comenctarios
     */
    public List<Comentario> getComenctarios() {
        return comenctarios;
    }

    /**
     * @param comenctarios the comenctarios to set
     */
    public void setComenctarios(List<Comentario> comenctarios) {
        this.comenctarios = comenctarios;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
