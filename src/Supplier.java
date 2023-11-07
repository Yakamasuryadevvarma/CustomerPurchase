package CustomerPurchase;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String supplierName;
    private String supplierContact;
    private List<Purchase> shippedPurchases;

    public Supplier(String supplierName, String supplierContact) {
        this.supplierName = supplierName;
        this.supplierContact = supplierContact;
        this.shippedPurchases = new ArrayList<>();
    }

    public void shipItems(Purchase purchase, String deliveryAddress) {
        if (purchase != null && deliveryAddress != null && !deliveryAddress.isEmpty()) {
            // Assuming purchase is an instance of the Purchase class
            // Mark the purchase as shipped and store it in the list of shipped purchases
            purchase.setShipped(true);
            shippedPurchases.add(purchase);
            System.out.println("Shipped items to " + deliveryAddress);
        } else {
            System.out.println("Invalid purchase or delivery address.");
        }
    }

    // Getters and setters for supplierName and supplierContact

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
    }
}
