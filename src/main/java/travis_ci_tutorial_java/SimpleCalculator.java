package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public double divideByZero(double a, double b) {
		if (b == 0) {
			throw new java.lang.ArithmeticException("Cannot divide by zero!");
		}
		return a / b;	
	}
}
