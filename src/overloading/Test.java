package overloading;

public class Test {

	void Show(int a) {
		System.out.println("This is first method.");
	}
	void Show() {
		System.out.println("This is second method.");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.Show(10);
		t.Show();

	}

}
