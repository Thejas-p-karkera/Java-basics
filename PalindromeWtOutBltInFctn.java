package Strings;

import java.util.Scanner;
public class PalindromeWtOutBltInFctn
{
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System . out. print ("Enter the string :");
	    String name=scan.nextLine();
	    
	    String newName="";
	    char ch[]=new char[name.length()];		//Creating character array
	    										//to store the name
	    
	    for(int i=0;i<name.length();i++)	//Storing name in character array
	    {
	    	ch[i]=name.charAt(i);
	    }
	    
	    for(int i=name.length()-1;i>=0;i--)	//Reversing the name
	    {
	    	newName +=ch[i];
	    }
	    System .out.println("Reversed String is : "+newName+"\n" ) ; 
	    
	    
	    if(name.equalsIgnoreCase(newName ))		//comparinggiven name & reversed name
	    {
	        System . out. println ("===========================\nIt is a palindrome");
	    }
	    else
	    {
	        System . out. println ("===========================\nIt is not a palindrome");
	    }
	}
}

