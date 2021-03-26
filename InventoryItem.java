package StevenDLL;

public class InventoryItem {
    static int nextID = 0;
    int productID;
    String title;
    String storeLocation;
    String aisleNumber;
    int quantity;
    double price;

    public InventoryItem() {
        this.productID = nextUniqueID();
        this.title = "Default Title";
        this.aisleNumber = "13A";
        this.storeLocation = "New York";
        this.quantity = 1;
        this.price = 9.99;
    }

    private int nextUniqueID() {

        return ++nextID;
    }

    public String getProductID() {
        return Integer.toString(this.productID);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAisleNumber() {
        return this.aisleNumber;
    }

    public void setDescription(String newAisleNumber) {
        this.aisleNumber = newAisleNumber;
    }

    public String getStoreLocation() {
        return this.storeLocation;
    }

    public void setStoreLocation(String newLocation) {
        this.storeLocation = newLocation;
    }

    public String getQuantity() {
        return Integer.toString(this.quantity);
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public String getPrice() {
        return String.valueOf(this.price);
    }
}
