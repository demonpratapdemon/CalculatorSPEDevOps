/**
 * 
 */
package iiitb.ac.in.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import iiitb.ac.in.exception.CalculatorDevOpsException;
import iiitb.ac.in.utils.CalculatorUtils;

/**
 * @author PRATAP
 *
 */
public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);

	/**
	 * @param args
	 * @throws CalculatorDevOpsException
	 */
	public static void main(String[] args) throws CalculatorDevOpsException {
		// TODO Auto-generated method stub
//		logger.info("Welcome to Calculator DevOps SPE Mini Project");
		System.out.println("****************************************************");
		System.out.println("Calculator");
		System.out.println("****************************************************");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				System.out.println("1. Press 1 to perform Square Root");
				System.out.println("2. Press 2 to perform Factorial");
				System.out.println("3. Press 3 to perform Natural Log base e");
				System.out.println("4. Press 4 to perform Power function");
				System.out.println("5. Press 5 to Exit");
				int choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1: {
					System.out.println("Enter the number for doing Square Root : ");
					Double num = Double.parseDouble(br.readLine());
					logger.info("Number entered for performing Square root :: [{}]", num);
					Double ans = CalculatorUtils.squareRoot(num);
					System.out.println("The Square Root of " + num + " is : " + ans);
					logger.info("Result of Square root is :: [{}]", ans);
					break;
				}
				case 2: {
					System.out.println("Enter the number for performing Factorial : ");
					Double num = Double.parseDouble(br.readLine());
					logger.info("Number entered for performing Factorial :: [{}]", num);
					Double ans = CalculatorUtils.factorial(num);
					System.out.println("The Factorial of " + num + " is : " + ans);
					logger.info("Result of Factorial is :: [{}]", ans);
					break;
				}
				case 3: {
					System.out.println("Enter the number for performing Natural log base e : ");
					Double num = Double.parseDouble(br.readLine());
					logger.info("Number entered for performing Natural log base e :: [{}]", num);
					Double ans = CalculatorUtils.naturalLog(num);
					System.out.println("The Natural Log of " + num + " is : " + ans);
					logger.info("Result of Natural Log is :: [{}]", ans);
					break;
				}
				case 4: {
					System.out.println("Enter the 2 numbers space separated for performing Power function : ");
					String[] arr = br.readLine().split("\\s+");
					Double num1 = Double.parseDouble(arr[0]);
					Double num2 = Double.parseDouble(arr[1]);
					logger.info("Numbers entered for performing Power Function :: [{}], [{}]", num1, num2);
					Double ans = CalculatorUtils.power(num1, num2);
					System.out.println("The Power of " + num1 + " to the power " + num2 + " is : " + ans);
					logger.info("Result of performing Power Function :: [{}]", ans);
					break;
				}
				case 5: {
//					logger.info("Exiting the Calculator Application");
					System.exit(0);
				}
				default: {
//					logger.info("Exiting the Calculator Application");
					System.exit(0);
				}
				}
			} catch (Exception e) {
				logger.error("Error occurred :: [{}]", e.getMessage());
			}
		}
	}

}
