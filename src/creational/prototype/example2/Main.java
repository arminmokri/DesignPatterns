package creational.prototype.example2;

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
        // Create a Person and Employee without manager
        Employee employee = new Employee("Jane Smith", 33, "Software Engineer");

        // Perform deep clone
        Employee clonedEmployee = employee.clone();

        //
        employee.setName("Zara Farmer");
        employee.setAge(31);
        employee.setJobTitle("Product Designer");

        // Print the results
        println("Original Employee: " + employee);
        println();
        Thread.sleep(2000);

        println("Cloned Employee: " + clonedEmployee);
        println();
        Thread.sleep(2000);
    }
}
