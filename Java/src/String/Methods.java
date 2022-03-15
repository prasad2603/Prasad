package String;

public class Methods {

	public static void main(String[] args) {
		String a="Velocity";
		String b="Velocity";
		
		String c= new String("  CLASS CLASS pune pune katraj   ");
		String d= new String("Velocity");
		
		boolean m=a.equals(a);//comparing condition a=c or not... result always boolean
		System.out.println(m);
		System.out.println(a.equalsIgnoreCase(c));//case sensisity check
		System.out.println(c.toUpperCase());//uppercase conversion
		System.out.println(c.toLowerCase());
		System.out.println(d.concat(" "+c));//for addition of string
		System.out.println(d);
		System.out.println(d+" " +c);//without concate method
		System.out.println(c.substring(2));//without end string
		System.out.println(c.substring(2, 7));//to range printing- start and end
		System.out.println(a.length());
		System.out.println("------");
		System.out.println(c.charAt(1));//for checking char at index 
		System.out.println(c.indexOf('S'));//check int index
		System.out.println(c.indexOf("pune"));//checking string data index
		System.out.println(c.lastIndexOf('e'));//check word last character
		System.out.println(c.lastIndexOf("pune"));//last word string checking
		
		System.out.println("-------");
		
		System.out.println(a.replace('c', 'C'));//char small c with chap"C"
		System.out.println(c.replace("prasad", "pune"));//char chap"CLASs"
	
		System.out.println("---");
		System.out.println(c);
		System.out.println(c.trim());//space elimination of start and end
		
		
		System.out.println("---");
		
		String [] x = c.split(" ");//to break line with space or any word
		for(int i=0;i<x.length;i++) 
		{
			System.out.println(x[i]);
		}
	
	}
}
