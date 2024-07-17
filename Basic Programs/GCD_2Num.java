//Program to compute the GCD of two given numbers
import java.util.Scanner;
class GCD 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1 = s.nextInt();
		System.out.println("Enter 2nd number:");
		int n2 = s.nextInt();
		int gcd = 1;
		for (int i = 2;i<=n1 && i<=n2;i++)
		{
			if (n1 % i==0 && n2 % i==0)
			{
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
