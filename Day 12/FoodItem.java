abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + 2) * getQuantity(); // Additional charge for non-veg
    }
}

interface Discountable {
    void applyDiscount();
    double getDiscountDetails();
}

class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Pizza", 10, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 12, 1);
        System.out.println("Total for Veg Item: " + vegItem.calculateTotalPrice());
        System.out.println("Total for Non-Veg Item: " + nonVegItem.calculateTotalPrice());
    }
}
