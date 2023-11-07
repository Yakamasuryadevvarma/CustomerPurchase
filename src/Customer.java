package CustomerPurchase;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerName;
    private String contactInformation;
    private String billingInformation;
    private List<Item> itemsPurchased;

    public Customer(String customerName, String contactInformation, String billingInformation) {
        this.customerName = customerName;
        this.contactInformation = contactInformation;
        this.billingInformation = billingInformation;
        this.itemsPurchased = new ArrayList<>();
    }

    public void makePurchase(Item item, int quantity) {
        if (quantity > 0) {
            // Create a purchase and add it to the list of items purchased
            Purchase purchase = new Purchase(item, quantity);
            itemsPurchased.add(purchase);
        } else {
            System.out.println("Invalid quantity for purchase.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Purchase purchase : itemsPurchased) {
            totalCost += purchase.calculatePurchaseCost();
        }
        return totalCost;
    }

    // Getters and setters for customerName, contactInformation, and billingInformation

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getBillingInformation() {
        return billingInformation;
    }

    public void setBillingInformation(String billingInformation) {
        this.billingInformation = billingInformation;
    }
}
