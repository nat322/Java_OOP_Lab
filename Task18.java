public class Task18 {
    private double num1;
    private double num2;

    public Task18(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getLarger() {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public void displayLarger() {
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("The larger number is: " + getLarger());
    }

    public static void main(String[] args) {
        Task18 comparison1 = new Task18(12.5, 45.3);
        comparison1.displayLarger();
        
        System.out.println();
        
        Task18 comparison2 = new Task18(99.9, 88.8);
        comparison2.displayLarger();
    }
}
