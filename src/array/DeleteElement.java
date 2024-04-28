package array;

public class DeleteElement {

	public static void main(String[] args) {
		int[] a= {10,45,20,30,78,46};

		int del=10;
		for(int i=0;i<a.length;i++) {

			if(a[i]==del) {
				for(int j=i;j<a.length-1;j++) {
                     a[i]=a[j+1];
                     
				}
			      break;
			}
		}
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+"|");
		}
	}

}
