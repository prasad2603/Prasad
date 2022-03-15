package program;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
//		Scanner a=new Scanner(System.in);
//		System.out.println("Enter a Number");
//		
//		int m = a.nextInt();
		 int m=5;
		 
		int factorial = 1; // condition 1*2*3*4*5*6*7*8 
	
		for( int n=1;n<=m;n++) // new variable for 1 increament 
		{
			factorial=factorial*n;
		}
		System.out.println(factorial);

	}

}
