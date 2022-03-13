package com.company.emailModel;


public class Employee {
	
private String firstName;
private String lastName;

//Parameterized constructor
public Employee(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
}

/**
 * @return - This is a getter method and it returns employee's firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @return - This is a setter method used to set employee's firstName
 * @param firstName
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return - This is a getter method and it returns employee's lastName
 */
public String getLastName() {
	return lastName;
}


/**
 * @return - This is a setter method used to set employee's lastName
 * @param lastName
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
}


}
