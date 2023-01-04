package co.in.an.eye.tech.java.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingFunction {
    public static void main(String[] args) {
        System.out.println("Sorting of given Integer stream");
        Stream.of(1, 1, 1, 2, 3, 4, 5, 3, 2).sorted().forEach(i->System.out.print(i+" "));

        System.out.println("\nSorting based on name :");
        getEmployee().stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);

        System.out.println("\n\nSorting based on name then emp id :");
        getEmployee().stream().sorted(Comparator.comparingInt(e -> e.empId)).sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);

        System.out.println("\n\nReverse Sorting based on emp id :");
        getEmployee().stream().sorted(Comparator.comparingInt(Employee::getEmpId).reversed()).forEach(System.out::print);

        System.out.println("\n\nSorting based on emp id then name :");
        getEmployee().stream().sorted(Comparator.comparingInt(Employee::getEmpId).thenComparing(Employee::getName)).forEach(System.out::print);

    }

    static List<Employee> getEmployee(){
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Sumeet",100));
        employees.add(new Employee("Mai",101));
        employees.add(new Employee("Appa",102));
        employees.add(new Employee("Snehal",104));
        employees.add(new Employee("Sumeet",99));
        return employees;
    }
}
