package array;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = { 1, 9, 5, 4, 7, 15 };
		int temp;
		for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]<a[j]) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
					 
				 }
			 }
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"|");
			
		}
		System.out.println("\nSecond Largest:"+a[1]);
		System.out.println("Second Min:"+a[a.length-2]);
		
		
	}

}
