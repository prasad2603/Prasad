package Protected2;

import Protected1.new1;

public class new2 extends new1{

	public static void main(String[] args) {
		new1 x=new new1();//package 1 inherited of package 1 with that object reference
//		x.gama();
		new2 y=new new2();
		y.gama();//package 2 inherited of package 1 with object reference of second package
		new1 z=new new2();//up casting
//		z.gama();
	}

}
