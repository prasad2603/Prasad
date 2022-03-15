package array;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int m[]= {15,45,20,36,45,41};

		for(int i=0;i<m.length;i++) {
			int c=1;
		for (int a=2;a<m[i];a++)
			
		{
			if(m[i]%a==0)//already true
			{
				c=0;
			}
		}
		if(c==1)
		{
			System.out.println(m[i]+"  Prime");
		}
		else
		{
			System.out.println(m[i]+"  Not Prime");
		}
		}
	}

}
