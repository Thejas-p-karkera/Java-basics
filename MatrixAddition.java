//Question : Write a program to do the matrix addition by reading the elements.

package HolidayAssignments;

import java.util.Scanner;
public class MatrixAddition
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter the number of rows : ");
		int rows=scan.nextInt();
		System.out.print("Enter the number of columns : ");
		int columns=scan.nextInt();
		
		int array1[][]=new int[rows][columns];		//Creating a 2-D array of size 'rows * columns'.
		int array2[][]=new int[rows][columns];
		System.out.println();
		
		for(int i=0; i<rows; i++)					//Inserting elements into array1.
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print("Enter the element for ("+i+","+j+") of matrix 1 :");
				array1[i][j]=scan.nextInt();
			}
		}
		
		System.out.println();					//Inserting elements into array2.
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print("Enter the element for ("+i+","+j+") of matrix 2 :");
				array2[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("\nThe matrix after addition is");
		System.out.println("==============================");
		
		int matrix[][]=new int[rows][columns];			//creating a new array to store the sum.
		
		for(int i=0; i<rows; i++)						//for-loop to do addition.
		{
			for(int j=0; j<columns; j++)
			{
				matrix[i][j] = array1[i][j] + array2[i][j];
			}
		}
		
		for(int i=0; i<rows; i++)				//for-loop to display the sum of the matrix.
		{
			for(int j=0; j<columns; j++)
			{
				if(matrix[i][j]>=10)
				{
					System.out.print(matrix[i][j]+ " ");
				}
				else
				{
					System.out.print("0"+matrix[i][j]+ " ");
				}
			}
			
			System.out.println();
		}
		scan.close();
	}

}
