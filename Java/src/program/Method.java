package program;

public class Method {
	 int a;
	 int b;
	static void Demo ()
	{
			for(int b=10;b>=1;b--)
			{
				for (int c=(10-1);c>=b;c--)
				{
					System.out.print(" ");
				}
				for (int a=1 ;a<=b;a++)
				{
					System.out.print("* ");
				}
				System.out.println(" ");
			}
	
	}
	static void Test()
	{
		for(int b=0;b<=10;b++)
		{
			for (int c=(10-1);c>=b;c--)
			{
				System.out.print(" ");
			}
			for (int a=1 ;a<=b;a++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
public static void main(String[] args) {
	Demo();
	Test();
	

}
}