import java.text.DecimalFormat;

/**
 * Represents an hourly employee.
 * <p>
 * Calculates earnings based on hours worked and wage rate.
 * </p>
 * @author Guedalia Seabbah
 */
public class HourlyEmployee extends Employee {
    private int hours;
    private float wage;

    /**
     * Constructs an HourlyEmployee with the given details.
     *
     * @param firstName the employee's first name
     * @param lastName  the employee's last name
     * @param id        the employee's id
     * @param hours     the number of hours worked
     * @param wage      the wage per hour
     */
    public HourlyEmployee(String firstName, String lastName, String id, int hours, float wage) {
        super(firstName, lastName, id);
        setHours(hours);
        setWage(wage);
    }

    /**
     * Default constructor.
     */
    public HourlyEmployee() {
        super();
        this.hours = 0;
        this.wage = 0;
    }

    /**
     * Returns the number of hours worked.
     *
     * @return hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Sets the number of hours worked. Must be non-negative.
     *
     * @param hours the number of hours
     * @throws IllegalArgumentException if hours is negative
     */
    public void setHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        this.hours = hours;
    }

    /**
     * Returns the wage per hour.
     *
     * @return wage
     */
    public float getWage() {
        return wage;
    }

    /**
     * Sets the wage per hour. Must be non-negative.
     *
     * @param wage the wage rate
     * @throws IllegalArgumentException if wage is negative
     */
    public void setWage(float wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative");
        }
        this.wage = wage;
    }

    /**
     * Calculates earnings as wage multiplied by hours.
     *
     * @return the calculated earnings
     */
    @Override
    public float earnings() {
        return wage * hours;
    }

    /**
     * Returns a string representation of the HourlyEmployee with formatted earnings.
     *
     * @return a formatted string with employee details and earnings
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return super.toString() + ", HourlyEmployee [hours=" + hours + ", wage=" + wage + ", earnings=" + df.format(earnings())
                + "]";
    }

    /**
     * Compares this HourlyEmployee to another for equality.
     *
     * @param obj the object to compare with
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof HourlyEmployee)) return false;
        HourlyEmployee other = (HourlyEmployee) obj;
        return hours == other.hours && Float.compare(wage, other.wage) == 0;
    }
}
