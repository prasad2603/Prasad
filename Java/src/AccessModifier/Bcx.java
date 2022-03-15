package AccessModifier;

public class Bcx implements A01simplePrograms {
	 public void m2()
	{
		System.out.println("afsdg");
	}
	public static void main(String[] args) {
		System.out.println(a);
		//Bcx.m1();
		A01simplePrograms x= new Bcx();
		x.m2();
		Bcx  y= new Bcx();
		y.m2();
	}
}
