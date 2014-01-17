/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;


import javax.persistence.*;
import br.com.k19.modelo.*;
/**
 *
 * @author suporte
 */
public class GeraTabelas {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("k19");
        
        EntityManager manager = factory.createEntityManager();
        
        Editora novaEditora = new Editora();
        novaEditora.setNome("K19 - Livros");
        novaEditora.setEmail("contato@k19.com.br");
        
        manager.persist(novaEditora);
        
        factory.close();
    }
}