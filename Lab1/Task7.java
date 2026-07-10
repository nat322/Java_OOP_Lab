public class Task7 {
    private double length;
    private double width;

    public Task7(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public void displayArea() {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.println("Area of Rectangle: " + calculateArea());
    }

    public static void main(String[] args) {
        Task7 rect = new Task7(12.5, 5.0);
        rect.displayArea();
    }
}
