package theJourneyCalculator;
import java.util.Scanner;

public class JourneyCalculatorApp2 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed And Time To Calculate Distance");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculatorApp journeyCalculator=new JourneyCalculatorApp();
		double distance=journeyCalculator.calculateDistance(speed,time);
		System.out.println(distance);
		
		
				
	}

}
