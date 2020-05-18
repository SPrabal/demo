/**
 * 
 */
package com.assessment.dto;

/**
 * @author Prabal
 * @Description Suppplier data transfer object
 *
 */

public class SupplierDto {
	private String taxNumber;
	private Integer orderLeadTimeInDays;
	private PersonDto person;
	private CompanyDto company;
	
	
	public SupplierDto() {
		
	}


	/**
	 * @return the taxNumber
	 */
	public String getTaxNumber() {
		return taxNumber;
	}


	/**
	 * @param taxNumber the taxNumber to set
	 */
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}


	/**
	 * @return the orderLeadTimeInDays
	 */
	public Integer getOrderLeadTimeInDays() {
		return orderLeadTimeInDays;
	}


	/**
	 * @param orderLeadTimeInDays the orderLeadTimeInDays to set
	 */
	public void setOrderLeadTimeInDays(Integer orderLeadTimeInDays) {
		this.orderLeadTimeInDays = orderLeadTimeInDays;
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
