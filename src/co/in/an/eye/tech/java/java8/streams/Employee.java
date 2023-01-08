package co.in.an.eye.tech.java.java8.streams;

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
}
