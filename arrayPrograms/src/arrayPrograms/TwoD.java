package arrayPrograms;
import java.util.Scanner;

public class TwoD {

			public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
		          int [] [] arr=new int [3][4];
		          for (int i=0;i<=arr.length-1;i++)
		          {
		        	  for (int j=0;j<=arr[i].length-1;j++)
		        	  {
		        		  System.out.println("Enter the age of class  "+ i +" students "  +j);
		        		  arr [i] [j] = scan.nextInt();
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


