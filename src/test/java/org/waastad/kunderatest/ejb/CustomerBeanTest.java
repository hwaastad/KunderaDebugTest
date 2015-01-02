/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.kunderatest.ejb;

import javax.ejb.EJB;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.apache.openejb.junit.jee.EJBContainerRule;
import org.apache.openejb.junit.jee.InjectRule;
import org.apache.openejb.junit.jee.config.PropertyFile;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.ClassRule;
import org.junit.Rule;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
@PropertyFile("container.properties")
@Slf4j
public class CustomerBeanTest {

    @ClassRule
    public static final EJBContainerRule CONTAINER_RULE = new EJBContainerRule();

    @Rule
    public final InjectRule injectRule = new InjectRule(this, CONTAINER_RULE);

    public CustomerBeanTest() {
    }

    @EJB
    private CustomerBeanLocal customerBeanLocal;

    @Test
    public void testSomeMethod() {
//      customerBeanLocal.getCustomers();
      customerBeanLocal.createCustomer();
//      customerBeanLocal.getCustomers();
    }

}
