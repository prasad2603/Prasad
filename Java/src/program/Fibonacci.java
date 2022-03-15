package program;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;//0,1,1,2,3,5,
		int b=1;//a,b,
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int d=0;d<10;d++)
		{ //c=0+1,c=1     a=1 b1 c2 b1a c2b
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		
		}
	}
}
