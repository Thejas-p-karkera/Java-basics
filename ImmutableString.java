//Question : Can you prove that a String object in Java is immutable programmatically?

package HolidayAssignments;

//String object is considered immutable because once it’s created, we cannot change its content.
//Here we'll create 2 strings s1 & s2 and check whether their references are equal or not
//if the references are equal, then those 2 strings are mutable (i.e s2 overrides s2)
//if the references are not equal, then those 2 strings are immmutable (i.e two strings are same)

public class ImmutableString
{
	public static void main(String[] args)
	{
		String s1="Java";
		
		String s2="Javac";
		
		if(s1==s2)			//checking if the references are equal.
		{
			System.out.println("References are equal");
			System.out.println("String object is mutable");
		}
		
		else
		{
			System.out.println("References are not equal");
			System.out.println("String object is immutable");
		}
		
	}

}
