public class Task14 {
    public void printTenToOne() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task14 program = new Task14();
        program.printTenToOne();
    }
}
