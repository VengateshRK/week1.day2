package Week1.day2;
import java.util.Arrays;
public class myDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {14,12,13,11,15,14,18,16,17,19,18,17,18,20};
		Arrays.sort(arr1);
		for (int i=0; i< arr1.length  ; i++) {
			int count = 0;
			
						for (int j= i; j< arr1.length   ; j++) {
				
				if (arr1[i] == arr1[j])
				{
					count++;
					
					}
				
							}
						if (count > 1)
			System.out.println( arr1[i] +" count of value "    +count);
			
		}
		
	}
	

}
