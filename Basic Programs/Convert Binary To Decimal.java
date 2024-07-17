//Convert the given number Decimal To Binary using loop
import java.util.Scanner;
public class BinaryToDecimal 
	{
	public static void main(String[] args) 
		{
	      Scanner s = new Scanner(System.in);
		  System.out.println("Enter a number:");
        int N=s.nextInt();
         int placeValue=1;
            int decimal=0;
        while(N!=0)
        {  
            int rem=N%10;
            decimal=decimal+(rem*placeValue);
             N=N/10;
         placeValue=placeValue*2;
        }
        System.out.println(decimal);

	}
}
