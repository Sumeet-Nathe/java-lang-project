package co.in.an.eye.tech.java.java8.streams;

import java.util.Arrays;
import java.util.List;

public class MapFunction {

    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployee();
        System.out.println("Printing Names of employees using map function : ");
        employees.stream().map(Employee::getName).forEach(System.out::println);

        System.out.println("\n\nSquare of given int array using map function :");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Arrays.stream(arr).map(i -> i * i).forEach(System.out::println);
    }
}
