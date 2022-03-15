package overloading;

public class Test {
	public void m1(int a)
	{
		System.out.println("int argument");
	}
	public void m1(char a)
	{
		System.out.println("char argument");
	}
	public void m1(float a)
	{
		System.out.println("float argument");
	}
	public  void m1(double a)
	{
		System.out.println("doble argument");
	}
	public void m1(int a,char b)
	{
		System.out.println("int char argument");
	}
	public void m1(char a,int b)
	{
		System.out.println("char int argument");
	}
	public void m1(float a,double b)
	{
		System.out.println("float double argument");
	}
	public void m1(double a,float b)
	{
		System.out.println("doble float argument");
	}

	public void m1(short a,short b)
	{
		System.out.println(" integer argument");
	}
	public void m1(byte a,byte b)
	{
		System.out.println("byte argument");
	}
	
	public void m1(float a,float b)
	{
		System.out.println("float double argument");
	}
	public void m1(double a,double b)
	{
		System.out.println("doble float argument");
	}
	public static void main(String[] args) {
		Test x=new Test();
//		x.m1(10);
//		x.m1('1');
//		x.m1(0.5f);//without f it consider as a double
//		x.m1(10.5d);//without d it consider as a double
//		x.m1('a',10);
//		x.m1(10,'b');
//		x.m1(10.5f,0.15d);
//		x.m1(0.5d,15.02f);
		x.m1(10.0, 5.0);
//		x.m1(0.5f, 0.6f);
	}

}
