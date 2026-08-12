
class CorporatePackage {
    
    
    public static class Employee {
        protected int salary;

        public Employee(int salary) {
            this.salary = salary;
        }

        protected void showSalary() {
            System.out.println("Salary: " + salary);
        }
    }
}


class ManagementPackage {
    
    
    public static class Manager extends CorporatePackage.Employee {
        private String department;

        public Manager(int salary, String department) {
            super(salary); 
            this.department = department;
        }

        public void testAccess() {
            System.out.println("--- Subclass Access Testing ---");
            
            
            this.salary = 95000; 
            System.out.println("Manager successfully changed salary directly via inheritance.");
            
            this.showSalary(); 
        }
    }
}


class ExternalPackage {
    
    public static class Stranger {
        public void testAccess() {
            System.out.println("\n--- Non-Subclass in Different Package Access Testing ---");
            
            CorporatePackage.Employee emp = new CorporatePackage.Employee(50000);
            
            
            
            System.out.println("[COMPILE ERROR]: Cannot access 'salary' or 'showSalary()'.");
            System.out.println("Reason: protected modifiers block non-subclasses located in external packages.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
        ManagementPackage.Manager manager = new ManagementPackage.Manager(80000, "IT");
        manager.testAccess();

        
        ExternalPackage.Stranger stranger = new ExternalPackage.Stranger();
        stranger.testAccess();
    }
}

