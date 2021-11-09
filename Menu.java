package com.calculator.jonathan;

import java.util.Scanner;

public class Menu {

	Scanner input = new Scanner(System.in);
	
	public void menu() {
		double num1;
		double num2;
		boolean menuActive = true;
		while(menuActive) {
			System.out.println("Calculator Menu");
			System.out.println("===============================");
			System.out.println("1.Addition");
			System.out.println("===============================");
			System.out.println("2.Subtraction");
			System.out.println("===============================");
			System.out.println("3.Multiplication");
			System.out.println("===============================");
			System.out.println("4.Division");
			System.out.println("===============================");
			System.out.println("5.EXIT");
			System.out.println("Choose an option: ");
			int menuChoice = input.nextInt();
		
		
			switch(menuChoice) {
				case 1:
				System.out.println("What two numbers do you want to add?");
				System.out.println("First number: ");
				num1 = input.nextInt();
				System.out.println("Second number: ");
				num2 = input.nextInt();
				Calculator.addMethod(num1, num2);
				System.out.println("Your answer is: "+Calculator.addMethod(num1, num2));
					break;
				case 2:
					System.out.println("What two numbers do you want to subtract?");
					System.out.println("First number: ");
					num1 = input.nextInt();
					System.out.println("Second number: ");
					num2 = input.nextInt();
					Calculator.minusMethod(num1, num2);
					System.out.println("Your answer is: "+Calculator.minusMethod(num1, num2));
					break;
				case 3:
					System.out.println("What two numbers do you want to multiply?");
					System.out.println("First number: ");
					num1 = input.nextInt();
					System.out.println("Second number: ");
					num2 = input.nextInt();
					Calculator.minusMethod(num1, num2);
					System.out.println("Your answer is: "+Calculator.multiMethod(num1, num2));
					break;
				case 4:
					System.out.println("What two numbers do you want to divide?");
					System.out.println("First number: ");
					num1 = input.nextInt();
					System.out.println("Second number: ");
					num2 = input.nextInt();
					Calculator.minusMethod(num1, num2);
					System.out.println("Your answer is: "+Calculator.divMethod(num1, num2));
					break;
				case 5:
					menuActive = false;
					System.out.println("App Terminated");
					break;
					
				default:
					System.out.println("Try again: ");
			}
		
	}
	}	
}
