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
public class TesteLazeInitialization {
      public static void main(String[] args){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
      
        //Objeto Carregado em modo Lazy
        Pessoa p=manager.getReference(Pessoa.class, 1L);
        
  
        manager.close();
        factory.close();
        
        // Tenta usar um DADO do Objeto;
        
        System.out.println(p.getNome());
        
        
      }

}
