package Armstrong_Number;

public class forLoop3Digit {

	public static void main(String[] args) {
		int num = 9474, realNumber, remainder, output = 0, a = 0;
	      realNumber = num;
	      for(;realNumber != 0; realNumber /= 10, ++a);
	      realNumber = num;
	      for(;realNumber != 0; realNumber /= 10)
	      {
	         remainder = realNumber % 10;
	         output += Math.pow(remainder, a);
	      }
	      if(output == num)
	      {
	         System.out.println(num + " is an Armstrong number.");
	      }
	      else
	      {
	         System.out.println(num + " is not an Armstrong number.");
	      }
	}

}
