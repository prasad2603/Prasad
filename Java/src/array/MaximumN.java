package array;

public class MaximumN {

	public static void main(String[] args) {
		int a[]= {12,45,85,22,78,55,41};
		
		int max =a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
