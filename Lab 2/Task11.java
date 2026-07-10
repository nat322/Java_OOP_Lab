import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the FirstNum: ");
		double firstNumber = scanner.nextDouble();

		System.out.print("Enter the SecondNum: ");
		double secondNumber = scanner.nextDouble();

		System.out.print("Enter the operator: ");
		char operator = scanner.next().charAt(0);

		double result;

		switch (operator) {
			case '+':
				result = firstNumber + secondNumber;
				break;
			case '-':
				result = firstNumber - secondNumber;
				break;
			case '*':
				result = firstNumber * secondNumber;
				break;
			case '/':
				result = firstNumber / secondNumber;
				break;
			default:
				System.out.println("Invalid operator");
				return;
		}

		if (result == (long) result) {
			System.out.println("Result = " + (long) result);
		} else {
			System.out.println("Result = " + result);
		}
	}
}