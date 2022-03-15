package overhiding;

import overriding.ChildClass;
import overriding.ParentClass;

public class Child extends Parent{
	public static void P()
	{
		System.out.println("Marry");
	}

	public static void main(String[] args) {
		//this is not a standard way to call method
		Child x=new Child();
		x.P();
		
		
		Parent y=new Parent();
		y.P();
		
		
		Parent z=new Child();
		z.P();
		
		//this is the a standard way to call method
		P();
		
	}

}
