package Week1.day2;

import java.util.Arrays;

public class myFrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {3,4,2,5,1,2,6,3,6,2,4,7,1};
		Arrays.sort(arr1);
		for (int i=0; i< arr1.length  ; i++) {
			int count = 0;
			
						for (int j=1; j< arr1.length    ; j++) {
				
				if (arr1[i] == arr1[j])
				{
					count++;
					continue;
					
						}
				
							}
						if (count > 0)
			System.out.println( arr1[i] +" count of value "    +count);
			
		}
		

	}

}
