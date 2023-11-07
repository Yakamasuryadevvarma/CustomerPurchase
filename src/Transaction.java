package CustomerPurchase;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private Date transactionDate;
    private double paymentAmount;
    private String paymentMethod;
    private String paymentStatus;
    private String shipmentTrackStatus;
    private Double shipmentDate;  // Assuming shipmentDate can be null
    private String shippingInfo;

    private List<Purchase> purchases;

    public Transaction(Date transactionDate, double paymentAmount, String paymentMethod) {
        this.transactionDate = transactionDate;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pending";  // Initial payment status
        this.shipmentTrackStatus = "Not Shipped";  // Initial shipment status
        this.shipmentDate = null;
        this.shippingInfo = "";
        this.purchases = new ArrayList<>();
    }

    public void addItem(Item item, int quantity) {
        if (item != null && quantity > 0) {
            Purchase purchase = new Purchase(item, quantity);
            purchases.add(purchase);
        } else {
            System.out.println("Invalid item or quantity.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Purchase purchase : purchases) {
            totalCost += purchase.calculatePurchaseCost();
        }
        return totalCost;
    }

    // Getters and setters for transactionDate, paymentAmount, paymentMethod, paymentStatus,
    // shipmentTrackStatus, shipmentDate, and shippingInfo

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getShipmentTrackStatus() {
        return shipmentTrackStatus;
    }

    public void setShipmentTrackStatus(String shipmentTrackStatus) {
        this.shipmentTrackStatus = shipmentTrackStatus;
    }

    public Double getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Double shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(String shippingInfo) {
        this.shippingInfo = shippingInfo;
    }
}
