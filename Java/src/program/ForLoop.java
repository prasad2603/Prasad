package program;

public class ForLoop {

	public static void main(String[] args) {
	
		for (int a=1;a<10;a++)
		{
			for (int b=1;b<a;b++)
			{
			System.out.print(a);
			}
			System.out.println("");
		}
		for (int a=1;a<10;a++)
		{
			for (int b=10;b>a;b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}