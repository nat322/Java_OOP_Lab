public class Task15 {
    private int number;

    public Task15(int number) {
        this.number = number;
    }

    public void printTable() {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Task15 table = new Task15(5);
        table.printTable();
    }
}
