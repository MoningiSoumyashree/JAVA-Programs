//print each digit square value in a given range(Range:1-10) using looping statement
import java.util.Scanner;
class SquareDigit 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i*i);
		}
	}
}
