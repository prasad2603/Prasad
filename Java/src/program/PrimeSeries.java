package program;

public class PrimeSeries {

		public static void main(String[] args) {
			
		
			for(int i=0;i<100;i++) {
				int c=1;
			for (int a=2;a<i;a++)
				
			{
				if(i%a==0)//already true
				{
					c=0;
				}
			}
			if(c==1)
			{
				System.out.println(i+"  Prime");
			}
			else
			{
				System.out.println(i+"  Not Prime");
			}
			}
}

}
