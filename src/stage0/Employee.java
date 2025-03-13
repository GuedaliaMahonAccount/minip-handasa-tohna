/**
 * Abstract class representing an employee.
 * <p>
 * This class provides basic attributes and methods for an employee.
 * </p>
 * @author Guedalia Seabbah
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String id;

    /**
     * Constructs an Employee with given details.
     *
     * @param firstName the employee's first name
     * @param lastName  the employee's last name
     * @param id        the employee's identification
     */
    public Employee(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    /**
     * Default constructor.
     */
    public Employee() {
        this.firstName = "plony";
        this.lastName = "almony";
        this.id = "0";
    }

    /**
     * Returns the first name of the employee.
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the employee.
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the employee.
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the employee's ID.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the employee's ID.
     *
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Abstract method to calculate earnings.
     *
     * @return the earnings of the employee
     */
    public abstract float earnings();

    /**
     * Returns a string representation of the employee.
     *
     * @return a formatted string with employee details
     */
    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", ID: " + id;
    }

    /**
     * Compares this employee with another for equality based on ID.
     *
     * @param obj the object to compare with
     * @return true if employees are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id.equals(other.id);
    }
}
