import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            students.putIfAbsent(name,new ArrayList<>());
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            System.out.print(entry.getKey()+" -> ");
            for(Double grade: entry.getValue()){
                System.out.printf("%.2f ",grade);;
            }
            System.out.printf("(avg: %.2f)%n",average);

        }

    }
}
