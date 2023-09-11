package arrayPrograms;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter marks of Students");
			arr [i]=scan.nextInt();
		}
		System.out.println("Student marks are..");
              for (int i=0;i<=arr.length-1;i++)
              {
            	  System.out.print(arr[i]+" ");
              }
	}

}
