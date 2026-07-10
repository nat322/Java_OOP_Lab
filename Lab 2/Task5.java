import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII value (0-127): ");
        int asciiValue = scanner.nextInt();

        if (asciiValue < 0 || asciiValue > 127) {
            System.out.println("Invalid ASCII value. Please enter a value between 0 and 127.");
        } else {
            char character = (char) asciiValue;
            System.out.println("The character for ASCII value " + asciiValue + " is: " + character);
        }

        scanner.close();
    }
}