package array;

class ArrayDemo{
	public static void main(String []args) {
		
		int []a = {1,2,3,4,5,6};
		
		// count the element in array 
		int b=a.length;
		System.out.println("Array have:"+b+" Elements.");
	    /*for(int i=0;i<=a.length;i++) {
	    	
	    	System.out.println(a[i]);
	    }*/

	   for(int i : a) {
		   System.out.println(i);
	   }
	}
	
	
}
