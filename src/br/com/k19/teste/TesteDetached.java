/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;

import br.com.k19.modelo.Pessoa;
import javax.persistence.*;


/**
 *
 * @author suporte
 */
public class TesteDetached {
     public static void main(String[] args){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        
        
        // Objeto no Estado Managed
        Pessoa p = manager.find(Pessoa.class, 1L);
        
        //Objeto no estado DETACHED
        manager.detach(p);
        
        //Alteradando o conteudo do objeto
        
        p.setNome("Jonas hirata");
        
        //Sincronizando e Confirmando a Transacao
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
        
        
        
     }
}
