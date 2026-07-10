import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int sum = 0;

        while (temp !=0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The sum of the digits in " + number + " is: " + sum);
    }
}