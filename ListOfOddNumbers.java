//Question : How do you check if a list of integers contains only odd numbers in Java?

package HolidayAssignments;

import java.util.*;

public class ListOfOddNumbers
{
	public static void main(String[] args)
	{
		List<Integer> al=new ArrayList<Integer>();			//Creating an ArrayList object
		Scanner scan=new Scanner(System.in);				//Creating a Scanner object
		System.out.print("Enter the numbers of integers you want to store inside a List:");
		
			int n=scan.nextInt();
			System.out.println("Enter "+n+" integers :");
			
			for(int n1=0; n1<n; n1++)				//for loop to add the numbers to the arraylist
			{
				int n2=scan.nextInt();
				al.add(n2);
			}
				
				if(isAllOdd(al))			//Calling isAllOdd() method
				{
					System.out.println("The list contains only odd numbers");
				}
				else
				{
					System.out.println("The list contains even numbers too");
				}
				
				scan.close();
	}
	
	public static boolean isAllOdd(List<Integer> al1)	//a method to check if the numbers are odd
	{
		for(int n3:al1)				//for-each loop
		{
			if(n3%2==0)
			{
				return false;
			}
		}
		return true;
	}
}
