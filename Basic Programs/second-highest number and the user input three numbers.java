//second-highest number and the user input three numbers.
import java.util.Scanner;
class SecondHighestNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		if (n1 > n2 && n1 > n3)
		{
			if (n2 > n3)
			{
				System.out.println(n2+"is bigger");
			}
			else
			{
				System.out.println(n3+"is bigger ");
			}
		}
		else if (n2 > n1 && n2 > n3)
		{
			if (n1 > n3)
			{
				System.out.println(n1+"is bigger ");
			}
			else{System.out.println(n3+"is bigger ");}
		}
		else if (n3 > n1 && n3 > n2)
			{
				if (n1 > n2)
				{
				System.out.println(n1+"is bigger ");
				}
				else{
					System.out.println(n2+"is bigger ");
				}
			}
		else{
			System.out.println("enter a valid number ");
		}
	}
}
