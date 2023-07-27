package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String department;
    List<Double> salary;

    public Department(String department){
        this.department = department;
        this.salary = new ArrayList<>();
    }
    public  void addSalary(double salary){
        this.salary.add(salary);
    }



    public List<Double> getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
