package array;

public class MultiDArray {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 10, 9 }, { 15, 20, 14, 55 } };

		// here we print this array

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

	}

}
