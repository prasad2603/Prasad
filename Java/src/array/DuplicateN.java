package array;

public class DuplicateN {

	public static void main(String[] args) {
		int a[]= {12,45,85,22,78,55,41};

		boolean b=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Number From String= " +a[i]);
					b=true;
				}
			}
		}
		if(b==false)
		{
				System.out.println("Duplicate Number not found");
		}

		
	}

}
