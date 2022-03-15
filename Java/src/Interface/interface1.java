package Interface;

public interface interface1 {
	 static int a=10;//purpose is to defined requirement level constants
	 int b=10;
	void m1();//public,abstract
	void m2();
	 static void demo()
	{
		System.out.println("static");
	}
	default void m3() {//we can declared body with adefault keyword
		System.out.println("Default");
	}

	public static void main(String[] args) {
		//interface1 x=new interface1();can not create object for interface
		//x.m1();
		demo();
		System.out.println(a);
	}

}
