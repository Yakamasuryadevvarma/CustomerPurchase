package CustomerPurchase;

public class ShipmentMethod {

    private String shippingMethod;
    private int arrivalDate;  // Assuming arrivalDate represents the number of days for arrival
    private String shippingInformation;
    private String shipmentStatus;

    public ShipmentMethod(String shippingMethod, int arrivalDate, String shippingInformation, String shipmentStatus) {
        this.shippingMethod = shippingMethod;
        this.arrivalDate = arrivalDate;
        this.shippingInformation = shippingInformation;
        this.shipmentStatus = shipmentStatus;
    }

    // Getters and setters for shippingMethod, arrivalDate, shippingInformation, and shipmentStatus

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public int getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(int arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getShippingInformation() {
        return shippingInformation;
    }

    public void setShippingInformation(String shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }
}
