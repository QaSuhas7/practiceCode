package array;

public class Sort {

	public static void main(String[] args) {
		int[] a = { 10, 45, 17, 5 };
		int temp;
		for (int i=0;i<a.length;i++){
			for (int j = 0; j < a.length - 1 ; j++) {

				if (a[j] > a[j +1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int b=0;b<a.length;b++) {
			System.out.print(a[b] + "|");
		}
	}

}
