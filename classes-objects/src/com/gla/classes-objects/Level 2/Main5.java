class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        }
    }

    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Total Cost: " + (price * quantity));
    }
}

public class Main5 {
    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 50000, 1);
        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
