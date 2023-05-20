package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyClassTest {

	@Test
	void testSubtraction() {
		MyClass tester = new MyClass();
		assertEquals("POSITIVE", tester.subtraction(50, 5), "50 - 5 must be POSITIVE");
	}

}