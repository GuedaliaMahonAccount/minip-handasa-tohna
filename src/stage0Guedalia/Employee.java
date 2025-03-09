package stage0;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String id;

    // Constructor to initialize Employee attributes
    public Employee(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //default constructor
    public Employee() {
        this.firstName = "plony";
        this.lastName = "almony";
        this.id = "0";
    }

                                                          
    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // Abstract method earnings to be implemented by subclasses
    public abstract float earnings();

    // Override toString method to display Employee information
    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", ID: " + id;
    }

    // Override equals method to compare Employees by id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return id.equals(other.id);
    }
}
