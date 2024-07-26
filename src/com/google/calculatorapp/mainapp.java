package com.google.calculatorapp;

import java.util.Scanner;

public class mainapp {

	public static void main(String[] args) {

		int operator,n1 = 0,n2 = 0,n3=0,n4=0,n5=0;
		System.out.println("1-Add \n 2- Subtract \n 3- Multiplication \n 4- Divide \n 5- Exit");
		System.out.print("choose operator from above:");
		Scanner scanner = new Scanner(System.in);
			operator = scanner.nextInt();
			System.out.println("Enter the number of operands (2 or 3 or 4 or 5) : ");
            int numOperands = scanner.nextInt();
            if(numOperands >5) {
            	System.out.println("Enter in between the given range");
            }
			
			AddApp Add = new AddApp();
			SubApp Sub = new SubApp();
			MulApp Mul = new MulApp();
			DivApp Div = new DivApp();
			
			if ((operator <=4) && numOperands == 2) {
				System.out.print("Enter First Number:");
				n1 = scanner.nextInt();
				System.out.print("Enter Second Number:");
				n2 = scanner.nextInt();
			}
				
				if ((operator== 1 || operator == 2) && numOperands == 3) {
					System.out.print("Enter First Number:");
					n1 = scanner.nextInt();
					System.out.print("Enter Second Number:");
					n2 = scanner.nextInt();
					System.out.print("Enter Third Number:");
					n3 = scanner.nextInt();
					
				}
					
					if ((operator== 1 || operator == 2) && numOperands == 4) {
						System.out.print("Enter First Number:");
						n1 = scanner.nextInt();
						System.out.print("Enter Second Number:");
						n2 = scanner.nextInt();
						System.out.print("Enter Third Number:");
						n3 = scanner.nextInt();
						System.out.print("Enter Fourth Number:");
						n4 = scanner.nextInt();
						
					}
						
						
						if ((operator== 1 || operator == 2) && numOperands == 5) {
							System.out.print("Enter First Number:");
							n1 = scanner.nextInt();
							System.out.print("Enter Second Number:");
							n2 = scanner.nextInt();
							System.out.print("Enter Third Number:");
							n3 = scanner.nextInt();
							System.out.print("Enter Fourth Number:");
							n4 = scanner.nextInt();
							System.out.print("Enter Fifth Number:");
							n5 = scanner.nextInt();
						}
		
			

	
		switch(operator) {
		case 1 :
//			System.out.println(Add.Addition(n1, n2));
//			System.out.println(Add.Addition(n1, n2, n3));
//			System.out.println(Add.Addition(n1, n2, n3, n4));
//			System.out.println(Add.Addition(n1, n2, n3, n4, n5));
			Add.Addition(n1,n2,n3,n4,n5); 
					
			break;
			
		case 2 :
			/*
			 * System.out.println(Sub.Subraction(n1, n2));
			 * System.out.println(Sub.Subraction(n1, n2, n3));
			 * System.out.println(Sub.Subraction(n1, n2, n3, n4));
			 * System.out.println(Sub.Subraction(n1, n2, n3, n4, n5));
			 */
			Sub.Subraction(n1,n2,n3,n4,n5);
			Sub.Calculation();
			break;
			
		case 3 :
			System.out.println(Mul.Multiplication(n1, n2));
			Mul.Calculation();
			break;	
			
		case 4 :
			System.out.println(Div.Divide(n1, n2));
			Div.Calculation();
			break;
			
		case 5 :
			System.out.println("Exit the application");
			break;
			
		default:
			System.out.println("Entered operator is Invalid");
			
		}

	
}
}
