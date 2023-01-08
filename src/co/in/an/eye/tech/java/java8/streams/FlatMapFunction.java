package co.in.an.eye.tech.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapFunction {

    public static void main(String[] args) {
        List<Employee> employees = getEmployee();

        employees.stream().flatMap(employee -> employee.getSalary().stream()).forEach(System.out::println);

    }

    static List<Employee> getEmployee() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Sumeet", 100, Arrays.asList(new Salary(100000D))));
        employees.add(new Employee("Mai", 101, Arrays.asList(new Salary(200000D))));
        employees.add(new Employee("Appa", 102, Arrays.asList(new Salary(300000D))));
        employees.add(new Employee("Snehal", 104, Arrays.asList(new Salary(400000D))));
        employees.add(new Employee("Sumeet", 99, Arrays.asList(new Salary(990000D))));
        return employees;
    }
}

