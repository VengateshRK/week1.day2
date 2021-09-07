package Week1.day2;

import java.util.Arrays;

public class myMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		 for (int i=1; i< arr.length ; i++) {
			 if (i != arr[i -1]) {
				 System.out.println("Missed Number in the array is " + i );
				 break;
				 
			 }
		 }
		
		

	}

}
