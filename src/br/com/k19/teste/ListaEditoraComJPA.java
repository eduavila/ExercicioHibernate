/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;


import javax.persistence.*;
import java.util.*;
import br.com.k19.modelo.*;
/**
 *
 * @author suporte
 */
public class ListaEditoraComJPA {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("k19");
        
        EntityManager manager = factory.createEntityManager();
        
        
        Query query = manager.createQuery("SELECT e FROM Editora e");
        
        List<Editora> editoras = query.getResultList();
        
        for(Editora e: editoras){
            System.out.println("Editora: "+e.getNome()+"-"+e.getEmail());
        }
    }
            
}
