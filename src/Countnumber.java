
public class Countnumber {

	public static void main(String[] args) {
		String str = "King always King";
		String [] b = str.split(" ");
		
		int sum=0;
	
	   for(int i = 0;i<b.length;i++) {
		     sum=sum+b[i].length();
		   
		   
	   }
	
	System.out.println(sum);
	
	}  

}
