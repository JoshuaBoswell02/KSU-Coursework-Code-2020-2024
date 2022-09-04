public class CreditCard {
    private double accountBalance = 5000.00f;

    public double getAccountBalance() {
        return accountBalance;
    }
    public void withdraw(double x){
        accountBalance = accountBalance - x;
    }
}
