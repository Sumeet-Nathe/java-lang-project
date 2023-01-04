package co.in.an.eye.tech.java.streams;

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
    public String toString() {
        return "  Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}
