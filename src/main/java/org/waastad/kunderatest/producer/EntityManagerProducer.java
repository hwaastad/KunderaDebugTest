/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.kunderatest.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
@Slf4j
@ApplicationScoped
public class EntityManagerProducer {

    @PersistenceContext(unitName = "KunderaTestPU")
    private EntityManager em;

    @Produces
    @RequestScoped
    public EntityManager create() {
        log.info("Producing entitymanager: {}", em);
        return em;
    }
}
