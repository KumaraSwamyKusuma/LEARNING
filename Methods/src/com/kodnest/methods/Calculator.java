package com.kodnest.methods;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int first=scan.nextInt();
		int second=scan.nextInt();
		System.out.println("Enter An Operator(+,-,*,/)");
		char operator=scan.next().charAt(0);
		int result;
		switch(operator)
		
		{
		case '+':
			result=first+second;
			System.out.println(result);
			break;
		case '-':
			result=first-second;
			System.out.println(result);
			break;
		case '*':
			result=first*second;
			System.out.println(result);
			break;
		case '/':
			result=first/second;
            System.out.println(result);
            break;
			default:
				System.out.println("Error!operator is not correct");
				return;
				
			
		}
	
		
		
		
		
				
	}

	}
		
	


