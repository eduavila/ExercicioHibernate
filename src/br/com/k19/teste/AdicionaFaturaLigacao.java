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
public class AdicionaFaturaLigacao {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_mapeamento_pu");

        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        
        Ligacao ligacao1 =new Ligacao();
        ligacao1.setDuracao(162);
        
        Ligacao ligacao2 =new Ligacao();
        ligacao2.setDuracao(345);
        
        Ligacao ligacao3 =new Ligacao();
        ligacao3.setDuracao(556);
        
        Fatura fatura = new Fatura();
        fatura.setVenciamento(new GregorianCalendar(2012,11,20));
        
        fatura.getLigacoes().add(ligacao1);
        fatura.getLigacoes().add(ligacao2);
        fatura.getLigacoes().add(ligacao3);
        
        
        ligacao1.setFatura(fatura);
        ligacao2.setFatura(fatura);
        ligacao3.setFatura(fatura);
        
        
        manager.persist(fatura);
        manager.persist(ligacao1);
        manager.persist(ligacao2);
        manager.persist(ligacao3);
        
        
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
          
    }

}
