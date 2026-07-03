public class Task9 {
    private double mark1;
    private double mark2;
    private double mark3;

    public Task9(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public void displayAverage() {
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Average: " + calculateAverage());
    }

    public static void main(String[] args) {
        Task9 studentMarks = new Task9(75.5, 80.0, 92.5);
        studentMarks.displayAverage();
    }
}
