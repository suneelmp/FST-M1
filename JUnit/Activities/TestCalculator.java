package Demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	private Calculator calculator;
	
	@BeforeEach
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMultiply() {
		assertEquals(10, calculator.multiply(2, 5));
	}
	
	@Test
	public void testAdd() {
		assertEquals(20, calculator.add(10, 10));
	}

}
