package validator;
import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	boolean is_valid=true;
	boolean meets_certain_condition=true;
	System.out.println("Is Input Valid (true/false): "+is_valid);
	System.out.println("Does Input Meets A Certain Condition(true/false): "+meets_certain_condition);
	if(is_valid)
	{
		System.out.println("Input Is Valid");
		
	}
	else
	{
		System.out.println("Input Is Invalid");
		
	}
}
public static boolean isValidInput(boolean is_valid,boolean meets_certain_condition)
{
	return is_valid && meets_certain_condition;
	}
}
