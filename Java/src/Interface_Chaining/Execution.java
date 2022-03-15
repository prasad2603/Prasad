package Interface_Chaining;

public class Execution {

	public static void main(String[] args) {
		Intr_3Hyderabad c=new Hyderabad();
		Intr_2Mumbai b=c.alpha();
		Intr_1Pune a=b.demo();
		a.test();
		
		c.alpha().demo().test();
	}

}
