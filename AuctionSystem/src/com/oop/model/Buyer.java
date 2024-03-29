/**
 * OOP 2019
 * 
 * @author nawod lihinikaduwa OOP Assignment, SLIIT 
 * 
 * @version 1.0
 * Copyright: SLIIT, All rights reserved
 * 
 */
package com.oop.model;


public class Buyer {

	private String BuyerID;
	
	private String FirstName;

	private String LastName;

	private String Email;

	private String Password;

	/**
	 * @return the employeeID
	 */
	public String getBuyerID() {
		return BuyerID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setBuyerID(String buyerID) {
		BuyerID = buyerID;
	}

	/**
	 * @return the name
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @param name the name to set
	 */
	public void setFirstName(String firstname) {
		FirstName = firstname;
	}

	/**
	 * @return the name
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param name the name to set
	 */
	public void setLastName(String lastname) {
		LastName = lastname;
	}

	/**
	 * @return the designation
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the facultyName
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		
		return "Buyer ID = " + BuyerID + "\n" + "First Name = " + FirstName + "\n" + "LastName = " + LastName + "\n"
				+ "Email = " + Email + "\n" + "Password = " + Password;
	}
}
