package theTemperatureConversion;
import java.util.Scanner;

public class TemperatureConversion {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Welcome To The Temperature Conversion Tool!");
	System.out.println("Welcome To The Temperature Conversion Tool!\r\n"
			+"\r\n"
			+"Select an option:\r\n"
			+"\r\n"
			+"1.Convert Celsius to Fahrenheit\r\n"
			+"\r\n"
			+"2.Convert Fahrenheit to Celsius");
	int choice=scan.nextInt();
	if (choice==1)
	{
		System.out.println("Enter The Temperature in Celcius: ");
		double celcius=scan.nextDouble();
		System.out.println(celciusToFahrenheit(celcius));
	}
	else if(choice==2)
	{
		System.out.println("Enter The Temperature in Fahrenheit");
		double fahrenheit=scan.nextDouble();
		System.out.println(fahrenheitToCelcius(choice));
		
	}
	else
	{
		System.out.println("Invalid...");
		
	}
	scan.close();
		}
public static double celciusToFahrenheit(double celcius) {
	return(celcius*9/5)+32;
	}
public static double fahrenheitToCelcius(double fahrenheit) {
	return(fahrenheit-32)*5/9;
	
}

}


