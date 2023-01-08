package co.in.an.eye.tech.java.streams;

import java.util.Objects;

public class Employee {
    String name;
    Integer empId;
    public Employee(){}
    public Employee(String name, Integer empId) {
        this.name = name;
        this.empId = empId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(empId, employee.empId);
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
                '}';
    }
}
