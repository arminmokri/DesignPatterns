package creational.prototype.example1;

import java.util.Objects;

public class Main {

    public static void println(String x) {
        System.out.println(x);
        System.out.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void errPrintln(String x) {
        System.err.println(x);
        System.err.flush();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public static void println() {
        println("");
    }

    public static void main(String[] args) throws InterruptedException {

        // Create student 1
        Student student1 = new Student("Micheal", "Miller");
        student1.addCourse(new Course("Math", 89.2f));
        student1.addCourse(new Course("Science", 86.8f));

        // Copy from student 1 to make student 2
        Student student2 = student1.makeClone();

        // Print student 1 and student 2
        println(student1.toString());
        println(student2.toString());
        println();
        Thread.sleep(2000);

        // Change some info in student 2
        student2.setFirstName("Alice");
        student2.setLastName("Richmond");
        Course course1 = student2.getCourse("Math");
        if (Objects.nonNull(course1)) {
            course1.setName("English");
            course1.setMark(81.9f);
        }
        Course course2 = student2.getCourse("Science");
        if (Objects.nonNull(course2)) {
            course2.setName("Computer");
            course2.setMark(93.7f);
        }

        // We implemented a deep copy, which is why it didn't affect Student 1.
        println(student1.toString());
        println(student2.toString());
        println();
        Thread.sleep(2000);
    }
}
