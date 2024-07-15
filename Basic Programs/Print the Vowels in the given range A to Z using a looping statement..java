//Print the Vowels in the given range A to Z using a looping statement.
import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char chi = s.next().charAt(0);
		for (char ch='a';ch<='z';ch++)
		{
			if (chi=='A'||chi=='E'||chi=='I'||chi=='O'||chi=='U'||chi=='a'||chi=='e'||chi=='i'||chi=='o'||chi=='u')
			{
			System.out.println(chi+ "is a vowel");
			break;
			}
		else
			{
			System.out.println(chi+ "is not a vowel");
			break;
			}
		}
	}
}
