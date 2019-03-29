package travis_ci_tutorial_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorSubtractTest {

	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2);
	}
}
