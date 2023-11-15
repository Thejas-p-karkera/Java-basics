//Question : How do you get the sum of all elements in an integer array in Java?

package HolidayAssignments;

import java.util.Scanner;
public class SumOfIntegerArray
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nummber of integers you want to store in an Array : ");
		int num=scan.nextInt();
		int arr1[]=new int[num];		//Creating an array of size 'num'.
		
		System.out.println("Enter "+num+" integers :");
		
		for(int i=0; i<arr1.length; i++)		//for loop to store elements inside  the array.
		{
			arr1[i]=scan.nextInt();
		}
		
		int sum=0;
		for(int i:arr1)				//for-each loop.
		{
			sum+=i;					//Addition of the elements.
		}
		System.out.println("The sum of all the integers present in array is : "+sum);
		
		scan.close();
	}

}
