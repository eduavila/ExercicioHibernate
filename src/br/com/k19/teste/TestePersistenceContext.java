/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;

import br.com.k19.modelo.Estado;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
public class TestePersistenceContext {
     public static void main(String[] args){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
        
        System.out.println("-----------Primeiro FIND-------");
        Estado estado = manager.find(Estado.class, 1L);
        System.out.println("-----------Segundo FIND-------");
        estado = manager.find(Estado.class,1L);
    
     
     
     }
     
}
