package exceptions;

public class Basic {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		int a=10;
		int b=0;
		int c=0;
		int d[]= {12,52,65,10,35,45};
		
		try
		{
			c=a/b;
			System.out.println(d[3]);
	
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("b is zero");
		    //e.printStackTrace();
			try
			{
			System.out.println(d[7]);
			}
			catch(ArrayIndexOutOfBoundsException as)
			{
				System.out.println("alternative code");
			}
			
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
