public class Task2 {
    private String name;
    private int age;
    private String courseName;

    public Task2(String name, int age, String courseName) {
        this.name = name;
        this.age = age;
        this.courseName = courseName;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course Name: " + courseName);
    }

    public static void main(String[] args) {
        Task2 info = new Task2("John Doe", 20, "Java Programming");
        info.displayDetails();
    }
}
