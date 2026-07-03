public class Task5 {
    private int num1;
    private int num2;

    public Task5(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public void displayResult() {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add());
    }

    public static void main(String[] args) {
        Task5 addition = new Task5(15, 25);
        addition.displayResult();
    }
}
