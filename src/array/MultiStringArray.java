package array;

public class MultiStringArray {

	public static void main(String[] args) {
		
		String [][] a= {{"Suhas","Vishal","Akshay"},{"Ganesh","Rushi"},{"Pandu","Viraj"}};
		   
		 for(int i =0;i<a.length;i++) {
			 
			  for(int j=0;j<a[i].length;j++) {
				  
				  System.out.print(a[i][j]+" ");
			  }
		    System.out.println();
		    
		 }
		
	}

}
