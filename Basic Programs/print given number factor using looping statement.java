//print given number factor using looping statement
import java.util.Scanner;
class FactorNum 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i=1;i<=n;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
