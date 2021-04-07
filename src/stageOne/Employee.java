package stageOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Map<Employee, String> employeeStringMap = new HashMap<>();

        Employee employee1 = new Employee("Mike", 13);
        Employee employee2 = new Employee("Michael", 13);

        employeeStringMap.put(employee1, "A");

        System.out.println(employeeStringMap.containsKey(employee1));
        System.out.println(employeeStringMap.containsKey(employee2));

        employee1.name = "Michael";

        System.out.println(employeeStringMap.containsKey(employee1));
        System.out.println(employeeStringMap.containsKey(employee2));
    }
}
