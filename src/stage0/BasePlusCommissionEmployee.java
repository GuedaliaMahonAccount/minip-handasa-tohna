package stage0;


import java.text.DecimalFormat;

/**
 * Represents a base plus commission employee.
 * <p>
 * Inherits from CommissionEmployee and adds a base salary and bonus.
 * </p>
 * <p>
 * The bonus is a constant amount added to the earnings.
 * </p>
 * @author Guedalia Seabbah
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;
    private static final float BONUS = 100.0f;

    /**
     * Constructs a BasePlusCommissionEmployee with the given details.
     *
     * @param firstName   the employee's first name
     * @param lastName    the employee's last name
     * @param id          the employee's id
     * @param grossSales  the gross sales amount
     * @param commission  the commission percentage
     * @param baseSalary  the base salary
     */
    public BasePlusCommissionEmployee(String firstName, String lastName, String id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        setBaseSalary(baseSalary);
    }

    /**
     * Default constructor.
     */
    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    /**
     * Returns the base salary.
     *
     * @return baseSalary
     */
    public float getBaseSalary() {
        return baseSalary;
    }

    /**
     * Sets the base salary. Must be non-negative.
     *
     * @param baseSalary the base salary amount
     * @throws IllegalArgumentException if baseSalary is negative
     */
    public void setBaseSalary(float baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    /**
     * Calculates earnings as the sum of base salary, commission earnings, and bonus.
     *
     * @return the calculated earnings
     */
    @Override
    public float earnings() {
        return getBaseSalary() + super.earnings() + BONUS;
    }

    /**
     * Returns a string representation of the BasePlusCommissionEmployee with formatted earnings.
     *
     * @return a formatted string with employee details and earnings
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        // Replace "CommissionEmployee" with "BasePlusCommissionEmployee" for clarity
        return super.toString().replace("CommissionEmployee", "BasePlusCommissionEmployee")
                + " [baseSalary=" + baseSalary + ", updated earnings=" + df.format(earnings()) + "]";
    }

    /**
     * Compares this BasePlusCommissionEmployee to another for equality.
     *
     * @param obj the object to compare with
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof BasePlusCommissionEmployee)) return false;
        BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
        return Float.compare(baseSalary, other.baseSalary) == 0;
    }
}
