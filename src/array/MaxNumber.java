package array;

public class MaxNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 9, 5, 4, 7, 15 };
        int max=arr[0];
		 for (int i=0;i<arr.length;i++) {
			   if(arr[i]>max) {
				   max=arr[i];
			   }
			    
		 }
		 System.out.println("Max Number:"+max);
	}

}
