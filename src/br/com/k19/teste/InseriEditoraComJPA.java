/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.k19.teste;


import javax.persistence.*;
import java.io.*;
import java.util.Scanner;
import br.com.k19.modelo.*;

/**
 *
 * @author suporte
 */
public class InseriEditoraComJPA {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("k19");
        
        EntityManager manager = factory.createEntityManager();
        
        Editora novaEditora = new Editora();
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite o nome da Editora : ");
        novaEditora.setNome(entrada.nextLine());
        
        System.out.println("Digite o Email da Editora : ");
        novaEditora.setEmail(entrada.nextLine());
        
       
        manager.persist(novaEditora);
        
        
        manager.getTransaction().begin();
        manager.getTransaction().commit();
        
        factory.close();
        
    
    }
}
