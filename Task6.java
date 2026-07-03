public class Task6 {
    private double num1;
    private double num2;

    public Task6(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public double remainder() {
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return num1 % num2;
    }

    public void displayResults() {
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Subtraction (num1 - num2): " + subtract());
        System.out.println("Multiplication (num1 * num2): " + multiply());
        System.out.println("Division (num1 / num2): " + divide());
        System.out.println("Remainder (num1 % num2): " + remainder());
    }

    public static void main(String[] args) {
        Task6 calculator = new Task6(20.0, 4.0);
        calculator.displayResults();
    }
}
