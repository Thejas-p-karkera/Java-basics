package Arrays;

import java.util.Arrays;

public class MissingNumbers
{
	public static void main(String[] args)
	{
		int arr[]= {0,2,4,6,7,8,9,3};
		Arrays.sort(arr);				//Sorting the array to read numbers easily.
		
		int maxNum=0;
		for(int i=0; i<arr.length; i++)		//For-loop to get the highest value
		{									//of number present in the sorted array.
			if(maxNum<=arr[i])
			{
				maxNum=arr[i];
			}
		}
//		System.out.println("Maximum number is : "+maxNum);
		
		System.out.println("The missing numbers are : ");
		
		for(int i=0; i<=maxNum; i++)		//For-loop to check for the missing number 
		{
			if(Arrays.binarySearch(arr,i)<0)	//checking if the number i is present in the array arr.
				//The Arrays.binarySearch() method gives the index value.
			{
				System.out.println(i);
			}
		}
		
	}
}
