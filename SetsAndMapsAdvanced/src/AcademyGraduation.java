import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double[]> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split("\\s+");
            Double []grade = new Double[grades.length];
            for (int j = 0; j < grades.length; j++) {
                grade[j] = Double.parseDouble(grades[j]);
            }
            students.put(name,grade);
        }

        for (Map.Entry<String, Double[]> entry : students.entrySet()) {
            double average = 0;
            for(Double grades: entry.getValue()){
                average+=grades;
            }
            average=average/entry.getValue().length;

            System.out.printf("%s is graduated with %f%n",entry.getKey(),average);
        }

    }
}
