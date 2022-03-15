package String;

public class String_char {

	
	public static void main(String[] args) {
		String a=("DACBBCAD");
		
		char [] c= a.toCharArray();
		
		char temp;
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {              
					temp=c[i];               
					c[i]=c[j];               
					c[j]=temp;               
				}       
			}
		}
		System.out.println(c);
	}

}



//public static void main(String[] args) {
//	String a=("velocity prasad");
//	
//	char[] c= a.toCharArray();
//	
//	char temp;
//	
//	for(int i=0;i<c.length;i++) {
//		for(int j=i+1;j<c.length;j++) {
//			if(c[i]>c[j]) { 
//				temp=c[i];  
//				c[i]=c[j]; 
//				c[j]=temp;
//			}       
//		}
//	}
//	System.out.println(c);
//}