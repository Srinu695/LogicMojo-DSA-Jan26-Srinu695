package com.interview.prep.streams;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsInterviewQuestionsImp {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Ravi", "IT", 70000, 28),
                new Employee(102, "Rahul", "HR", 50000, 35),
                new Employee(103, "Amit", "IT", 90000, 30),
                new Employee(104, "Priya", "Finance", 80000, 27),
                new Employee(105, "Sneha", "IT", 60000, 25),
                new Employee(106, "Kiran", "HR", 75000, 40)
        );

        //Print All Employee Names

        List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);

        //Salary greater than 70K

        List<Employee> salaryGreaterThan70K =
                employees.stream().filter(e -> e.getSalary() > 70000).collect(Collectors.toList());

        System.out.println(salaryGreaterThan70K);


        //Sort Employees by salary asc
        //Comparator.comparingDouble(Employee::getSalary).reversed() for desc
        List<Employee> sortedList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).
                collect(Collectors.toList());
        System.out.println("SortedList by salary"+ sortedList);


        //Sort Employees by name
        List<Employee> sortedListByNames =  employees.stream().sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("sortedListByNames" + sortedListByNames);


        //Find highest paid employee

        Employee highestPaid = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Highest Paid: "+highestPaid);


        //Second highest paid

        Employee SecondHIghestPaid = employees.stream().
                sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1)
                .findFirst().get();

        System.out.println("SecondHIghestPaid" + SecondHIghestPaid);


        //Group Emp by department

        Map<String, List<String>> groupByDepartment = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println("groupByDepartment" + groupByDepartment);

        //Count Employees in each department

        Map<String , Long> countByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("countByDepartment: "+countByDepartment);


        //Average salary by department

        Map<String, Double> averageByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));

        averageByDepartment.replaceAll((dept,avg) ->
                BigDecimal.valueOf(avg).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());

        System.out.println("averageByDepartment"+ averageByDepartment);

        //Find youngest Emp

        Employee youngest = employees.stream().min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("youngest: " + youngest);


        //Find oldest Emp

        Employee oldest = employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("oldest: " + oldest);

        //Find all distinct departments

        List<String> distinctDepartments = employees.stream().map(Employee::getDepartment).distinct()
                .collect(Collectors.toList());

        System.out.println("distinctDepartments:"+distinctDepartments);

        //CONVERT EMP LIST TO HASMAP <ID, EMPLOYEE>

        Map<Integer, Employee> empMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity(),
                        (e1,e2) -> e1, LinkedHashMap::new));

        System.out.println(empMap);


        //Count total employees

        Long totalEmp = employees.stream().count();
        System.out.println(totalEmp);

        //Partition emp by salary

        Map<Boolean, List<Employee>> partioningBySalary = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary()<=70000));

        System.out.println(partioningBySalary.get(true));
        System.out.println(partioningBySalary.get(false));


    }



}
