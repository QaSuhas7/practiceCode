package array;

public class EvenOddArray {

	public static void main(String[] args) {
		int[] a= {10,45,20,30,78,46};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0){
				System.out.println("Even Elements:"+a[i]+"|");
				
			}
			if(a[i]%2!=0) {
				System.out.println("Odd elements:"+a[i]+"|");
				
			}
		}

	}

}
