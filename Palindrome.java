//Question : How do you check whether a string (can be number also)  is a palindrome in Java?

package HolidayAssignments;

import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();					//Storing the user-input string inside a String object.
		
		StringBuffer s1=new StringBuffer(s);		//Creating a StringBuffer object and passing String object.
		
		String s2=new String(s1.reverse());			//calling reverse function in StringBuffer object and passing it
													//to another String object.
		
		if(s.equals(s2))							//Checking wheather both strings are equal.
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		scan.close();
	}
}