package order;

import stock.Stock;

public class BuyStock implements Order {
    private final Stock abcStock;
    private final int quantity;

    public BuyStock(Stock abcStock, int value){
        this.abcStock = abcStock;
        this.quantity = value;
    }

    public void execute() {
        abcStock.buy(quantity);
    }
}