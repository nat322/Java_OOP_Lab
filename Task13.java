public class Task13 {
    public void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task13 program = new Task13();
        program.printOneToTen();
    }
}
