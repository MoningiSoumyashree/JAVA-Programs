//Print numbers divisible by 3 and 7 in a given range(range:1-100) using looping statement
class Divisor2
{
	public static void main(String[] args) 
	{
		for (int i= 1;i<=100;i++)
		{
			if (i%3==0 && i%7==0)
			{
				System.out.println(i);
			}
		}
		
	}
}
