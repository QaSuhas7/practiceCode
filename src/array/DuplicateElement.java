package array;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] a = { 10, 51, 78, 25, 11, 36, 78, 10 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.print( a[i]+ "|");
					temp++;
					
				}
			}
		}
		System.out.println("\nDuplicate Element count is:"+temp);
		if (temp == 0) {
			System.out.println("No Duplicate element in array");
		}
	}

}
