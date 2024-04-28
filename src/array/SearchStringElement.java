package array;

public class SearchStringElement {

	public static void main(String[] args) {
		String[] arr= {"Suhas","Akshay","Ganesh","Vishal"};
		String a="Ruhas";
	   int temp=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].equalsIgnoreCase(a)) {
				System.out.println("Name is found at:"+i+" Index.");
			 temp++;
			}
		}
        if (temp==0) {
        	System.out.println("Element is not present.");
        }
	}

}
