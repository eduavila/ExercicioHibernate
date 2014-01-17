/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;


import br.com.k19.modelo.Usuario;
import java.util.Calendar;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
public class AdicionarUsuario {
    public static void main(String[] args){
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("k21_mapeamento_pu");
        
        EntityManager manager= factory.createEntityManager();
        
       manager.getTransaction().begin();
       
       Usuario usuario = new Usuario();
       usuario.setEmail("Contato@k19.com.br");
       usuario.setDataDeCadastro(Calendar.getInstance());
       
       manager.persist(usuario);
       
       manager.getTransaction().commit();
      
      manager.close();
      factory.close();
    
    }
}
