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
public class TesteFind {
    public static void main(String[] args){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
    
        //Objeto no estado MANAGED
        Pessoa p =manager.find(Pessoa.class, 1L);
        
        System.out.println("Id: "+ p.getId());
        System.out.println("Nome: "+ p.getNome());
        
        
        manager.close();
        factory.close();
                
        
    }
}
