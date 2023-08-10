package theDoubleTrouble;
import java.util.Scanner;

public class DoubleNumber {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		double num = scan.nextDouble();
		int res =(int) num*2;
		System.out.println(res);
	}
	public static int doubleTheNumber(int num)
	
	{
		return(int) num*2;
}
}
