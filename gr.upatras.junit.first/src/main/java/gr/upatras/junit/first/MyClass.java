package gr.upatras.junit.first;

public class MyClass {
	
	public String subtraction(int x, int y) {
		int z = x - y;
		System.out.println("This is a small change");
		if(z>=0) {
			return "POSITIVE";
		}
		else {
			return "NEGATIVE";
		}
	}
	
}