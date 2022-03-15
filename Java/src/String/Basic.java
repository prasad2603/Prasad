package String;

public class Basic {

	public static void main(String[] args) {
		String a="Velocity";
		String b="Velocity";
		
		String c= new String("Velocity");
		String d= new String("Velocity");
		
		String x="velocity";//lower case 'v'
		
		
		// comparing address of string 
		System.out.println(a==b);//a=b="Velocity" no new keyword
		//having same address only single time"Velocity" name store in A&b("Velocity")
		
		System.out.println("--------");
		
		System.out.println(c==d);// c="Velocity",d="Velocity"
		//having different address due to new keyword two time"Velocity" name store in c&d
	
		System.out.println("--------");
		
		//lower case
		System.out.println(a==x);//a="V",x="v"
		//strore different becase change in data strore,seperately 
		
		System.out.println("--------");
	
		//data store differently
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(b==c);
		System.out.println(b==d);
		
		System.out.println("--------"); 

		//if change value of b
		b="Class";//store seperately 
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);//a="Velocity",b="Class"
		
		System.out.println("--------");
		b="Velocity";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);//a="Velocity",b="Velocity"
		
	}

}
