package Class_Chaining;

public class Execution {

	public static void main(String[] args) {
		Hyderabad h=new Hyderabad();
		Mumbai m= h.alpha();
		Pune p=m.demo();
		p.test();
		
		h.alpha().demo().test();
		

	}
}
