package CustomerPurchase;

public class Item {

    private String itemName;
    private String itemDescription;
    private double unitPrice;

    public Item(String itemName, String itemDescription, double unitPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.unitPrice = unitPrice;
    }

    public double calculateTotalPrice(int quantity) {
        if (quantity > 0) {
            return unitPrice * quantity;
        } else {
            System.out.println("Invalid quantity for calculating total price.");
            return 0.0;
        }
    }

    // Getters and setters for itemName, itemDescription, and unitPrice

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
