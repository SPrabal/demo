/**
 * 
 */
package com.assessment.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.assessment.dao.ContactDao;
import com.assessment.model.Customer;
import com.assessment.model.Supplier;

/**
 * @author Prabal
 * @Description Contact data access object
 *
 */
@Repository
public class ContactDaoImpl implements ContactDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Save Customer Details
	 */
	@Transactional
	public void createCustomer(Customer customer) {
		
	    if (!entityManager.contains(customer)) {
	    	entityManager.persist(customer);
	    }
	    
	}
	
	/**
	 * Save Supplier Details
	 */
	@Transactional
	public void createSupplier(Supplier supplier) {
		if (!entityManager.contains(supplier)) {
	    	entityManager.persist(supplier);
	    }
	}
}