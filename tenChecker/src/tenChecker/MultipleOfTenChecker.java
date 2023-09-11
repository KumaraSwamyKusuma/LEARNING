package tenChecker;

import java.util.Scanner;

public class MultipleOfTenChecker {
	public static void checkMultipleOfTen(int n)
	{
		if (n%10==0)
		{
			System.out.println("The Number is multiple of 10");
			
		}
		else
		{
			System.out.println("The Number Is Not Multiple of 10");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =scan.nextInt();
		checkMultipleOfTen(n);
		
	}
}
