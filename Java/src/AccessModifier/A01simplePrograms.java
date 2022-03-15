package AccessModifier;

public interface A01simplePrograms {

	 static int a=10;//purpose is to defined requirement level constants
	 int b=10;
	static void m1()
	{
		System.out.println("A01simpleProgram");
	}
	public default void m2()
	{
		System.out.println("default");
	}
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		
	}

}
