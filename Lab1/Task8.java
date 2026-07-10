public class Task8 {
    private double radius;

    public Task8(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayArea() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Area of Circle: " + calculateArea());
    }

    public static void main(String[] args) {
        Task8 circle = new Task8(7.0);
        circle.displayArea();
    }
}
