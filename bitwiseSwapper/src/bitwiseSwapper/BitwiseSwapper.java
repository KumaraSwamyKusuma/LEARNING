package bitwiseSwapper;
import java.util.Scanner;
public class BitwiseSwapper {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter First Integer");
	int firstinteger=scan.nextInt();
	System.out.println("Enter Second Integer");
	int secondinteger=scan.nextInt();
	swapUsingBitwise(firstinteger,secondinteger);
	}
public static void swapUsingBitwise(int firstinteger, int secondinteger) {
System.out.println("After swapping: First="+secondinteger+",Second="+firstinteger);
}

}
