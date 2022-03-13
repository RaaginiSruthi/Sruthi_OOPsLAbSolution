package com.company.emailService;

import java.util.Random;

import com.company.emailModel.Employee;

public class CredentialService {

	/**
	 * @return - This method returns email address generated for the employee to
	 *         showCredentials method
	 * @param employee
	 * @param department
	 */
	public String generateEmailAddress(Employee employee, String department) {

		return employee.getFirstName() + employee.getLastName() + "@" + department + ".abc.com";

	}

	/**
	 * @return - This method is used to generate a password and returns a password
	 *         of 8 character length to showCredentials method
	 */
	public char[] generatePassword() {

		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String special = "~!@#$%^&*()_+:>}{|?";

		String values = letters + numbers + special;

		char[] password = new char[8];

		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}

		return password;

	}

	/**
	 * @return - This method is used to display the login credentials for employee.
	 *         This gets the emailId and password from generateEmailAddress and
	 *         generatePassword methods respectively.
	 * @param employee
	 * @param department
	 */
	public void showCredentials(Employee employee, String department) {

		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email        --->  " + generateEmailAddress(employee, department).toLowerCase());
		System.out.println("Password --->  " + new String(generatePassword()));

	}
}
