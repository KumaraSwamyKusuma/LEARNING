package primeNumbersPrinter;
import java.util.Scanner;
public class Main {
	public static void printPrimes(int n )
	{
	     boolean prime =false;
		for (int i=2;i<=n/2;++i)
	
		{
			if (n%i==0)
			{
				prime=true;
			}
	
			if(!prime)
				System.out.println(n + i + "is a prime number.");
			else
				System.out.println(n + i + "is not a prime number.");
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=scan.nextInt();
         printPrimes(n);  
	}
}
