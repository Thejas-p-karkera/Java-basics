//Question : Write a program to convert Decimal number to Binary number ?

package HolidayAssignments;

import java.util.Scanner;
public class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number which you have to convert into binary : ");
		int decimal=scan.nextInt();
		String remainder=" ";				//Creating an empty string for later use.
		
		if(decimal==0)
		{
			System.out.println("The binary conversion is : "+0);
		}
		
		else 
		{
		while(decimal>0)					//Keep looping until the decimal is greater than 0.
											//i.e, stop the loop when the decimal becomes 0.
		{
			int quotient=decimal%2;			//logic to get the result.
			decimal/=2;
			remainder=remainder+quotient;
		}
				//Creating StringBuffer object and passing the 'remainder' to it; to get the reverse function.
		StringBuffer binary=new StringBuffer(remainder);
		
		System.out.println("The binary conversion is : "+binary.reverse());		//Calling reverse method and displaying it.
		}
		scan.close();
	}
}
