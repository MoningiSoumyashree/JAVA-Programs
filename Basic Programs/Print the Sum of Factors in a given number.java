//Print the Sum of Factors in a given number
import java.util.Scanner;
class SumOfFactor
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int Res=0;
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				System.out.println(i);
				Res=i+Res;
			}
		}
		System.out.println("Sum of Factor is"+Res);
	}
}
