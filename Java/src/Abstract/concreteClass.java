package Abstract;

public class concreteClass extends childAbs {


	void test() 
	{
	System.out.println("tp4");
	}

	public static void main(String[] args) {
		childAbs x=new concreteClass();
		x.gama();
		x.test(); 
		System.out.println(x.a);
		demo();
		abClass y=new concreteClass();
		System.out.println(y.a);
	}

}
