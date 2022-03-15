package exceptions;

public class advanced {


	public static void main(String[] args) {
		
		System.out.println("Start");
		int a=10;
		int b=5;
		int c=0;
		int d[]= {12,52,65,10,35,45};
		
		try
		{
			c=a/b;
			try
			{
				System.out.println(d[7]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("alternative code");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("b is zero");
		    //e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("alternative code");
		}
		catch(Exception e)
		{
			System.out.println("end code");
		}
		System.out.println(c);
	}
}
