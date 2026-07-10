import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Do you want to continue? (Yes/No): ");
            answer = scanner.nextLine().trim();
        } while (answer.equalsIgnoreCase("Yes"));

        System.out.println("Program terminated.");
    }
}
