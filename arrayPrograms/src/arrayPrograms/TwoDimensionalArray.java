package arrayPrograms;
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
          String [] [] arr=new String[5] [6];
          for (int i=0;i<=arr.length-1;i++)
          {
        	  for (int j=0;j<=arr[i].length-1;j++)
        	  {
        		  System.out.println("Enter the names of bank "+ i +" customers "  +j);
        		  arr [i] [j] = scan.nextLine();
        	  }
          }
          System.out.println("Array Contents are...");
          for (int i=0;i<=arr.length-1;i++)
          {
        	  for (int j=0;j<=arr[i].length-1;j++)
        	  {
        		  System.out.print(arr [i] [j] + " ");
        	  }
        	  System.out.println();
          }
	}

}
