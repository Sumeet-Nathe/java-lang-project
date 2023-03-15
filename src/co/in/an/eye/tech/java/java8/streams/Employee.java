package co.in.an.eye.tech.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Employee {
    String name;
    Integer empId;
    List<Salary> salary;

    public Employee() {
    }

    public Employee(String name, Integer empId, List<Salary> salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public List<Salary> getSalary() {
        return salary;
    }

    public void setSalary(List<Salary> salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && empId.equals(employee.empId) && salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empId);
    }

    @Override
    public String toString() {
        return "  Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                "}\n";
    }
    static List<Employee> getEmployee() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Sumeet", 100, Arrays.asList(new Salary(100000D))));
        employees.add(new Employee("Mai", 101, Arrays.asList(new Salary(200000D))));
        employees.add(new Employee("Appa", 102, Arrays.asList(new Salary(300000D))));
        employees.add(new Employee("Snehal", 104, Arrays.asList(new Salary(400000D))));
        employees.add(new Employee("Sumeet", 99, Arrays.asList(new Salary(990000D), new Salary(990000D), new Salary(990000D))));
        return employees;
    }
}
