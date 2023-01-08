package co.in.an.eye.tech.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingFunction {
    public static void main(String[] args) {
        System.out.println("Sorting of given Integer stream");
        Stream.of(1, 1, 1, 2, 3, 4, 5, 3, 2).sorted().forEach(i -> System.out.print(i + " "));

        System.out.println("\n\nReverse Sorting of given Integer stream");
        Stream.of(1, 1, 1, 2, 3, 4, 5, 3, 2).sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));

        System.out.println("\n\nSorting based on name :");
        getEmployee().stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);

        System.out.println("\n\nSorting based on name then emp id :");
        getEmployee().stream().sorted(Comparator.comparingInt(e -> e.empId)).sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);

        System.out.println("\n\nReverse Sorting based on emp id :");
        getEmployee().stream().sorted(Comparator.comparingInt(Employee::getEmpId).reversed()).forEach(System.out::print);

        System.out.println("\n\nSorting based on emp id then name :");
        getEmployee().stream().sorted(Comparator.comparingInt(Employee::getEmpId).thenComparing(Employee::getName)).forEach(System.out::print);


        Comparator<Employee> employeeComparator = Comparator.comparing(e -> e.empId);
        List<Employee> employees = getEmployee();
        employees.sort(employeeComparator);
        System.out.println("\n\nSorting Employees Using Comparator : ");
        System.out.println(employees);

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