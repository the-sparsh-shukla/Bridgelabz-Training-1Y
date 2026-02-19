class Item {
    int itemCode;
    String itemName;
    double price;

    void setDetails(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.setDetails(201, "Pen", 10);
        item.displayDetails();
        System.out.println("Total Cost: " + item.calculateTotalCost(5));
    }
}
