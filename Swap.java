package BasicsOfJava;

public class Swap
{
	public static void main(String[] args)
	{
		int a=5;
		int b=10;
		System.out.println("Before swapping\n a = "+a+"\n b = "+b);
		
	  a = a + b;
   b = a - b;
   a = a - b;
		System.out.println("\nAfter swapping\n a = "+a+"\n b = "+b);
		
	}

}
