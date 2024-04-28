package array;

public class SearchIntElement {

	public static void main(String[] args) {

		int[] arr = { 1, 9, 5, 4, 7, 15 };
		int item = 8;
		int temp=0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {

				System.out.println("Itam is Found At " + i + " Index.");
				temp++;
			}
		}
                if(temp==0) {
                	System.out.println("Itam is not present");
                }
	}

}
