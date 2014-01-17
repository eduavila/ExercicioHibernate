/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;

import br.com.k19.modelo.Editora;
import br.com.k19.modelo.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author suporte
 */
public class ListaAutorComJPA {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("k19");
        
        EntityManager manager = factory.createEntityManager();
        
        
        Query query = manager.createQuery("SELECT e FROM Autor e");
        
        List<Autor> autores = query.getResultList();
        
        for(Autor e: autores){
            System.out.println("Autor: "+e.getNome());
        }
    }
}
