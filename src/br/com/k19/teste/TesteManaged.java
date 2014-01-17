
package br.com.k19.teste;



import br.com.k19.modelo.Pessoa;
import javax.persistence.*;
/**
 *
 * @author suporte
 */
public class TesteManaged {
    public static void main(String[] args){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("k21_entity_manager");
        EntityManager manager = factory.createEntityManager();
    
        manager.getTransaction().begin();
        
        //Objeto no Estado MANAGED
        Pessoa p = manager.find(Pessoa.class,1L);
        
        // Alterando o Conteudo do Objeto
        
        p.setNome("Marcelo Martis");
        
        // Sicronizado e Confirmando a Transação
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
    
    }
}
