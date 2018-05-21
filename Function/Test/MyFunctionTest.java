import static org.junit.Assert.*;

import org.junit.Test;

public class MyFunctionTest {

	@Test
	public void getFactorial() {
		MyFunction myFirstTest = new MyFunction();
		int runTest = myFirstTest.getFactorial(5);
		assertEquals(120, runTest);
	}
	
	@Test
	public void makeFormula () {
		MyFunction myFirstTest = new MyFunction();
		int runTest = myFirstTest.makeFormula(4);
		assertEquals(264, runTest);
	}
}
