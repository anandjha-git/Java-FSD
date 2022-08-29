package mypack2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)

class CalculationTest {

	@Test
	void test() {
		Calculation obj=new Calculation();
		assertEquals(10, obj.addition(5,6));
	}
	@Test 
	void test1() {
		
		Calculation obj = new Calculation();
			
		assertThrows(ArithmeticException.class, obj.addition(5,0));
		
		
	}

}
