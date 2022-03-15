package program;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int d=11;
		boolean b=false;
		for (int a=2;a<d;a++)
			
		{
			if(d%a==0)//already true
			{	
				b=true;
			}
		}
		if(b==false)
		{
			System.out.println(d+" is Prime");
		}
		else
		{
			System.out.println(d+" is Not Prime");
		}
		
	}
}
