public class Task12 {
    private int number;

    public Task12(int number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public void displayParity() {
        if (isEven()) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        Task12 n1 = new Task12(7);
        Task12 n2 = new Task12(24);

        n1.displayParity();
        n2.displayParity();
    }
}
