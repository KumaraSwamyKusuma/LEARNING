package arrayPrograms;
import java.util.Scanner;

public class EmployeeNames {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[8];
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter names of employee");
			arr [i]=scan.nextLine();
		}
		System.out.println("Employee Names are..");
              for (int i=0;i<=arr.length-1;i++)
              {
            	  System.out.print(arr[i]+" ");
              }
	}

}