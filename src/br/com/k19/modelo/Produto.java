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
public class Produto {
    @Id @GeneratedValue
    private Long id;
    
    private String nome;
    
    private Double preco;
    
    @PrePersist
    public void prePersist(){
        System.out.println("Persistindo um novo objeto com persist() ou merge()...");
    }
    
    
    @PostPersist
    public void postPersist(){
        System.out.println("O comando insert foi executado no banco de dados...");
        System.out.println("Um rollback ainda pode desfazer o comando insert...");
        
    }
}
