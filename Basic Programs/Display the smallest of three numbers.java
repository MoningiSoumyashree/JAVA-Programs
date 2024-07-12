//display the smallest of three numbers
import java.util.Scanner;
class SmallestOf3Num 
{
	public static void main(String[] args) 
	{
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter 3 Numbers: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		int res = n1 < n2 ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);
		System.out.println("=============");
		System.out.println(res);
	}
}
