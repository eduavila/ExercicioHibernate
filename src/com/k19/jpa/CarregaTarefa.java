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
public class CarregaTarefa {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        EntityManager manager = factory.createEntityManager();
        
        
        Tarefa encontrada = manager.find(Tarefa.class, 3L);

        
        System.out.println(encontrada.getDescricao());
        
        manager.close();
    }
}
