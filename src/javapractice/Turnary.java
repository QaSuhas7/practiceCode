package javapractice;

import java.util.*;

public class Turnary {

	public static void main(String[] args) {
		// Find greater number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		System.out.println("Enter Third Number:");
		int c = sc.nextInt();
		System.out.println("Enter Fourth Number:");
		int e = sc.nextInt();
		// Here we Use ternary operator

		int z=((a>b?a:b)>c?(a>b?a:b):c)>e?((a>b?a:b)>c?(a>b?a:b):c):e;
		System.out.print("Largest Number:" + z);

	}

}
