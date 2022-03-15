package overriding;

public class ChildClass extends ParentClass {
	public void P()
	{
		System.out.println("Marry");
	}

	public static void main(String[] args) {
		ChildClass x=new ChildClass();
		x.P();
		
		
		ParentClass y=new ParentClass();
		y.P();
		
		
		ParentClass z=new ChildClass();
		z.P();
	
	}

}
