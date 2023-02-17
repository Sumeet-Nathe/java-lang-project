package co.in.an.eye.tech.java.java8.streams;

import java.util.List;

public class FlatMapFunction {

    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployee();

        employees.stream().flatMap(employee -> employee.getSalary().stream()).forEach(System.out::println);

    }
}

