package stage0Guedalia;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;

    // Constructor: initialize using CommissionEmployee constructor and baseSalary
    public BasePlusCommissionEmployee(String firstName, String lastName, String id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        setBaseSalary(baseSalary); // using setter to validate
    }

    //default constructor
    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    // Getter and Setter for baseSalary
    public float getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(float baseSalary) {
        if(baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    // Override earnings: commission earnings + baseSalary + bonus (100)
    @Override
    public float earnings() {
        return getBaseSalary() + super.earnings() + 100;
    }

    // Override toString to include BasePlusCommissionEmployee details
    @Override
    public String toString() {
        // We replace "CommissionEmployee" by "BasePlusCommissionEmployee" for clarity
        return super.toString().replace("CommissionEmployee", "BasePlusCommissionEmployee") +
                " [baseSalary=" + baseSalary + ", updated earnings=" + earnings() + "]";
    }

    // Override equals method to compare BasePlusCommissionEmployee
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof BasePlusCommissionEmployee)) return false;
        BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
        return Float.compare(baseSalary, other.baseSalary) == 0;
    }
}
