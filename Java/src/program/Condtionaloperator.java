package program;

public class Condtionaloperator {

	 public static void main(String[] args) 
	 {
		 int a =20;
		 int b =207;
		 int c =25;
		 int d =36;

		 if(a>b)
		 {
			 if(a>c)
			 {
				 if(a>d)
				 {
					 System.out.println(a);
				 }
				 else
				 {
					 System.out.println(d);
				 }
				
			 }
		 }
		 else
		 {
			 if(b>c)
			 {
				 if(b>d)
				 {
					 System.out.println(b);
				 }
				 else
				 {
					 System.out.println(d);
				 }
			 }
			 else
			 {
				 if(c>d)
				 {
					 System.out.println(c);
				 }
				 else
				 {
					 System.out.println(d);
				 }
			 }
		 }
	}
}
