import static org.junit.Assert.*;

import org.junit.Test;

public class MyFunctionTest {

	@Test
	public void getFactorial() {
		MyFunction myFirstTest = new MyFunction();
		int runTest = myFirstTest.getFactorial(2);
		assertEquals(2, runTest);
	}
	
	@Test
	public void makeFormula () {
		MyFunction myFirstTest = new MyFunction();
		int runTest = myFirstTest.makeFormula(2);
		assertEquals(18, runTest);
	}
}
