import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private int id;
    private double balance;
    private String firstName;
    private String lastName;

    // No-arg constructor
    public Customer() {
    }

    // Parameterized constructor
    public Customer(int id, double balance, String firstName, String lastName) {
        this.id = id;
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // toString method for displaying customer data
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", balance=" + balance +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    // CompareTo method for sorting
    @Override
    public int compareTo(Customer other) {
        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (firstNameCompare != 0) return firstNameCompare;

        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (lastNameCompare != 0) return lastNameCompare;

        int idCompare = Integer.compare(this.id, other.id);
        if (idCompare != 0) return idCompare;

        return Double.compare(this.balance, other.balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                Double.compare(customer.balance, balance) == 0 &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, firstName, lastName);
    }
}