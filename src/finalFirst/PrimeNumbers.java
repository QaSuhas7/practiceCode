package finalFirst;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first Number:");
			int first=sc.nextInt();
			System.out.println("Enter last Number:");
			int last=sc.nextInt();
			int count=0;
			for(int i=first;i<last;i++) {
				
				   for(int j=2;j<=i-1;j++) {
					   if(i%j==0) {
						   count++;
					   }
					   
				   }
				   if(count==0) {
					   System.out.println(i);
				   }
				   else {
					   count=0;
				   }
			}
		}
		
		
		
		
		
	}

}
