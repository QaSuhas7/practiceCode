package finalFirst;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Suhas Ghodake";

		String rev = "";
		/*for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}*/
		/*StringBuilder sbi= new StringBuilder();
		sbi.append(str);
		StringBuilder rev = sbi.reverse();*/
		
		char [] a = str.toCharArray();
		int len = a.length;
		
		for(int i =len-1;i>=0;i--) {
			rev= rev+a[i];
		}
		
		System.out.println(rev);
	}

}
