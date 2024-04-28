package javapractice;

public class ReverseString {

	public static void main(String[] args) {
		String str="Suhas Ghodake";
		
		/*String[] str1=str.split(" ");
		int len =str1.length;
		for(int i=len-1;i>=0;i--) {
			System.out.print(str1[i]+" ");
			
		}*/
		
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
		
		/*StringBuffer rev= new StringBuffer();
		rev.append(str);
		StringBuffer reverse=rev.reverse();
		System.out.print(reverse);*/
		
		/*StringBuilder strBuild = new StringBuilder();
		strBuild.append(str);
		StringBuilder reverseBuilder=strBuild.reverse();
		System.out.print(reverseBuilder);*/
		
	
	}

}
