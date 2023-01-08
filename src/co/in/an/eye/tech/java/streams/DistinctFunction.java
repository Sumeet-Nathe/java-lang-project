package co.in.an.eye.tech.java.streams;

import java.util.ArrayList;
import java.util.List;

public class DistinctFunction {
    static List<Employee> getEmployee(){
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Sumeet",100));
        employees.add(new Employee("Mai",101));
        employees.add(new Employee("Appa",102));
        employees.add(new Employee("Snehal",104));
        employees.add(new Employee("Sumeet",99));
        return employees;
    }

    public static void main(String[] args) {
        List<Employee>  employees = getEmployee();
        long count = employees.stream().distinct().count();
        System.out.println("Total distinct employees : count : "+count);

        Employee e1 = new Employee("Sumeet",99);
        Employee e2 = new Employee("Sumeet",99);
        employees.add(e1);
        employees.add(e2);

        //As we have implemented equals and hashcode in Employee class
        //Above statements doesn't matter because those will be pointing to
        //same object just reference will be different

        long countNew = employees.stream().distinct().count();
        System.out.println("Total distinct employees : countNew : "+countNew);

        Employee e3 = new Employee("Sumeet",107);
        employees.add(e3);
        long countNew1 = employees.stream().distinct().count();
        System.out.println("Total distinct employees : countNew1 : "+countNew1);
    }
}
