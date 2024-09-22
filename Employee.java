package pushpak35;
import java.util.*;
//comparator

class Employee {
    String name;
    int rollNo;
    double salary;


    public Employee(String name, int rollNo, double salary) {
        this.name = name;
        this.rollNo = rollNo;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [Name: " + name + ", Roll No: " + rollNo + ", Salary: $" + salary + "]";
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 3, 55000));
        employees.add(new Employee("Bob", 1, 60000));
        employees.add(new Employee("Charlie", 2, 50000));
        employees.add(new Employee("David", 4, 65000));


        Comparator<Employee> nameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        };


        Comparator<Employee> rollNoComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.rollNo - e2.rollNo;
            }
        };

        System.out.println("Sorting by Name:");
        Collections.sort(employees, nameComparator);
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        //Roll Number
        System.out.println("\nSorting by Roll Number:");
        Collections.sort(employees, rollNoComparator);
        for (Employee emp : employees) {
            System.out.println(emp);
        }


    }
}
