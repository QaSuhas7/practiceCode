package finalFirst;

public class Bytedata {

	public static void main(String[] args) {
	String test ="XXXXX1234G21";
	String  str =test.replaceAll("[^0-9]", "");

	System.out.println(str);

	}

}
