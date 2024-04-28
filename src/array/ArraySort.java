package array;

public class ArraySort {

	public static void main(String[] args) {

		int[] a = { 35, 12, 10, 8, 65, 2 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;

				}

			}
			if (flag == 0) {
				break;
			}
		}
		for (int b = 0; b < a.length; b++) {

			System.out.print(a[b] + ",");
		}
	}

}
