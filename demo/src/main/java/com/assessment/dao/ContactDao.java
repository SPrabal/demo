/**
 * 
 */
package com.assessment.dao;

import org.springframework.stereotype.Component;

import com.assessment.model.Customer;
import com.assessment.model.Supplier;

/**
 * @author Prabal
 * @ Description Save Customer and Supplier details
 */
@Component
public interface ContactDao {

	void createCustomer(Customer customer);
	void createSupplier(Supplier supplier);
	
}
