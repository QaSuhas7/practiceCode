package array;

public class MinNumber {

	public static void main(String[] args) {
		int[] a = {  9, 5, 4, 7, 15 };
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			
			 if(a[i]<min) {
				 min=a[i];
			 }
		}
            System.out.println("Min Number:"+min);
	}

}
