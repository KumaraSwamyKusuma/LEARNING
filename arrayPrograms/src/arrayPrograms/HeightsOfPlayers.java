package arrayPrograms;



	import java.util.Scanner;

	public class HeightsOfPlayers {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			Double arr[]=new Double[10];
			for (int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Enter height of players");
				arr [i]=scan.nextDouble();
			}
			System.out.println("Player heights are..");
	              for (int i=0;i<=arr.length-1;i++)
	              {
	            	  System.out.print(arr[i]+" ");
	              }
		}

	}

