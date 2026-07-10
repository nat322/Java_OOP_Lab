public class Task17 {
    private String message;
    private int count;

    public Task17(String message, int count) {
        this.message = message;
        this.count = count;
    }

    public void printRepeatedly() {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Task17 fun = new Task17("Java is fun", 5);
        fun.printRepeatedly();
    }
}
