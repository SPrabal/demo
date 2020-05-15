/**
 * 
 */
package com.assessment.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.assessment.model.Company;
import com.assessment.model.Customer;
import com.assessment.model.Person;
import com.assessment.model.PhoneNumber;
import com.assessment.model.Supplier;
import com.assessment.service.ContactService;

/**
 * @author Prabal
 *
 */
@RestController
public class ContactStoreController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String createCustomer() throws Exception {

		// Create Customer
		Customer customer = new Customer();
		customer.setCustomerNumber("CN1");
		customer.setLastOrderDate(new Date());
		Company company = new Company();
		company.setName("COMP1");
		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.setAreaCode(1234);
		phoneNumber.setNumber(9953820025L);
		phoneNumber.setCompany(company);
		company.setPhoneNumber(phoneNumber);
		company.setRegistrationNumber("REG1981");
		company.setCustomer(customer);
		customer.setCompany(company);
		contactService.createCustomer(customer);

		customer = new Customer();
		customer.setCustomerNumber("CN2");
		customer.setLastOrderDate(new Date());
		Person person = new Person();
		person.setFirstName("Nishant");
		person.setLastName("Soni");
		phoneNumber = new PhoneNumber();
		phoneNumber.setAreaCode(1234);
		phoneNumber.setNumber(9953000000L);
		phoneNumber.setPerson(person);
		person.setPhoneNumber(phoneNumber);
		person.setCustomer(customer);
		customer.setPerson(person);
		contactService.createCustomer(customer);

		// Create Supplier
		Supplier supplier=new Supplier(); 
		supplier.setOrderLeadTimeInDays(14);
		supplier.setTaxNumber("TAX1234"); 
		company = new Company();
		company.setName("COMP2");
		phoneNumber = new PhoneNumber();
		phoneNumber.setAreaCode(4567);
		phoneNumber.setNumber(9953827725L);
		phoneNumber.setCompany(company);
		company.setPhoneNumber(phoneNumber);
		company.setRegistrationNumber("REG1901");
		company.setSupplier(supplier);
		supplier.setCompany(company);
		contactService.createSupplier(supplier);
		
		supplier = new Supplier();
		supplier.setTaxNumber("TAX3");
		supplier.setOrderLeadTimeInDays(15);
		person = new Person();
		person.setFirstName("Raj");
		person.setLastName("Sharma");
		phoneNumber = new PhoneNumber();
		phoneNumber.setAreaCode(8901);
		phoneNumber.setNumber(9967820025L);
		phoneNumber.setPerson(person);
		person.setPhoneNumber(phoneNumber);
		person.setSupplier(supplier);
		supplier.setPerson(person);
		contactService.createSupplier(supplier);
		
		return "Contacts Stored";
	}
}
