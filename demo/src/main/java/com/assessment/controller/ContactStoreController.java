/**
 * 
 */
package com.assessment.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.dto.CustomerDto;
import com.assessment.dto.SupplierDto;
import com.assessment.exception.ConstraintViolation;
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

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String createCustomer(@RequestBody CustomerDto customerDto) {
		
		if(customerDto.getPerson()==null && customerDto.getCompany()!=null) {
		
			Customer customer = new Customer();
			customer.setCustomerNumber(customerDto.getCustomerNumber());
			customer.setLastOrderDate(new Date());
			Company company = new Company();
			company.setName(customerDto.getCompany().getName());
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setAreaCode(customerDto.getCompany().getPhoneNumber().getAreaCode());
			phoneNumber.setNumber(customerDto.getCompany().getPhoneNumber().getNumber());
			phoneNumber.setCompany(company);
			company.setPhoneNumber(phoneNumber);
			company.setRegistrationNumber(customerDto.getCompany().getRegistrationNumber());
			company.setCustomer(customer);
			customer.setCompany(company);
			contactService.createCustomer(customer);
			return "Customer is a company which is stored";
		
		}else if(customerDto.getCompany()==null && customerDto.getPerson()!=null) {
			
			 Customer customer = new Customer();
			 customer.setCustomerNumber(customerDto.getCustomerNumber()); 
			 customer.setLastOrderDate(new Date());
			 Person person = new Person(); 
			 person.setFirstName(customerDto.getPerson().getFirstName());
			 person.setLastName(customerDto.getPerson().getLastName()); 
			 PhoneNumber phoneNumber = new PhoneNumber();
			 phoneNumber.setAreaCode(customerDto.getPerson().getPhoneNumber().getAreaCode()); 
			 phoneNumber.setNumber(customerDto.getPerson().getPhoneNumber().getNumber());
			 phoneNumber.setPerson(person); 
			 person.setPhoneNumber(phoneNumber);
			 person.setCustomer(customer); 
			 customer.setPerson(person);
			 contactService.createCustomer(customer);
			 return "Customer is a person which is stored..";
		}else {
			throw new ConstraintViolation("Customer can either be company or person");
		}
	}
	
	
	@RequestMapping(value = "/supplier", method = RequestMethod.POST)
	public String createSupplier(@RequestBody SupplierDto supplierDto){
		// Create Supplier
		if(supplierDto.getPerson()==null && supplierDto.getCompany()!=null) {
			
			Supplier supplier=new Supplier(); 
			supplier.setOrderLeadTimeInDays(supplierDto.getOrderLeadTimeInDays());
			supplier.setTaxNumber(supplierDto.getTaxNumber()); 
			Company company = new Company();
			company.setName(supplierDto.getCompany().getName());
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setAreaCode(supplierDto.getCompany().getPhoneNumber().getAreaCode());
			phoneNumber.setNumber(supplierDto.getCompany().getPhoneNumber().getNumber());
			phoneNumber.setCompany(company);
			company.setPhoneNumber(phoneNumber);
			company.setRegistrationNumber(supplierDto.getCompany().getRegistrationNumber());
			company.setSupplier(supplier);
			supplier.setCompany(company);
			contactService.createSupplier(supplier);
			return "Supplier is a company which is stored";
		}else if (supplierDto.getCompany()==null && supplierDto.getPerson()!=null) {
			Supplier supplier = new Supplier();
			supplier.setTaxNumber(supplierDto.getTaxNumber());
			supplier.setOrderLeadTimeInDays(supplierDto.getOrderLeadTimeInDays());
			Person person = new Person();
			person.setFirstName(supplierDto.getPerson().getFirstName());
			person.setLastName(supplierDto.getPerson().getLastName());
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setAreaCode(supplierDto.getPerson().getPhoneNumber().getAreaCode());
			phoneNumber.setNumber(supplierDto.getPerson().getPhoneNumber().getNumber());
			phoneNumber.setPerson(person);
			person.setPhoneNumber(phoneNumber);
			person.setSupplier(supplier);
			supplier.setPerson(person);
			contactService.createSupplier(supplier);
			 return "Supplier is a person which is stored..";
		}else {
			throw new ConstraintViolation("Supplier can either be company or person");
		}
	}
}
