class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Emp{
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 101, 50000);
        Employee employee2 = new Employee("Jane Smith", 102, 60000);
        System.out.println("=== Employee 1 ===");
        employee1.displayDetails();
        System.out.println("\n=== Employee 2 ===");
        employee2.displayDetails();
    }
}