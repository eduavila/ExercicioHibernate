/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;

import br.com.k19.modelo.Pessoa;
import br.com.k19.modelo.Topico;
import javax.persistence.*;


/**
 *
 * @author suporte
 */
public class TesteOrphanRemoval {
     public static void main(String[] args){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        
        Topico topico = manager.find(Topico.class,1L);
        topico.getComenctarios().clear();
        
        //Sincronizando e Confirmando a Transacao
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
        
        
        
     }
}
