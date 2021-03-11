import static org.junit.Assert.assertEquals;

import org.junit.Test;

import iiitb.ac.in.exception.CalculatorDevOpsException;
import iiitb.ac.in.utils.CalculatorUtils;

/**
 * 
 */

/**
 * @author PRATAP
 *
 */
public class UnitTest {

	@Test
	public void testSquareRoot() throws ArithmeticException, CalculatorDevOpsException {
		Double result = CalculatorUtils.squareRoot(36.0);
		Double expected = 6.0;
		assertEquals(result, expected);
	}

	@Test(expected = CalculatorDevOpsException.class)
	public void testSquareRootException() throws ArithmeticException, CalculatorDevOpsException {
		Double result = CalculatorUtils.squareRoot(-36.0);
		assertEquals(result,  new CalculatorDevOpsException(""));
	}
	
	@Test
	public void testFactorial() throws ArithmeticException, CalculatorDevOpsException {
		Double result = CalculatorUtils.factorial(5.0);
		Double expected = 120.0;
		assertEquals(result, expected);
	}
	
	@Test(expected = CalculatorDevOpsException.class)
	public void testFactorialException() throws ArithmeticException, CalculatorDevOpsException {
		Double result = CalculatorUtils.squareRoot(-5.0);
		assertEquals(result,  new CalculatorDevOpsException(""));
	}
	
	@Test
	public void testNaturalLog() throws ArithmeticException, CalculatorDevOpsException {
		Double result = CalculatorUtils.naturalLog(5.0);
		Double expected = Math.log(5.0);
		assertEquals(result, expected);
	}
	
	@Test(expected = CalculatorDevOpsException.class)
	public void testNaturalLogException() throws ArithmeticException, CalculatorDevOpsException {
		Double result = CalculatorUtils.naturalLog(-5.0);
		assertEquals(result,  new CalculatorDevOpsException(""));
	}
	
	@Test
	public void testPower() throws ArithmeticException, CalculatorDevOpsException {
		Double result = CalculatorUtils.power(3.0, 2.0);
		Double expected = Math.pow(3.0, 2.0);
		assertEquals(result, expected);
	}
	
	@Test(expected = CalculatorDevOpsException.class)
	public void testPowerException() throws ArithmeticException, CalculatorDevOpsException {
		Double result = CalculatorUtils.power(0.0, 0.0);
		assertEquals(result,  new CalculatorDevOpsException(""));
	}
}
