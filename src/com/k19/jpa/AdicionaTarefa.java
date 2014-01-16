/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.k19.jpa;


import javax.persistence.*;
import java.util.Calendar;
// importando classe do proprio projeto
import com.k19.modelo.Tarefa;

/**
 *
 * @author suporte
 */
public class AdicionaTarefa {
    public static void main(String[] args){
        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Estudar HTML e CSS");
        tarefa.setFinalizado(true);
        tarefa.setDataFinalizado(Calendar.getInstance());
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        
        EntityManager manager = factory.createEntityManager();
        
        // inicio da trasição
        
        manager.getTransaction().begin();
        manager.persist(tarefa);
        manager.getTransaction().commit();
        
        System.out.println("ID da tarefa: "+ tarefa.getId());
        
        // fechando manager
        
        manager.close();
        
        
    }
}
