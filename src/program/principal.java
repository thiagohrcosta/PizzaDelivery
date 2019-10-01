package program;

import java.util.Scanner;

import user.client;
import user.employee;
import products.pizzaProducts;
import products.pizzaType;

public class principal extends pizzaProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Employers DATA BASE ----------------------------
		
		employee emp1 = new employee();
		emp1.Name = "John Billa";
		emp1.employeeCode = 001;
		
		employee emp2 = new employee();
		emp2.Name = "Anthony Woods";
		emp2.employeeCode = 002;
		
		employee emp3 = new employee();
		emp3.Name = "Jessica Underwood";
		emp3.employeeCode = 003;
				
		// End of Employers DATA BASE ---------------------
		
		System.out.println("Welcome! Please insert your EmployeeCode:");
		int codeEnter = sc.nextInt();
		
		if(codeEnter == 001) {
			System.out.println("=======================================================  ");
			System.out.println("Welcome " + emp1.Name + " we hope you have a nice day of work.");
		}
		else if(codeEnter == 002) {
			System.out.println("=======================================================  ");
			System.out.println("Welcome " + emp2.Name + " we hope you have a nice day of work.");
		}
		else if(codeEnter == 003) {
			System.out.println("=======================================================  ");
			System.out.println("Welcome " + emp3.Name + " we hope you have a nice day of work.");
		}
		
		else {
			System.out.println("ERROR!!! ERROR!!!");
			while (codeEnter > 003) {
				System.out.println("=====================================");
				System.out.println("Insert Again your EmployeeCode");
				codeEnter = sc.nextInt();
				
				if(codeEnter == 001) {
					System.out.println("=======================================================  ");
					System.out.println("Welcome " + emp1.Name + " we hope you have a nice day of work.");
				}
				else if(codeEnter == 002) {
					System.out.println("=======================================================  ");
					System.out.println("Welcome " + emp2.Name + " we hope you have a nice day of work.");
				}
				else if(codeEnter == 003) {
					System.out.println("=======================================================  ");
					System.out.println("Welcome " + emp3.Name + " we hope you have a nice day of work.");
				}
				

			}
			
		}
		
		System.out.println("=======================================================  ");
		System.out.println("");
		
		if (codeEnter == 001) {
			System.out.println(emp1.Name + ", what would you like to do?");
		}
		
		else if (codeEnter == 002) {
			System.out.println(emp2.Name + ", what would you like to do?");
		}
		
		else {
			System.out.println(emp3.Name + ", what would you like to do?");
		}
		

		System.out.println("");
		System.out.println("1. New Delivery");
		System.out.println("2. New Client");
		System.out.println("3. Exit System");
		
		int employeeChoice = sc.nextInt();
		
		switch(employeeChoice){
			case 1: 
				for (int i = 0; i < 4; i++) {
					System.out.println("");
				}
								
				
				
				break;
			case 2: 
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
		}
		
		
		
		sc.close();
	}


}
