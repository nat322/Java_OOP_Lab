public class Task16 {
    private int start;
    private int end;

    public Task16(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int calculateSum() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public void displaySum() {
        System.out.println("The sum of numbers from " + start + " to " + end + " is: " + calculateSum());
    }

    public static void main(String[] args) {
        Task16 range = new Task16(1, 10);
        range.displaySum();
    }
}
