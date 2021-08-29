package com.greatlearning.service;

import java.util.Scanner;

public class Driver {

	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		case 1:            
			break;

		case 2:            
			break;
			
		case 3:            
			break;
		case 4:	           
		    break;
		    
		default:        System.out.println("Kindly Provide a Valid Input");
			break;
		}
}



	}


