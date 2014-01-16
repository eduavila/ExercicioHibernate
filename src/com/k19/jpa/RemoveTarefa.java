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
public class RemoveTarefa {
    
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager=factory.createEntityManager();
        
        Tarefa encontrada = manager.find(Tarefa.class, 1L);
        
        manager.getTransaction().begin();
        
        // removendo 
        manager.remove(encontrada);
        
        manager.getTransaction().commit();
        
        System.out.println("Excluido registro = "+encontrada.getId());
        
        manager.close();
        
    }
    
}
