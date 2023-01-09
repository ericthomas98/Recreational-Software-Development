import java.text.NumberFormat;
import java.util.Scanner;

/* Date: 01/03/2023
 * Author: Eric Thomas
 * Purpose:This program will get the principal, annual interest rate, loan term, and then calculate the mortgage.
 * */
public class Main {

	public static void main(String[] args) {	

		//Prompt the user for a principal amount (Has input validation)
		int principalAmount = (int) readNumber("Enter principal: ", 1000, 1_000_000);

		//Prompt the user for annual interest rate (Has input validation)
		float annualInterestRate = (float) readNumber("Enter annual interest rate: ", 1, 30);
		
		//Prompt for loan term (in years) (Has input validation)
		byte years = (byte) readNumber("Enter loan term (in years): ", 1, 30);

		//Call mortgagePayment method and pass user input
		double mortgagePayment = calculateMortgage(principalAmount, annualInterestRate, years);

		//Format and output the monthly mortgage payment
		NumberFormat.getCurrencyInstance().format(mortgagePayment);
		
		System.out.println("MORTGAGE\n"
				+ "--------");
		System.out.println("Monthly Payments: " + mortgagePayment);
		
		int remainingBalance = principalAmount;
		
		System.out.println("PAYMENT SCHEDULE\n"
				+ "----------------");
		
		
		while (remainingBalance >= 0) {
			remainingBalance = (int) (principalAmount - mortgagePayment);
			System.out.println("Monthly Payments: $" + remainingBalance);
		}
	}

	//Read in numbers for input validation
	public static double readNumber(String prompt, double min, double max) {
		
		//Scanner Object
		Scanner scanner = new Scanner(System.in);
		//Declare Variables
		double value;
		System.out.print(prompt);
		while(true) {
			value = scanner.nextFloat();
			if (value >= min && value <= max)
				break;
			System.out.println("Enter a value between " + min  + " and " + max);
		}
		return value;
		
	}
	//Perform Calculations based on monthly mortgage formula
	public static double calculateMortgage(int principalAmount, float annualInterestRate, byte years) {

		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;

		float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
		short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
		double mortgagePayment = principalAmount 
				* (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
						/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

		return mortgagePayment;
	}

}
