/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;


import br.com.k19.modelo.Comentario;
import br.com.k19.modelo.Estado;
import br.com.k19.modelo.Governador;
import br.com.k19.modelo.Topico;
import java.util.Calendar;
import java.util.Locale;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
public class AdicionaTopicoComentarios {
    public static void main(String[] args){
         EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
        
      
        
        Topico topico = new Topico();
        topico.setTitulo("K19-Orphan Removal");
        
        
        for(int i=0;i<10; i++){
            Comentario comentario = new Comentario();
            comentario.setData(Calendar.getInstance());
            topico.getComenctarios().add(comentario);
            
        }
        
        manager.getTransaction().begin();
        
        manager.persist(topico);
            
        manager.getTransaction().commit();
        
        
        factory.close();
        
        
        
        
        
        
    }
}
