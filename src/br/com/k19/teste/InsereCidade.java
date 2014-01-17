/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;


import br.com.k19.modelo.Cidade;
import br.com.k19.modelo.Estado;
import br.com.k19.modelo.Governador;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
public class InsereCidade {
    public static void main(String[] args){
         EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        
        Cidade saoPaulo = new Cidade();
        saoPaulo.setNome("Sao Paulo");
        saoPaulo.setNomeDoEstado("Sao Paulo");
       
        
        
        Cidade rioDeJaneiro = new Cidade();
        rioDeJaneiro.setNome("Rio de Janeiro");
        rioDeJaneiro.setNomeDoEstado("Rio de Janeiro");
        
        Cidade natal = new Cidade();
        natal.setNome("Natal");
        natal.setNomeDoEstado("Rio Grande do Norte");
        
        manager.persist(saoPaulo);
        manager.persist(rioDeJaneiro);
        manager.persist(natal);
      
        
        
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
        
        
        
        
        
    }
}
