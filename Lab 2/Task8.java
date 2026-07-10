import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double tuition = 10000.0;

		for (int year = 1; year <= 10; year++) {
			tuition = tuition * 1.05;
		}

		System.out.printf("Tuition in 10 years = RM%.2f%n", tuition);
	}
}