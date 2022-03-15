package array;

public class ArrayAsc {

	public static void main(String[] args) {
        //15,56,23
		int a[]= {15,78,56,89,23};   
		int tem=0;
	
		
		for(int i=0;i<a.length;i++) {//15,78,56
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) { //i=15 15>78 15>56 15>89 
					tem=a[i];  //78>56
					a[i]=a[j]; 
					a[j]=tem;  //15,78,56,89,23   15,56,78,89,23    56,78,89,26,15
				}       
			}
		}
		System.out.println();
		System.out.println("Ascending order Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}
	}
}
