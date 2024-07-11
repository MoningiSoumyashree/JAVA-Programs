//display the cube of given number by user
//Sample input :
// 5
//Sample output:
//125
import java.util.Scanner;
class  CubeValue
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n * n * n);
	}
}
