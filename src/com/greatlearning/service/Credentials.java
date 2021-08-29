package com.greatlearning.service;

import java.security.SecureRandom;

import com.greatlearning.model.Employee;

public class Credentials {

	public static String generateEmail(Employee employee) {

		return employee.getFirstname() + "" + employee.getLastname() + "." + employee.getDepartment() + "@" + "abc.com";
	}

	// Generating Password
	public static String generatePassword(int len) {
		// ASCII range – alphanumeric (0-9, a-z, A-Z)
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_<>~";

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		// each iteration of the loop randomly chooses a character from the given
		// ASCII range and appends it to the `StringBuilder` instance

		for (int i = 0; i < len; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}

		return sb.toString();
	}

	
	// Show Credentials Method
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstname() + " your Generated credentials are as follows");
		System.out.println("Email -- >" + Credentials.generateEmail(employee));
		System.out.println("Password --> " + Credentials.generatePassword(8));
	}
}
