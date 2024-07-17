//Print the number is Prime or not using a looping statement
import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		if (n<=0)
		{
			System.out.println(n+ " " +"is not a prime number");
		}
		else
		{
			boolean flag = true;
			for (int i=2;i<n/2;i++ )
			{
				if (n%i==0)
				{
					flag = false;
				}break;
			}
			System.out.println(flag);
			if (flag)
			{
				System.out.println(n+ " " +"is  a prime number");
			}
			else System.out.println(n+ " " +"is not a prime number");
		}
	}
}
