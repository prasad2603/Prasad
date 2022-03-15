package program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=s.nextInt();
		int temp=number;
		int reverse=0,reminder;
		
		while(temp!=0)
		{
			reminder=temp%10;
			reverse=reverse*10+reminder;
			temp=temp/10;
		}
		if(number==reverse)
		{
			System.out.println(number+" is a Palindrome Number");
		}
		else
		{
			System.out.println(number+" is not a Palindrome Number");
		}

	}

}
