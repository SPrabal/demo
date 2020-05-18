/**
 * 
 */
package com.assessment.dto;


/**
 * @author Prabal
 * @Description Phone Number data transfer object
 *
 */

public class PhoneNumber {
	
	private Integer areaCode;
	private Long number;
    private PersonDto person;
    private CompanyDto company;
    
	public PhoneNumber() {
		
	}

	/**
	 * @return the areaCode
	 */
	public Integer getAreaCode() {
		return areaCode;
	}

	/**
	 * @param areaCode the areaCode to set
	 */
	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * @return the number
	 */
	public Long getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Long number) {
		this.number = number;
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
