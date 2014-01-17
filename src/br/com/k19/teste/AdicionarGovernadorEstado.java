/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;


import br.com.k19.modelo.Estado;
import br.com.k19.modelo.Governador;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
public class AdicionarGovernadorEstado {
    public static void main(String[] args){
         EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        
        Governador  governador = new Governador();
        governador.setNome("Eduardo Avila");
        
        Estado estado =new Estado();
        estado.setNome("Sao Paulo");
        
       
        estado.setGorvernador(governador);
        
        manager.persist(estado);
        manager.persist(governador);
        
        
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
        
        
        
        
        
    }
}
