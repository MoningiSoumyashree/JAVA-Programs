//Smallest of Two numbers by using Turnary operator
import java.util.Scanner;
class SmallestNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		int res = n1 < n2 ? n1: n2;
		System.out.println(res+ "is smallest number");
	}
}
