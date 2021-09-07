package Week1.day2;

public class myArmstrongNumber {

	public static void main(String[] args) {
		int num=0,number=153;
		
		int quotient, remainder,armnum=0;
		while (number!= 0) {
		quotient=number/10;
		remainder =number%10;
		armnum=  armnum + (remainder * remainder * remainder);
		System.out.println(" " + armnum);
		number= quotient;
		}
		System.out.println(" " + armnum);
	}

}
