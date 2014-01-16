/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.k19.jpa;


import javax.persistence.*;
import com.k19.modelo.Tarefa;
/**
 *
 * @author suporte
 */
public class AtualizarTarefa {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();
        
        Tarefa tarefa= new Tarefa();
        
        tarefa.setId(2l);
        tarefa.setDescricao("Estuda JPA com CSS");
        tarefa.setFinalizado(false);
        tarefa.setDataFinalizado(null);
        
        manager.getTransaction().begin();
        manager.merge(tarefa);
        manager.getTransaction().commit();
        
        System.out.println("Atualizado Registro = "+tarefa.getId());
    
        manager.close();
    }
}
