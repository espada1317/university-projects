package order;

import stock.Stock;

public class SellStock implements Order {
    private final Stock abcStock;
    private final int quantity;

    public SellStock(Stock abcStock, int value){
        this.abcStock = abcStock;
        this.quantity = value;
    }

    public void execute() {
        abcStock.sell(quantity);
    }
}