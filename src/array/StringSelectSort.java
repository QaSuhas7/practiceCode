package array;

public class StringSelectSort {
public static void main(String[] args) {
	String [] a= {"India","Bharat","Hindustan","America","China"};
	String temp="";
	 for(int i=0;i<a.length;i++) {
	          int min= i;
		  for(int j=i+1;j<a.length;j++) {
			  if(a[j].compareTo(a[min])<0) {
				  min=j;
			  }
			 
		  }
		  temp=a[i];
		  a[i]=a[min];
		  a[min]=temp;
		  
		 }
	 
for(int x=0;x<a.length;x++) {
	 System.out.print(a[x]+"|");
}
}
}
