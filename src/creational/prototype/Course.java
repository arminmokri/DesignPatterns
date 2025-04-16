package creational.prototype;

public class Course implements Cloneable<Course> {

    private String name;
    private Float mark;

    public Course(String name, Float mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    @Override
    public Course makeClone() {
        return new Course(this.name, this.mark);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
