package codes.practicals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }
}

public class Q20{
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<>(Arrays.asList(
                new Employee(1,"kartik"),
                new Employee(2, "jay"),
                new Employee(3,"jayesh")
        ));

        Map<Integer, String> mp = l.stream()
                .collect(
                    Collectors.toMap(Employee::getId, Employee::getName)
                );

        mp.forEach((k,v) -> {
            System.out.println(k + "-" + v);
        });
    }
}
