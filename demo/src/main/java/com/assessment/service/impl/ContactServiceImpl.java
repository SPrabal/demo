/**
 * 
 */
package com.assessment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.dao.ContactDao;
import com.assessment.model.Customer;
import com.assessment.model.Supplier;
import com.assessment.service.ContactService;

/**
 * @author Prabal
 * @Description Create new customer and supplier
 */
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDao contactDao; 

	/**
	 * 
	 * @param customer
	 * @return new customer created
	 */
	public void createCustomer(Customer customer) {
		contactDao.createCustomer(customer);
	}
	
	/**
	 * 
	 * @param supplier
	 * @return new supplier created
	 */
	public void createSupplier(Supplier supplier) {
		contactDao.createSupplier(supplier);
	}
}
