package exceptions;

public class ExecutionSequence {

	public static void main(String[] args) {
		
		System.out.println("Start");
		int a=10;
		int b=0;
		int c=0;
		int d[]= {12,52,65,10,35,45};
		
		
	
		try
		{
			c=a/b;
			System.out.println("try");
			System.out.println(d[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("b is zero");
			System.out.println("catch");
		    //e.printStackTrace();
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println(c);
}
}