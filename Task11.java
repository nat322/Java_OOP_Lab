public class Task11 {
    private double number;

    public Task11(double number) {
        this.number = number;
    }

    public void checkSign() {
        System.out.print("Number " + number + " is: ");
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Task11 t1 = new Task11(15.5);
        Task11 t2 = new Task11(-9.8);
        Task11 t3 = new Task11(0);

        t1.checkSign();
        t2.checkSign();
        t3.checkSign();
    }
}
