package theTemperatureConverter;
import java.util.Scanner;

public class TemperatureConverterApp2 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit");
		double F=scan.nextDouble();
		TemperatureConverterApp temperatureConverter=new TemperatureConverterApp();
		System.out.println(temperatureConverter.convertFahrenheitToCelsius(68.0));
		
		
	}

}
