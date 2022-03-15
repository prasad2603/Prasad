package String;

import java.util.Scanner;

public class Reverse_Each_Word {

	public static void main(String[] args) {
		String a= ("Prasad working in infosys from two year");
		System.out.println("Original- "+a);
		
		String b[]=a.split(" ");

          //System.out.print("Reverse- ");
		for(int i=0;i<b.length;i++)
		{
			String r=(" ");
			for(int j=b[i].length()-1;j>=0;j--) 
			{
				r=r+b[i].charAt(j);
			}
			System.out.println(r);
		}
		
	}

}
