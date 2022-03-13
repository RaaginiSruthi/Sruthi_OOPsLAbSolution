package com.company.emailService;

import java.util.Scanner;

public class WelcomeService {

	public void displayOptions() {
		System.out
				.println("Please enter the department from the following\n 1. Technical\n 2. Admin\n 3. HR\n 4. Legal");
		System.out.printf("\nEnter your input and press enter : \n$>");
	}

	public String departmentName() {
		String department = null;
		Scanner sc = new Scanner(System.in);
		do {
			int option = sc.nextInt();

			switch (option) {
			case 1:
				department = "tech";
				break;
			case 2:
				department = "admin";
				break;
			case 3:
				department = "hr";
				break;
			case 4:
				department = "legal";
				break;
			default:
				System.out.println("Please enter a valid number \n$>");
				break;
			}
		} while (department == null);
		sc.close();
		return department;

	}
}
