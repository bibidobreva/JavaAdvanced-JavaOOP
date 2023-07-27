package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employeeList = new ArrayList<>();
        Map<String, Department> departmentMap = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Employee currentEmployee = new Employee();
            Department currentDepartment;

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            if (!departmentMap.containsKey(department)) {
                currentDepartment = new Department(department);
                departmentMap.put(department, currentDepartment);
                departmentMap.get(department).addSalary(salary);
            } else {
                departmentMap.get(department).addSalary(salary);
            }


            if (input.length == 4) {
                currentEmployee = new Employee(name, salary, position, department);

            } else if (input.length == 5) {
                if (input[4].length() > 2) {
                    String email = input[4];
                    currentEmployee = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(input[4]);
                    currentEmployee = new Employee(name, salary, position, department, age);
                }
            } else if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                currentEmployee = new Employee(name, salary, position, department, email, age);
            }
            employeeList.add(currentEmployee);
        }
        String highestSalaryDepartment = "";
        double highestAVGSalary = Double.MIN_VALUE;

        for (Map.Entry<String, Department> entry : departmentMap.entrySet()) {
            double average = entry.getValue().getSalary().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            if (average > highestAVGSalary) {
                highestSalaryDepartment = entry.getKey();
                highestAVGSalary = average;
            }
        }
        System.out.println("Highest Average Salary: " + highestSalaryDepartment);

        employeeList.sort(Employee::compareTo);

        for (Employee employee : employeeList) {
            String currentEmployeeDep = employee.getDepartment();
            if (currentEmployeeDep.equals(highestSalaryDepartment)) {
                System.out.println(employee);
            }
        }


    }


}

