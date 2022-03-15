package program;

public class MirrorOf1Reverse {

	public static void main(String[] args) {
		for(int b=10;b>=1;b--)
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
