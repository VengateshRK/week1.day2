package Week1.day2;

public abstract class myPalindrome {

	public static void main(String[] args) {
		
		int number = 454,quotient, remainder, sum=0;
		int temp ;
		temp = number;
		
		while (temp != 0) {
			quotient= temp/10;
			remainder= temp%10;
			sum = (sum*10) +  remainder;
			System.out.println(" " + sum);
			temp = quotient;
			
		}
		if (number == sum)
					System.out.println( sum + " is palindrome number");
		else 
			System.out.println(sum + " is not palindrome");

	}

}
