package array;

public class Duplicate {

	public static void main(String[] args) {
		String a[]= {"prasSd","Raut","Meera","pRasad","Prasad","MeEra"};
		boolean b=false;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate String From String= " +a[i]);
					b=true;
				}
			}
		}
		if(b==false)
		{
				System.out.println("Duplicate String not found");
		}
	}

}
