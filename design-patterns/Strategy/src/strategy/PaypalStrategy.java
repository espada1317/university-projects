package strategy;

public class PaypalStrategy implements PaymentStrategy {

    private final String emailId;
    private final String password;
    private double amountOnAccount;

    public PaypalStrategy(String email, String pwd, int amountOnAccount){
        this.emailId = email;
        this.password = pwd;
        this.amountOnAccount = amountOnAccount;
    }

    @Override
    public void pay(int amount) {
        if(amount <= amountOnAccount) {
            amountOnAccount -= amount;
            System.out.println(amount +" paid with paypal");
        } else {
            System.out.println("Declined. Not enough amount on paypal.");
        }
    }

    @Override
    public String toString() {
        return "PaypalStrategy{" +
                "emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", amountOnAccount=" + amountOnAccount +
                '}';
    }
}