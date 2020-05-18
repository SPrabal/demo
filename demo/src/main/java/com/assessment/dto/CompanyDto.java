/**
 * 
 */
package com.assessment.dto;

/**
 * @author Prabal
 * @Description Company data transfer object
 *
 */

public class CompanyDto {
	
	private String name;
	private String registrationNumber;
	private PhoneNumber phoneNumber;
    private CustomerDto customer;
    private SupplierDto supplier;
	
	public CompanyDto() {
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * @return the phoneNumber
	 */
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the customer
	 */
	public CustomerDto getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

	/**
	 * @return the supplier
	 */
	public SupplierDto getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(SupplierDto supplier) {
		this.supplier = supplier;
	}
	
}
