//greatest of 2 numbers using decision statement
import java.util.Scanner;
class GreatestOf2Num 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		if (n1 > n2)
		{
			System.out.println("n1 is bigger ");
		}
		else
		{
			System.out.println("n2 is bigger ");
		}
	}
}
