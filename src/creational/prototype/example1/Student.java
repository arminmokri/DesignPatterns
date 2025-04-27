package creational.prototype.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student implements Cloneable<Student> {


    private String firstName;
    private String lastName;

    private List<Course> courses;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourse(String name) {
        return courses.stream()
                .filter(course -> course.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Student makeClone() {
        Student newStudent = new Student(this.firstName, this.lastName);
        newStudent.courses = courses.stream().map(Course::makeClone).collect(Collectors.toList());
        return newStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courses +
                '}';
    }
}
