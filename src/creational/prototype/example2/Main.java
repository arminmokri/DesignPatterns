package creational.prototype.example2;

public class Main {
    public static void main(String[] args) {
        // Create a Person and Employee without manager
        Employee employee = new Employee("Jane Smith", 33, "Software Engineer");

        // Perform deep clone
        Employee clonedEmployee = employee.clone();

        //
        employee.setName("Zara Farmer");
        employee.setAge(31);
        employee.setJobTitle("Product Designer");

        // Print the results
        System.out.println("Original Employee: " + employee);
        System.out.println("Cloned Employee: " + clonedEmployee);
    }
}
