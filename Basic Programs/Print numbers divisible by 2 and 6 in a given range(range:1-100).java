//Print numbers divisible by 2 and 6 in a given range(range:1-100) using looping statement
class Divisor1 
{
	public static void main(String[] args) 
	{
		for (int i= 1;i<=100;i++)
		{
			if (i%2==0 && i%6==0)
			{
				System.out.println(i);
			}
		}
		
	}
}
