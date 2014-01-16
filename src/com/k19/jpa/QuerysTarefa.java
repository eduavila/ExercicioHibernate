/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.k19.jpa;



import javax.persistence.*;
import com.k19.modelo.Tarefa;
import java.util.List;
/**
 *
 * @author suporte
 */
public class QuerysTarefa {
    
    public static void main(String[] args){
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        
        EntityManager  manager = factory.createEntityManager();
        
        List<Tarefa> lista = manager
                .createQuery("select t from Tarefa as t where t.finalizado = true")
                .getResultList();
        
        manager.close();
        for(Tarefa tarefa:lista){
            System.out.println(tarefa.getDescricao());
        }
        
        
    }
    
}
