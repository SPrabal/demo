/**
 * 
 */
package com.assessment.service;

import org.springframework.stereotype.Component;

import com.assessment.model.Customer;
import com.assessment.model.Supplier;

/**
 * @author Prabal
 *
 */
@Component
public interface ContactService {
	void createCustomer(Customer customer);
	void createSupplier(Supplier supplier);
}
