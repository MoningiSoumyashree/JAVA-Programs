//Given charater is vowel or not
import java.util.Scanner;
class VowelOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s=  new Scanner(System.in);
		System.out.println("Enter a chara");
		char ch = s.next().charAt(0);
		if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ||ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' );
		{
		System.out.println(ch+ "is a Vowel");
		}
		else
		{
		System.out.println(ch+ "is not a vowel");
		}
	}
}
