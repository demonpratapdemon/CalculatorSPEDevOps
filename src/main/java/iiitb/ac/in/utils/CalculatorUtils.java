/**
 * 
 */
package iiitb.ac.in.utils;

import iiitb.ac.in.exception.CalculatorDevOpsException;

/**
 * @author PRATAP
 *
 */
public class CalculatorUtils {

	public static Double squareRoot(Double num) throws CalculatorDevOpsException, ArithmeticException {
		// TODO Auto-generated method stub
		try {
			if (num < 0) {
				throw new CalculatorDevOpsException(
						"The entered number is less than 0. Please enter a valid number to perform Square Root");
			}
			Double result = Math.sqrt(num);
			return result;
		} catch (Exception e) {
			throw new CalculatorDevOpsException(e.getMessage());
		}
	}

	public static Double factorial(Double num) throws CalculatorDevOpsException {
		// TODO Auto-generated method stub
		try {
			Double result = 1.0;
			if (num < 0) {
				throw new CalculatorDevOpsException(
						"The entered number is less than 0. Please enter a valid number to perform Factorial");
			}
			while (num > 0)
				result *= num--;
			return result;
		} catch (Exception e) {
			throw new CalculatorDevOpsException(e.getMessage());
		}
	}

	public static Double naturalLog(Double num) throws CalculatorDevOpsException {
		// TODO Auto-generated method stub
		try {
			Double result;
			if (num <= 0) {
				throw new CalculatorDevOpsException(
						"The entered number is less than 0. Please enter a valid number to perform Natural Log");
			}
			result = Math.log(num);
			return result;
		} catch (Exception e) {
			throw new CalculatorDevOpsException(e.getMessage());
		}
	}

	public static Double power(Double num1, Double num2) throws CalculatorDevOpsException {
		// TODO Auto-generated method stub
		try {
			if (num1 == 0 && num2 == 0) {
				throw new CalculatorDevOpsException(
						"The base and power numbers are 0. Please enter valid numbers to perform Power Function");
			}
			Double result;
			result = Math.pow(num1, num2);
			return result;
		} catch (Exception e) {
			throw new CalculatorDevOpsException(e.getMessage());
		}
	}

}
