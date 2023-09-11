package theTaxCalculator;
import java.util.Scanner;
public class TheTaxCalculator {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The Purchase Amount: ");
	double purchaseamount=scan.nextDouble();
	System.out.println("Enter The Tax Rate (in decimal form)");
	double taxrate=scan.nextDouble();
	System.out.println("Total Cost including tax: ");
	System.out.println(calculateTotalWithTax( purchaseamount,taxrate));
	}
public static double calculateTotalWithTax(double purchaseamount,double taxrate) {
	double taxamount;
	taxamount=purchaseamount*taxrate;
	return taxamount+purchaseamount;
	
	
}
}
