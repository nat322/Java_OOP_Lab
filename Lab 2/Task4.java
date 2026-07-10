import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an Uppercase letter: ");
        char uppercaseLetter = input.next().charAt(0);

        char lowercaseLetter = Character.toLowerCase(uppercaseLetter);

        System.out.println("The lowercase letter is: " + lowercaseLetter);
    }
}