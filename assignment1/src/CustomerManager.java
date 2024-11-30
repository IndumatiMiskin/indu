import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerManager {
    public static void main(String[] args) {
        // Create a list of customers
        List<Customer> customers = new ArrayList<>();

        // Add customers to the list
        customers.add(new Customer(3, 2000.50, "indu", "miskin"));
        customers.add(new Customer(1, 3000.75, "sanjay", "math"));
        customers.add(new Customer(2, 1500.30, "anisha", "Bro"));
        customers.add(new Customer(4, 2500.40, "anushka", "raj"));

        // Print the list before sorting
        System.out.println("Before Sorting:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        // Sort the list
        Collections.sort(customers);

        // Print the list after sorting
        System.out.println("\nAfter Sorting:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
