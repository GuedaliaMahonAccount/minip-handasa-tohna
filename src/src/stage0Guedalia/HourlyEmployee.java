package stage0Guedalia;

public class HourlyEmployee extends Employee {
    private int hours;
    private float wage;

    // Constructor: call super and initialize hours and wage
    public HourlyEmployee(String firstName, String lastName, String id, int hours, float wage) {
        super(firstName, lastName, id);
        setHours(hours); // using setter to validate
        setWage(wage);   // using setter to validate
    }

    //default constructor
    public HourlyEmployee() {
        super();
        this.hours = 0;
        this.wage = 0;
    }

    // Getter and Setter for hours
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        // Validate that hours are non-negative
        if(hours < 0) {
            throw new IllegalArgumentException("Hours cannot be negative");
        }
        this.hours = hours;
    }

    // Getter and Setter for wage
    public float getWage() {
        return wage;
    }
    public void setWage(float wage) {
        // Validate that wage is non-negative
        if(wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative");
        }
        this.wage = wage;
    }

    // Implement earnings method: wage * hours
    @Override
    public float earnings() {
        return wage * hours;
    }

    // Override toString method to include HourlyEmployee details
    @Override
    public String toString() {
        return super.toString() + ", HourlyEmployee [hours=" + hours + ", wage=" + wage + ", earnings=" + earnings() + "]";
    }

    // Override equals method: combine super equals with specific checks if necessary
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof HourlyEmployee)) return false;
        HourlyEmployee other = (HourlyEmployee) obj;
        return hours == other.hours && Float.compare(wage, other.wage) == 0;
    }
}
