package SubClass;

public class SubClass {
	public static  void main(String []args) {
		System.out.println("My name is King");
        SubClass2 sub = new SubClass2();
         sub.load();
	
}
}

class SubClass2 {

	public  void load() {
		System.out.println("My name is suhas");
	 Class<? extends SubClass2> sub1= getClass();
	 sub1.getProtectionDomain();
	}


}