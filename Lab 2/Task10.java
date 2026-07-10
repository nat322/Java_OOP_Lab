import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = scanner.nextDouble();

		System.out.print("Enter annual interest rate: ");
		double annualInterestRate = scanner.nextDouble();

		System.out.print("Enter number of years: ");
		int numberOfYears = scanner.nextInt();

		double monthlyInterestRate = annualInterestRate / 1200;
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

		System.out.printf("Future value = %.2f%n", futureInvestmentValue);
	}
}