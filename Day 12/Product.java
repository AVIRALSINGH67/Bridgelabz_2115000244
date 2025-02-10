abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}

class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class ECommercePlatform {
    public static void main(String[] args) {
        Product product1 = new Electronics(101, "Smartphone", 500);
        Product product2 = new Clothing(102, "Jacket", 100);
        System.out.println("Final Price for Electronics: " + (product1.getPrice() - product1.calculateDiscount()));
        System.out.println("Final Price for Clothing: " + (product2.getPrice() - product2.calculateDiscount()));
    }
}
