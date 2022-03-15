package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class collection {

	public static void main(String[] args) {


//		ArrayList i=new ArrayList();
//	     i.add("A");
//	     i.add(10);
//	     i.add("A");
//	     i.add(null);
//	     
//	     System.out.println(i);
//	     i.remove(0);
//	     System.out.println(i);
//	     i.add("A");
//	     i.add(0, "A");//index , character
//	     System.out.println(i);
//	     
//	     
	     ArrayList<String> j=new ArrayList(); //String is a generic value only string is allowed 
	     j.add("A"); // generic -->homogeneous data stored 
//	     j.add(10);
	     j.add("A");
	     j.add(null);
	     
	     
	     j.get(1);
	     
	     
		  System.out.println(j);
	     
		  
		  
	     HashSet k=new HashSet();//not allowing duplicate value
	     k.add("A");
	     k.add(10);
	     k.add("A");
	     k.add(null);
	     
	     System.out.println(k);
	     
	     
	     HashSet<Integer> l=new HashSet<Integer>();
	     l.add(52);
	     l.add(10);
	     l.add(null);
	     l.add(10);
	     l.add(null);
	     l.add(155);
	     l.add(524);
	     l.add(254);
	     l.add(52);
	     System.out.println(l);
	     
	   Iterator<Integer> o= l.iterator();
	   
	   for(int a :l)
	   {
		   System.out.println(o.next());
	   }
	     
	     
	}

}
