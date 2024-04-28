package interfaec;

public class RevString{
	
	public static void main(String [] args) {
	String str= "Rushikesh Shinde";
		StringBuilder sbi = new StringBuilder();
		sbi.append(str);
		StringBuilder  rev = sbi.reverse();
		System.out.println(rev);
		
	}
	
	
}

