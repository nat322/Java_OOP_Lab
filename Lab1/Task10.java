public class Task10 {
    private double mark;
    private static final double PASSING_MARK = 50.0;

    public Task10(double mark) {
        this.mark = mark;
    }

    public boolean hasPassed() {
        return mark >= PASSING_MARK;
    }

    public void displayResult() {
        System.out.println("Student Mark: " + mark);
        if (hasPassed()) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public static void main(String[] args) {
        Task10 s1 = new Task10(45.5);
        Task10 s2 = new Task10(78.0);
        
        System.out.println("Checking Student 1:");
        s1.displayResult();
        
        System.out.println("\nChecking Student 2:");
        s2.displayResult();
    }
}
