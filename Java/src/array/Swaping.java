package array;

public class Swaping {

	public static void main(String[] args) {
		int a[]= {15,45,85,65,32};
		int b[]= {62,58,74,23,15};
		int c[]=new int[5];

		
		for (int i=0;i<5;i++)
		{
	        c[i]=a[i];
			a[i]=b[i];
			b[i]=c[i];
		
		System.out.println(a[i]);
		}
		System.out.println("------");
		for (int i=0;i<5;i++)
		{
		System.out.println(b[i]);
		}

	}

}
