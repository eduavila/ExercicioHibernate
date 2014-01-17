/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.teste;

import javax.persistence.*;

import br.com.k19.modelo.*;
import java.util.GregorianCalendar;

/**
 *
 * @author suporte
 */
public class AdicionaCandidatoEndereco {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_mapeamento_pu");

        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        
        Endereco e = new Endereco();
        e.setEstado("São Paulo");
        e.setCidade("São Paulo");
        e.setLogradouro("Av.Bigadeiro faria");
        e.setNumero(1571);
        
        Candidato p= new Candidato();
        p.setNome("Rafael Cosentino");
        p.setNascimento(new GregorianCalendar(2012,01,21));
        p.setEndereco(e);
        
        manager.persist(p);
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
              
    
    }
}
