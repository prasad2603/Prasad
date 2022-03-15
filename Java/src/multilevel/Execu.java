package multilevel;

public class Execu implements InterA,InterB{
	public void m1()
	{
		System.out.println("Parent");
	}
	
	public static void main(String[] args) {
		Execu x=new Execu();
		x.m1();
	}

}
