package program;

public class MirrorOfSimple1 {

	public static void main(String[] args) {
	for(int b=1;b<=10;b++)
	{
		for (int c=(10-1);c>=b;c--)
		{
			System.out.print(" ");
		}
		for (int a=1 ;a<=b;a++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}

	}

}
