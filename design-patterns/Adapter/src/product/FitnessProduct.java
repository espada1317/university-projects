package product;

public class FitnessProduct implements Product {
    String name;
    int price;
    int quantity;

    public FitnessProduct(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getProduct() {
        return "product.FitnessProduct{ name = " + getName() + " , price = " + getPrice() + " , quantity = " + getQuantity() + " }";
    }
}
