import static org.junit.Assert.*;

import org.junit.Test;

public class MyFunctionTest {

	@Test
	public void getFactorial() {
		MyFunction myFirstTest = new MyFunction();

		int runTest = myFirstTest.getFactorial(4);
		assertEquals(24, runTest);
	}
	
	@Test
	public void makeFormula () {
		MyFunction myFirstTest = new MyFunction();

		int runTest = myFirstTest.makeFormula(4);
		assertEquals(264, runTest);
		
		int runTestTwo = myFirstTest.makeFormula(-4);
		assertEquals(0, runTestTwo);
		
		int runTestThree = myFirstTest.makeFormula(27);
		assertEquals(0, runTestThree);
	}
	
	
}

