package stage0;

public class CommissionEmployee extends Employee {
    private float grossSales;
    private int commission; // commission percentage

    // Constructor: initialize attributes
    public CommissionEmployee(String firstName, String lastName, String id, float grossSales, int commission) {
        super(firstName, lastName, id);
        setGrossSales(grossSales); // validate grossSales
        setCommission(commission);  // validate commission
    }

    //default constructor
    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commission = 0;
    }

    // Getter and Setter for grossSales
    public float getGrossSales() {
        return grossSales;
    }
    public void setGrossSales(float grossSales) {
        if(grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
        this.grossSales = grossSales;
    }

    // Getter and Setter for commission
    public int getCommission() {
        return commission;
    }
    public void setCommission(int commission) {
        if(commission < 0) {
            throw new IllegalArgumentException("Commission percentage cannot be negative");
        }
        this.commission = commission;
    }

    // Implement earnings: grossSales * (commission / 100.0)
    @Override
    public float earnings() {
        return grossSales * commission / 100.0f;
    }

    // Override toString to display CommissionEmployee details
    @Override
    public String toString() {
        return super.toString() + ", CommissionEmployee [grossSales=" + grossSales + ", commission=" + commission + ", earnings=" + earnings() + "]";
    }

    // Override equals method to compare CommissionEmployee
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof CommissionEmployee)) return false;
        CommissionEmployee other = (CommissionEmployee) obj;
        return Float.compare(grossSales, other.grossSales) == 0 && commission == other.commission;
    }
}
