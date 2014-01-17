/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.teste;

import br.com.k19.modelo.Cliente;
import br.com.k19.modelo.Pedido;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author suporte
 */
public class AdicionaPedidoCliente {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("k21_mapeamento_pu");

        EntityManager manager = factory.createEntityManager();

            manager.getTransaction().begin();
        
            Cliente c = new Cliente();
            c.setNome("Rafael Cosentino");
            
            Pedido p = new Pedido();
            p.setData(Calendar.getInstance());
            p.setCliente(c);
            
            
            manager.persist(c);
            manager.persist(p);
            
            manager.getTransaction().commit();
            
            manager.close();
            factory.close();

    }
}
