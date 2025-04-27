package creational.prototype.example2;

class Employee extends Person implements Cloneable {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public Employee clone() {
        // shallow clone
        return (Employee) super.clone();
    }

    @Override
    public String toString() {
        return "Employee{jobTitle='" + jobTitle + "', name='" + getName() + "', age=" + getAge() + "}";
    }
}
