package javapractice;

public class ReverseWordString {

	public static void main(String[] args) {
		String str = "Suhas Ghodake";
		String[] str2 = str.split(" ");
		String rev = "";

		for (int i = 0; i < str2.length; i++) {
			if (i == str2.length - 1) {
				rev = str2[i] + rev;
			} else {
				rev = " " + str2[i] + rev;
			} 

		}
		System.out.println("Reverse Words==" + rev);
	}

}
