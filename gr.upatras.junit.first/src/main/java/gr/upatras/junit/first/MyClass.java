package gr.upatras.junit.first;

public class MyClass {
	
	public String subtraction(int x, int y) {
		int z = x - y;
		if(z>=0) {
			return "POSITIVE";
		}
		else {
			return "NEGATIVE";
		}
	}
	
}