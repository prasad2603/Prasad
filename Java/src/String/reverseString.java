package String;

import java.util.Scanner;

public class reverseString {
	

	public static void main(String[] args) {
		//reverse string
//			
//		String string ="DASARP";
//		int len=string.length();
//		String reverse= ("");
//		for(int i=(len-1);i>=0;i--)
//		{
//		reverse=reverse+string.charAt(i);
//		}
//		System.out.println(reverse);
//	
//	
			 Scanner sc=new Scanner(System.in);
			  System.out.println("Enter String value: ");
			  String data= sc.nextLine();
			   System.out.println("Reverse String value: ");

			 String rev=("");
			  for(int i=data.length()-1;i>=0;i--)
			    {
			  rev=rev+data.charAt(i);
			    }
			  System.out.println(rev);

		
		
		
		
		
		//reverse string
//		StringBuffer b= new StringBuffer("prasad");
//		b.reverse();
//		System.out.println(b);
//		System.out.println("-----");
//		
//		  
//		//string
//		String s=new String("Standard");
//		String f= s.concat("Class");
//		System.out.println(f);
//		
//		StringBuffer c=new StringBuffer("Standard");
//		c.insert(3, "Class");
//		System.out.println(c);
//		
//		StringBuffer v=new StringBuffer("Standard");
//		c.insert(2, "Class");
//		System.out.println(v);
//		
//		StringBuilder g=new StringBuilder("Standard");
//		g.append("Class");
//		System.out.println(g);
		
	}

}
