package com.company.emailApp;

import com.company.emailModel.Employee;
import com.company.emailService.CredentialService;
import com.company.emailService.WelcomeService;

public class Driver {

	public static void main(String[] args) {

		Employee employee = new Employee("Sruthi", "Saride");
		WelcomeService ws = new WelcomeService();
		CredentialService cs = new CredentialService();

		ws.displayOptions();
		cs.showCredentials(employee, ws.departmentName());

	}
}