package This_Super;

public class This {
		
		static int a=50;//static variable- global
	    int b=15;//Non Static variable- global
	    int c=52;
	    
	    static void Demo()//Method Static
	    {
	    	int b=60;
	    	int c=12;
	    	System.out.println(b);
	    	System.out.println(c);
	    }
	    void Test()//Method Non Static
	    {
	    	int b=85;
	    	int c=46;
	    	System.out.println(this.b);
	    	System.out.println(this.c);
	    }
	    
	    public static void main(String[] args) {
		
	    	Demo();
	    	
	    	
	    	
		}
}
