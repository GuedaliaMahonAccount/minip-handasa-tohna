package stage0;


import java.text.DecimalFormat;

/**
 * Represents an employee paid on commission.
 * <p>
 * Calculates earnings based on gross sales and commission percentage.
 * </p>
 * @author Guedalia Seabbah
 */
public class CommissionEmployee extends Employee {
    private float grossSales;
    private int commission; // commission percentage

    /**
     * Constructs a CommissionEmployee with the given details.
     *
     * @param firstName  the employee's first name
     * @param lastName   the employee's last name
     * @param id         the employee's id
     * @param grossSales the gross sales amount
     * @param commission the commission percentage
     */
    public CommissionEmployee(String firstName, String lastName, String id, float grossSales, int commission) {
        super(firstName, lastName, id);
        setGrossSales(grossSales);
        setCommission(commission);
    }

    /**
     * Default constructor.
     */
    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commission = 0;
    }

    /**
     * Returns the gross sales.
     *
     * @return grossSales
     */
    public float getGrossSales() {
        return grossSales;
    }

    /**
     * Sets the gross sales. Must be non-negative.
     *
     * @param grossSales the gross sales amount
     * @throws IllegalArgumentException if grossSales is negative
     */
    public void setGrossSales(float grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
        this.grossSales = grossSales;
    }

    /**
     * Returns the commission percentage.
     *
     * @return commission
     */
    public int getCommission() {
        return commission;
    }

    /**
     * Sets the commission percentage. Must be non-negative.
     *
     * @param commission the commission percentage
     * @throws IllegalArgumentException if commission is negative
     */
    public void setCommission(int commission) {
        if (commission < 0) {
            throw new IllegalArgumentException("Commission percentage cannot be negative");
        }
        this.commission = commission;
    }

    /**
     * Calculates earnings based on gross sales and commission percentage.
     *
     * @return the calculated earnings
     */
    @Override
    public float earnings() {
        return grossSales * commission / 100.0f;
    }

    /**
     * Returns a string representation of the CommissionEmployee with formatted earnings.
     *
     * @return a formatted string with employee details and earnings
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return super.toString() + ", CommissionEmployee [grossSales=" + grossSales + ", commission=" + commission
                + ", earnings=" + df.format(earnings()) + "]";
    }

    /**
     * Compares this CommissionEmployee to another for equality.
     *
     * @param obj the object to compare with
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof CommissionEmployee)) return false;
        CommissionEmployee other = (CommissionEmployee) obj;
        return Float.compare(grossSales, other.grossSales) == 0 && commission == other.commission;
    }
}
