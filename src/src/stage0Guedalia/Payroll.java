package stage0Guedalia;

public class Payroll {
    public static void main(String[] args) {
        // Create an array of Employee references
        Employee[] employees = new Employee[3];

        // Initialize each employee with test data
        employees[0] = new HourlyEmployee("John", "Doe", "337966659", 40, 15.50f);
        employees[1] = new CommissionEmployee("Jane", "Smith", "337966667", 5000.0f, 10);
        employees[2] = new BasePlusCommissionEmployee("Alice", "Johnson", "337966626", 4000.0f, 8, 300.0f);

        // Display information and earnings of each employee
        System.out.println("Employee details and earnings:");
        for(Employee emp : employees) {
            System.out.println(emp.toString());
        }

        // Increase base salary for BasePlusCommissionEmployee by 10% and display updated earnings
        for(Employee emp : employees) {
            if(emp instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee bpce = (BasePlusCommissionEmployee) emp;
                float oldSalary = bpce.getBaseSalary();
                bpce.setBaseSalary(oldSalary * 1.10f); // increase by 10%
                System.out.println("\nAfter 10% increase in base salary:");
                System.out.println(bpce.toString());
            }
        }
    }
}
