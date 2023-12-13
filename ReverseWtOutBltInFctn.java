package Strings;

import java.util.Scanner;
public class ReverseWtOutBltInFctn
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=scan.nextLine();
		
		String str1="";
		char ch[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=ch[i];
		}
		
		System.out.println("The string value after reversing : "+str1);
		scan.close();
	}

}
