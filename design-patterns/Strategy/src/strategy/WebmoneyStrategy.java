package strategy;

public class WebmoneyStrategy implements PaymentStrategy {

    private final String wmid;
    private final String purseId;
    private double amountOnPurse;

    public WebmoneyStrategy(String wmid, String purseId, double amountOnPurse) {
        this.wmid = wmid;
        this.purseId = purseId;
        this.amountOnPurse = amountOnPurse;
    }

    @Override
    public void pay(int amount) {
        if(amount <= amountOnPurse) {
            amountOnPurse -= amount;
            System.out.println(amount +" paid with webmoney");
        } else {
            System.out.println("Declined. Not enough amount on webmoney.");
        }
    }

    @Override
    public String toString() {
        return "WebmoneyStrategy{" +
                "WMID='" + wmid + '\'' +
                ", purseId='" + purseId + '\'' +
                ", amountOnPurse=" + amountOnPurse +
                '}';
    }
}
