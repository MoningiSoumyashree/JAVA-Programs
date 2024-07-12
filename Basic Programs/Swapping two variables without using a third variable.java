//Swapping two variables without using a third variable
import java.util.Scanner;
class SwapNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = s.nextInt();
		System.out.println("Enter Second Number");
		int b = s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("==========");
		System.out.println(a);
		System.out.println(b);
	}
}
