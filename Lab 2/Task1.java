import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter a degree in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // 1. Calculate celsius first using the user's input
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
      
        // 2. Print the result so you can see it
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
        
        input.close(); 
}
