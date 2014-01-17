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
public class TestePersist {
    public static void main(String[] args){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
        
        
        // Abrindo a Trasação
        
        manager.getTransaction().begin();
        
        //Objeto no Estado NEW
        Pessoa p = new Pessoa();
        p.setNome("Eduardo Avila");
        
        //Objeto no estado MANAGED
        manager.persist(p);
        
        //Sincronizando e Confirmando a Transação
        
        manager.getTransaction().commit();
        
        System.out.println("Pessoa id: "+p.getId());
        
        manager.close();
        factory.close();
    }
    
}
