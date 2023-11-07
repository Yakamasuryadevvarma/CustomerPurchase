package CustomerPurchase;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "johndoe@example.com", "123 Billing St");

        // Create an item
        Item item1 = new Item("Product A", "Description A", 10.0);
        Item item2 = new Item("Product B", "Description B", 15.0);

        // Create a supplier
        Supplier supplier = new Supplier("ABC Supplier", "supplier@example.com");

        // Create a transaction
        Transaction transaction = new Transaction(new Date(), 0.0, "Credit Card");
        transaction.setPaymentStatus("Paid");  // Simulate payment

        // Customer makes purchases
        customer.makePurchase(item1, 3);
        customer.makePurchase(item2, 2);

        // Display customer's purchases
        for (Purchase purchase : customer.getPurchases()) {
            System.out.println("Customer purchased " + purchase.getQuantity() + " units of " + purchase.getItem().getItemName());
        }

        // Supplier ships items
        for (Purchase purchase : customer.getPurchases()) {
            supplier.shipItems(purchase, customer.getDeliveryAddress());
        }

        // Calculate and display the total cost
        double totalCost = customer.calculateTotalCost();
        System.out.println("Total Cost for " + customer.getCustomerName() + ": $" + totalCost);

        // Display shipment status
        for (Purchase purchase : customer.getPurchases()) {
            System.out.println("Shipment status for " + purchase.getItem().getItemName() + ": " + purchase.isShipped());
        }
    }
}
