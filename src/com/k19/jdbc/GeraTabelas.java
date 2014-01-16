/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.k19.jdbc;

import javax.persistence.*;
/**
 *
 * @author suporte
 */
public class GeraTabelas {
    public static void main(String[] args){
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("tarefas");
        factory.close();
    }
}
