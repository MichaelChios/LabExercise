package gr.upatras.junit.first;

public class MainClass {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		String result = m.subtraction(50, 5);
		System.out.println("The result is " + result);
	}
}
