//calculate the simple interest and input given by the user
import java.util.Scanner;
class SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount, time & rate of interest :");
		double p = sc.nextDouble();
		int t = sc.nextInt();
		int r = sc.nextInt();
		
		double res = (p * t * r /100);
	    System.out.println(res);
	}
}
