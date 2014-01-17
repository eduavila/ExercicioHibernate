/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package br.com.k19.teste;



import br.com.k19.modelo.Cidade;
import br.com.k19.modelo.Pessoa;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
public class TesteSharedCache {
    public static void main(String[] args){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
    
       System.out.println("--------------------Primerira FIND----------------");
       Cidade cidade = manager.find(Cidade.class,1L);
       EntityManager manager2 = factory.createEntityManager();

       System.out.println("--------------------Segundo FIND----------------");
       cidade = manager2.find(Cidade.class, 1L);
       
       
       
        manager.close();
        factory.close();
                
        
    }
}
