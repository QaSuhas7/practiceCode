package array;

import java.util.Arrays;

public class EqualsArray {

	public static void main(String[] args) {
		int[] a1= {1,2,3,5,6};
		int[] a2= {1,2,3,4,5,6};
		// Aproch1
		/*boolean status=true;
		
		if(a1.length==a2.length) {
			
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					status=false;
				}
			}
			
		}
		else {
			status=false;
		}
		if(status==true) {
			System.out.println("Arrays are same.");
		}
		else {
			System.out.println("Array are not same.");
		}*/
		// Approch2
		boolean status=true;
		boolean status2=Arrays.equals(a1, a2);
		if (status==status2) {
			System.out.println("Arrays are same");
		}
		else {
			System.out.println("Arrays are not same");
			
		}
	}

}

