/**
 * 
 */
package com.assessment.dto;

import java.util.Date;


/**
 * @author Prabal
 * @Description Customer datta transfer object
 *
 */
public class CustomerDto {
	private String customerNumber;
	private Date lastOrderDate;
	private PersonDto person;
	private CompanyDto company;
	
	public CustomerDto() {
		
	}

	/**
	 * @return the customerNumber
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the lastOrderDate
	 */
	public Date getLastOrderDate() {
		return lastOrderDate;
	}

	/**
	 * @param lastOrderDate the lastOrderDate to set
	 */
	public void setLastOrderDate(Date lastOrderDate) {
		this.lastOrderDate = lastOrderDate;
	}

	/**
	 * @return the person
	 */
	public PersonDto getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(PersonDto person) {
		this.person = person;
	}

	/**
	 * @return the company
	 */
	public CompanyDto getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(CompanyDto company) {
		this.company = company;
	}
	
	
}
