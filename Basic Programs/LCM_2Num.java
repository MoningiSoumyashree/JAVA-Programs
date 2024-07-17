//Program to compute the LCM of two given numbers
import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = s.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = s.nextInt();
		int lcm = (n1 > n2) ? n1 : n2;
		boolean test = true;
		while(test==true)
		{
			if (lcm%n1==0 && lcm%n2==0)
			{
				test =false;
				break;
			}
			lcm++;
		}
		System.out.println(lcm);
	}
}
 
