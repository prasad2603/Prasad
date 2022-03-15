package program;


public class Important {
	static int a=50;//static variable- global
    int b=15;//Non Static variable- global
    int c=52;
    
    static void Demo()//Method Static
    {
    	int d=60;
    	int f=12;
    	System.out.println(d);
    	System.out.println(f);
    }
    void Test()//Method Non Static
    {
    	int n=15;
    	System.out.println(n);
    }
    /*constructor - constructor name must be
     * same as class name then call it as a 
     * construct 
     * if the name is not same as class name 
     * then we call it as a method*/
    
    Important()   //user defined Constructor
    {    	
    	a=15;
    	b=52;
    	c=64;
    }
    Important(int x)//User defined Constructor with integer argument
    {
    	a=61;
    	b=52;
    	c=25;
    }
    Important(char x)//User defined Constructor with char argument
    {
    	a=75;
    	b=20;
    	c=20;
    }
    Important(int x,char y)//Constructor-integer and char argument
    {
        a=52;
    	b=47;
    }
	public static void main(String[] args) {
	
		//step to call static variable
		System.out.println(Important.a);
		System.out.println(a);
		
		/*step to call Non static variable 
		 * create a object with class name 
		 * for calling global variable */
		Important x =new Important();
		System.out.println(x.b);
		
		/*step to call Static Method */
		Demo();
		
		/*step to call non Static Method
		 * * create a object with class name 
		 * for calling Non Static method */ 
		Important y=new Important();
		y.Test();
		
		/*step to call constructor*/
		
		//with default contructor
		Important p= new Important();
		System.out.println(p.c);
		
		//with user defined contructor
		//with integer argument
		Important m= new Important(125);
		System.out.println(m.b);
		
		//with user defined contructor
		//with char argument
		Important g= new Important('a');
		System.out.println(g.c);
		
		//with user defined contructor
		//with int char argument
		Important h= new Important(125,'a');
		System.out.println(h.b);
}
}
