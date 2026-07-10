public class Task4 {
    private String name;
    private int age;
    private double mark;
    private char grade;
    private boolean passStatus;

    public Task4(String name, int age, double mark, char grade, boolean passStatus) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.grade = grade;
        this.passStatus = passStatus;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
        System.out.println("Pass Status: " + passStatus);
    }

    public static void main(String[] args) {
        Task4 student = new Task4("Alice", 21, 85.5, 'A', true);
        student.displayInfo();
    }
}
