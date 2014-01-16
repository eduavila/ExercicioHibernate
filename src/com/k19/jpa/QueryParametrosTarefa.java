
package com.k19.jpa;



import javax.persistence.*;
import com.k19.modelo.Tarefa;
import java.util.List;
/**
 *
 * @author suporte
 */
public class  QueryParametrosTarefa  {
    
    public static void main(String[] args){
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
        
        EntityManager  manager = factory.createEntityManager();
        Query query = manager
                .createQuery("select t from Tarefa as t "+
                        "where t.finalizado = :paramFinalizado");
        query.setParameter("paramFinalizado", false);
        
        List<Tarefa> lista= query.getResultList();
        for(Tarefa tarefa:lista){
            System.out.println(tarefa.getDescricao());
        }
        
        manager.close();
    }
    
}
