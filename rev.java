package reverse;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			    int num = 67890, rev = 0;

			    // run loop until num becomes 0
			    while(num != 0) {
			    
			      // get last digit from num
			      int digit = num % 10;
			      rev = rev * 10 + digit;

			      // remove the last digit from num
			      num /= 10;
			    }

			    System.out.println("Reversed Number: " + rev);
			  }
			

	}


