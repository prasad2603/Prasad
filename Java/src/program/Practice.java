package program;

public class Practice {
 
	public static void main (String[]args) {
	
		for (int a=1;a<=10;a++)
		{
			for(int c=(10-1);c>=a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print("@");
			}
			for(int d=2;d<=a;d++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a=10;a>=1;a--)
		{
			for(int c=(10-1);c>=a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print("%");
			}
			for(int d=2;d<=a;d++)
			{
				System.out.print("&");
			}
			System.out.println();
		}
		
	}
}
