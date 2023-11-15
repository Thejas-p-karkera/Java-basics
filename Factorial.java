//Question : How can you find the factorial of an integer in Java?

package HolidayAssignments;

import java.util.Scanner;

class Fact
{
	int n;
	int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1); 		//The method fact(n-1) is calling the fact(int n) method itself
		}								//recursion
	}
}

public class Factorial
{
	public static void main(String[] args)
	{
		Fact f=new Fact();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to get the factorial: ");
		int n=scan.nextInt();
//		int factorial=f.fact(n);
		System.out.println("The factorial of "+n+" is: "+f.fact(n));
		
		scan.close();
	}

}
