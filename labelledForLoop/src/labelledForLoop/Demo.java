package labelledForLoop;

public class Demo {
public static void main(String[] args)
{
	System.out.println("ROBO...");
	int i=1;
	rajini:while(i<=5)
	{
		int j=1;
		
		tamanna:while(j<=5)
		{
			System.out.println("*");
			j++;
			break rajini;
		}
	}
}
}
