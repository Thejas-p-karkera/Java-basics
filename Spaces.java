//Question : How do you remove leading and trailing spaces from a string in Java?

package HolidayAssignments;

public class Spaces
{
	public static void main(String[] args)
	{
		String str="       Hello World!       ";
				System.out.println("The original string : "+"'"+str+"'");
				//We can use trim() method to remove leading and trailing spaces from a string.
				
				//The trim() method is a built-in method in the Java String class
				//that removes all leading and trailing whitespace from a string.
				
		String trimmedstr=str.trim();
				System.out.println("String after removing leading and trailing spaces : "+"'"+trimmedstr+"'");
	}

}
