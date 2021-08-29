package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.Credentials;

public class Driver {
	
	public static void main(String[] args) {
		 
		String department = "Tech";
		Employee emp = new Employee("Piyush","Sahani",department);
		Credentials credentials = new Credentials();
		Scanner scanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Please Enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HumanResource");
		System.out.println("4. Legal");
	   // departmentName = scanner.next();
		int option =0;
		option = scanner.nextInt();
		
		switch (option) {
		case 1:       emp.setDepartment("tech");
		              
			break;
		case 2:       emp.setDepartment("admin"); 
		              
			break;	
		case 3:      emp.setDepartment("Hr");
		             
			break;
		case 4:	      emp.setDepartment("legal");     
		    break;	    
		default:        System.out.println("Kindly Provide a Valid Input");
			break;
		}
		
		credentials.showCredentials(emp);
}
	
	}


