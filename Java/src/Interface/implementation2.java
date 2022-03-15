package Interface;

public class implementation2 extends implementation {
	public void m2()
	{
			System.out.println("implementation m2");
	}
	  public void m3() 
	{
		System.out.println("Default");
	}

	public static void main(String[] args) {
		implementation2 x=new implementation2();
		System.out.println(x.b);
		x.m1();
		x.m2();
		//demo();static method can not inherited in interface
		System.out.println(a);//static variables can be inherited
		
		
		//in one class implements and another class is extends because one is class another is interface
	}
}
