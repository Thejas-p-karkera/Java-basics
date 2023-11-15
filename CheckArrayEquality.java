//Question : Write Java program that checks if two arrays contain the same elements.

package HolidayAssignments;

import java.util.Arrays;

public class CheckArrayEquality
{
	public static void main(String[] args)
	{
		int arr1[]= {1,2,3,4,5};				//Two arrays declared
		int arr2[]= {5,4,3,2,1};				//under main method.
		
		if(areEqual(arr1, arr2))			//calling areEqual() method.
		{
			System.out.println("The two arrays contains same elememnts");
		}
		else
		{
			System.out.println("The two arrays deos not contains same elememnts");
		}
	}
	
	public static boolean areEqual(int arr1[],int arr2[])
	{
		Arrays.sort(arr1);						//sorting the arrays.
		Arrays.sort(arr2);
		
		if(arr1.length!=arr2.length)			//checking if two arrays doesn't have the same length.
		{
			return false;
		}
		
		for(int i=0; i<arr1.length; i++)		//checking if the arrays doesn't have same elements.
		{
			if(arr1[i]!=arr2[i])
			{
				return false;
			}
		}
		return true;
	}

}
