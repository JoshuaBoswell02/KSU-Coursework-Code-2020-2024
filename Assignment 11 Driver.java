
public class Driver {
    public static void main(String[] args){
        CreditCard masterCard = new CreditCard();
        CardHolder holder = new CardHolder(masterCard,"John");
        CardHolder holderTwo = new CardHolder(masterCard,"Mary");

        Thread John = new Thread(holder);
        Thread Mary = new Thread(holderTwo);

        John.start();
        Mary.start();

    }
}
