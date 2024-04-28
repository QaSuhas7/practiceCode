package javapractice;
import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number:");
			int first= sc.nextInt();
			System.out.println("Enter last number:");
			int last = sc.nextInt();
			
			int sum=0;
			 for(int i = first;i<=last;i++) {
				 sum=sum+i;
				 
			 }
			
			    System.out.println("Sum of all numbers:"+sum);
		}
		
	}

}
