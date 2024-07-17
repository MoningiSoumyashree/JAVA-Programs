//Convert the given number Decimal To Binary using loop
import java.util.Scanner;
class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		long binary=0;
		long placeorder=1;
		while(n!=0)
		{
			int rem = n%2;
			binary = binary + rem * placeorder;
			
			n/=2;
			placeorder *= 10;
		}
		System.out.println(binary);
	}
}
