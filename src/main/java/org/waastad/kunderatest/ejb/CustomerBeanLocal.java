/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.kunderatest.ejb;

import java.util.List;
import javax.ejb.Local;
import org.waastad.kunderatest.entity.Customer;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
@Local
public interface CustomerBeanLocal {

    List<Customer> getCustomers();

    Customer createCustomer();

}
