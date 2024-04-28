package array;

public class SelectSort {

	public static void main(String[] args) {
		int [] a= {10,45,81,7,12,5,16,18};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			int min=i;
			 for(int j=i+1;j<a.length;j++) {
				 
				 if(a[j]<a[min]) {
					temp=a[j];
					a[j]=a[min];
					a[min]=temp;
					 
				 }
			 }
		}
		for(int c=0;c<a.length;c++) {
			System.out.print(a[c]+"|");
		}

	}

}
