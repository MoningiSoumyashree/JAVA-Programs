//Swapping two variables using third variable
import java.util.Scanner;
class Swap 
{
	public static void main(String[] args) 
	{
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a = s.nextInt();
		System.out.println("Enter second number: ");
		int b = s.nextInt();
		
		int c =0;
		c=a;
		a=b;
		b=c;
		System.out.println("A= "+a);
		System.out.println("B= "+b);
	}
}
