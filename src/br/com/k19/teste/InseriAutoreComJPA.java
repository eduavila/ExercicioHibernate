
package br.com.k19.teste;


import javax.persistence.*;
import java.io.*;
import java.util.Scanner;
import br.com.k19.modelo.*;

/**
 *
 * @author suporte
 */
public class InseriAutoreComJPA {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("k19");
        
        EntityManager manager = factory.createEntityManager();
        
        Autor novoAutor = new Autor();
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite o nome da Autor : ");
        novoAutor.setNome(entrada.nextLine());
        
        
        
        
       
        manager.persist(novoAutor);
        
        
        manager.getTransaction().begin();
        manager.getTransaction().commit();
        
        factory.close();
        
    
    }
}