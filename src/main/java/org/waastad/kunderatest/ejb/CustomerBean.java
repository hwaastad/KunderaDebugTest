/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.kunderatest.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.waastad.kunderatest.entity.Customer;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
@Stateless
public class CustomerBean implements CustomerBeanLocal {

    @Inject
    private EntityManager em;

    @Override
    public List<Customer> getCustomers() {
        TypedQuery<Customer> createQuery = em.createQuery("SELECT t FROM Customer t", Customer.class);
        return createQuery.getResultList();
    }

    @Override
    public Customer createCustomer() {
        Customer c = new Customer("asfdasdf");
        em.persist(c);
        return c;
    }

}
