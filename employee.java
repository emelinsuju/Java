import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
         this.salary = salary;
    }
    public void displayEmployee() {
        System.out.println("Employee id: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.println();
            employees[i] = new Employee(id, name, salary);
        }
        System.out.println("Employee Records ");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
        
        scanner.close();
    }
}
