package String;

import java.util.Scanner;

public class ReverseofaString {
	public static void main(String[] arg)
	{
//	ReverseofaString rev=new ReverseofaString();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string : ");
	String  str=sc.nextLine();	
//	System.out.println("Reverse of a String  is : "+rev.reverse(str));
//	}
//    String reverse(String str)
//	{
	String rev="";
	for(int j=str.length()-1;j>=0;j--)
	{
	rev=rev+(str.charAt(j)); 
	}
	System.out.println(rev);
//	return rev;
//	}
}
}
