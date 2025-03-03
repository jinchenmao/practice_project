public class LuckinCoffee {
    // Public fields: store information
    public String storeAddress;
    public String storeHours;
    public long storePhoneNumber;
    public String storeEmail;
    public String storeWebsite;

    private String orderID;
    private String orderDetails;
    private double orderTotal;

    // Method to accept an order
    public void takeOrder(String id, String details, double total) {
        orderID = id;
        orderDetails = details;
        orderTotal = total;

        System.out.println("Order accepted!");

        // Simulate order preparation
        System.out.println("Order is being prepared");
        try {
            Thread.sleep(5000); // Pause for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");

        // Print the receipt
        printReceipt();
    }

    // Private method to print the receipt
    private void printReceipt() {
        System.out.println("********RECEIPT********");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Details: " + orderDetails);
        System.out.println("Order Total: " + orderTotal);
    }
}