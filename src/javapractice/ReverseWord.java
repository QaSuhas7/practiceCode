package javapractice;

import java.util.*;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		sc.close();
		String[] word = str.split(" ");
		String rev = "";
		for (int i = 0; i < word.length; i++) {
			if (i == word.length - 1) {
				rev = word[i] + rev;

			} else {
				rev = " " + word[i] + rev;
			}

		}
		System.out.print("Reverse String is:" + rev);
	}

}
