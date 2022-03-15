package Inheritance;

public class Execution {

	public static void main(String[] args) {
		//first condition
		aClass x=new aClass();
		x.m1();
		//x.m2(); child class not to return inheritance
		
		//second condition
		bClass y=new bClass();
		y.m1();
		y.m2();
		
		//third condition	
		aClass z=new bClass();//upcasting
		z.m1();
		//z.m2();  child class  not to return inheritance
		
		//bClass c=new aClass(); ddown casting not possible
		
		
		
		}
}
