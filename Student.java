package pushpak35;
import java.util.*;
//comparable

class Student implements Comparable<Student> {
    String name;
    int rollNo;


    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Implementing compareTo() to sort by rollNo in ascending order
//    @Override
//    public int compareTo(Student other) {
//        return this.rollNo - other.rollNo;
//    }
    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + rollNo + ")";
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));


        Collections.sort(students);

        System.out.println("Sorted by rollNo (Comparable): " + students);
    }
}

