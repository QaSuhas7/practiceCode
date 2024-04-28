package array;

public class InsertElement {

	public static void main(String[] args) {
		int[] a = { 1, 5, 7, 9, 7, 2, 3 };
		int pos = 3;
		int element = 4;
		for (int i = a.length - 1; i > pos - 1; i--) {
			a[i] = a[i - 1];

		}
		a[pos - 1] = element;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "|");
		}
	}

}
