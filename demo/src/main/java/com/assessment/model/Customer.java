/**
 * 
 */
package com.assessment.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Prabal
 *
 */

@Entity(name = "customer")
public class Customer {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String customerNumber;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastOrderDate;
	
	@OneToOne(mappedBy = "customer", cascade = CascadeType.PERSIST, optional = true)
	private Person person;
	
	@OneToOne(mappedBy = "customer", cascade = CascadeType.PERSIST, optional = true)
	private Company company;
	
	public Customer() {
		
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
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
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
	
}
