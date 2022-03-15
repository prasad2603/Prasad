package String;

public class Count_String {

	public static void main(String[] args) {
		
		//To find character count of each string
		
		String a= ("Prasad working in infosys from two year");
		
		System.out.println("Original- "+a);
		
		
		String b[]=a.split(" ");
		
		for(int i=0;i<b.length;i++)
		{
			int r=0;
			{
				r=b[i].length();
			}
			System.out.println(r+" "+b[i]);
		}

	}

}
