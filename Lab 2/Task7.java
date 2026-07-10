import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Task7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter assignment marks: ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
            return;
        }

        NavigableMap<Integer, String[]> grades = new TreeMap<>();
        grades.put(0,  new String[]{"F",  "Fail"});
        grades.put(40, new String[]{"F+", "Marginal Fail"});
        grades.put(50, new String[]{"D",  "Pass"});
        grades.put(55, new String[]{"C",  ""});
        grades.put(65, new String[]{"B",  "Credit"});
        grades.put(70, new String[]{"B+", ""});
        grades.put(75, new String[]{"A",  "Distinction"});
        grades.put(80, new String[]{"A+", ""});

        String[] result = grades.floorEntry(marks).getValue();

        System.out.println("Grade: " + result[0]);
        if (!result[1].isEmpty()) {
            System.out.println("Description: " + result[1]);
        }
    }
}