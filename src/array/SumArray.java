package array;

public class SumArray {

	public static void main(String[] args) {
	int[]a= {5,8,7,9,6,1,3};
     int sum=0;
     /*for(int i=0;i<a.length;i++) {
    	 sum=sum+a[i];
     }
	*/
     
     // Using for each loop
     for(int value:a) {
    	sum=sum+value; 
     }
     
	System.out.println("Sum of Array:"+sum);
	}

}
