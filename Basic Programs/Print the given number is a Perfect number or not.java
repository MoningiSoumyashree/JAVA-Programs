//Print the given number is a Perfect number or not
import java.util.Scanner;
class PerfectNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int sum = 0;
		for (int i=1;i<n;i++ )
		{
			if (n%i==0)
		     {
				sum+=i;
		     }
		}
		if (sum==n)
		{
			System.out.println(n+ " " +"is a Perfect Number");
		}
		else System.out.println(n+ " " +"is not a Perfect Number");
	}
}
