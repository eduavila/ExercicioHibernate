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
public class AdicionaEstadoGorvernador {
  public static void main(String[] args){
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("k21_mapeamento_pu");
        
        EntityManager manager= factory.createEntityManager();
        
       manager.getTransaction().begin();
       
       Governador g = new Governador();
       g.setNome("Rafael Cosentino");
       
       Estado e = new Estado();
       e.setNome("São Paulo");
       e.setGovernador(g);

       manager.persist(g);
       manager.persist(e);
       
       manager.getTransaction().commit();
       
       manager.close();
       factory.close();
  }
       
}
