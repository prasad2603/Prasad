package program;

import java.util.Scanner;

public class Lcm_Hcf_2 {

	public static void main(String[] args) {
		int x, y, num1, num2, temp, hcf, lcm;
	      Scanner scanner = new Scanner(System.in);
          //https://www.youtube.com/watch?v=Q-jmbUbNHOM
	      System.out.print("Enter First Number: ");
	      num1 = scanner.nextInt();
	      System.out.print("Enter Second Number: ");
	      num2 = scanner.nextInt();
	      scanner.close();

	      x = num1;
	      y = num2;

	      while(x != 0){       
	         temp = x;        
	         x = y%x;
	         y = temp;
	      }

	      hcf = y;
	      lcm = (num1*num2)/hcf;

	      System.out.println("HCF of input numbers: "+hcf);
	      System.out.println("LCM of input numbers: "+lcm);

	}

}
