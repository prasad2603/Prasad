package String;

public class to {

	public static void main(String[] args) {
		String s1= new String("you can't change me");
		String s2= new String("you can't change me");
		System.out.println(s1==s2);
		
		String s3= "you can't change me";
		System.out.println(s1==s3);
		
		String s4= "you can't change me";
		System.out.println(s3==s4);
	
		String s5= "you can't" + "change me";
		System.out.println(s4==s5);
		
		String s6= "you can't";
		String s7= "change me";
		System.out.println(s4==s7);
		
		final String s8= "you can't";
		String s9= s8+"change me";
		System.out.println(s4==s9);
		
		String s=new String("Prasad");
		String  m=s.concat("Raut");
		System.out.println(m);
		
		StringBuffer t=new StringBuffer("Prasad");
		t.append("Raut");
		System.out.println(t);
		
		StringBuilder r=new StringBuilder("Prasad");
		r.append("Raut");
		System.out.println(r);

	}
}
