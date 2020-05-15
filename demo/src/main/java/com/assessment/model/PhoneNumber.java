/**
 * 
 */
package com.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Prabal
 *
 */

@Entity
public class PhoneNumber {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer areaCode;
	
	@Column
	private Long number;

    @OneToOne(optional = true)
    @JoinColumn(name = "person_id", nullable = true)
    private Person person;
     
    @OneToOne(optional = true)
    @JoinColumn(name = "company_id", nullable = true)
    private Company company;
    
	public PhoneNumber() {
		
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}



}
