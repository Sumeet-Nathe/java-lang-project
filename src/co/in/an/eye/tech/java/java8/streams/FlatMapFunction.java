package co.in.an.eye.tech.java.java8.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatMapFunction {

    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployee();

        employees.stream().flatMap(employee -> {
            System.out.println(employee.getName() + " : ");
            return employee.getSalary().stream();
        }).forEach(System.out::println);

        System.out.println("By using java 8 Get student names with overall percentage more than 85");
        List<Student> students = Student.getStudents();

        /*List<List<Marksheet>> collect = students.stream().map(s -> s.getMarks()).collect(Collectors.toList());
        collect.stream().flatMap(m->m.stream()).forEach(s->{
            System.out.println("Ky mg patil : "+s);
        });*/

        Map<String, Float> studentWithHisPercentage = new HashMap<>();
        Float percentage;
        for (Student s : students) {
            List<Marksheet> marks = s.getMarks();
            System.out.println(marks);
            List<Integer> maxMarks = marks.stream().map(Marksheet::getMaximumMarks).toList();
            System.out.println("maxMarks : " + maxMarks);
            List<Integer> obtainedMarks = marks.stream().map(Marksheet::getMarksObtainByStudent).toList();
            System.out.println("obtainedMarks : " + obtainedMarks);
            Integer maxMarksTotal = maxMarks.stream().mapToInt(Integer::intValue).sum();
            System.out.println("maxMarksTotal : " + maxMarksTotal);
            Integer obtainedMarksTotal = obtainedMarks.stream().mapToInt(Integer::intValue).sum();
            System.out.println("obtainedMarksTotal : " + obtainedMarksTotal);
            float prePercentage = (obtainedMarksTotal / maxMarksTotal);
            System.out.println("prePercentage : " + prePercentage);
            percentage = prePercentage * 100;
            System.out.println(s.getName() + " : " + percentage);
        }


    }
}

