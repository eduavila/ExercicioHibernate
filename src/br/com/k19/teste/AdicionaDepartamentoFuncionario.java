/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;

import br.com.k19.modelo.Departamento;
import br.com.k19.modelo.Funcionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author suporte
 */
public class AdicionaDepartamentoFuncionario {
     public static void main(String[] args){
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("k21_mapeamento_pu");
        
        EntityManager manager = factory.createEntityManager();
        
         manager.getTransaction().begin(); 
        
            Funcionario f = new Funcionario();
            f.setNome("Rafael Consentino");

            Departamento d = new Departamento();
            d.setNome("Financeiro");
            d.getFuncionario().add(f);
         
         
            manager.persist(f);
            manager.persist(d);
         
         manager.getTransaction().commit();
         
         manager.close();
         factory.close();
         
     }
}
