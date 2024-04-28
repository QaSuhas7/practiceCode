package array;

public class AkshaySort {

	public static void main(String[] args) {
		int[] a = { 0, 2, 3, 0, 1, 9, 7, 0, 8, 11, 0 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					c = 1;
				}
			}
			  if(c==0) {
				  break;
			  }
		}
        for(int t=0;t<a.length;t++) {
        	System.out.print(a[t]+" ");
        }
	}
}
