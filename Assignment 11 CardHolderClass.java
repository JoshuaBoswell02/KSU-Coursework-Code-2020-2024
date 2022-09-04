import static java.lang.Thread.sleep;

public class CardHolder implements Runnable {
    private CreditCard customerCard;
    private String name;

    CardHolder(){}
    CardHolder(CreditCard x, String y){
        customerCard = x;
        name = y;
    }
    @Override
    public void run(){
        for(int i = 0; i < 7; i++){
            makeWithdraw(500.00);
            if(customerCard.getAccountBalance() < 0){
                System.out.println("Error: Account below zero");
            }
        }
    }

    private synchronized void makeWithdraw(double amount){
        if(customerCard.getAccountBalance() < amount){
            System.out.println("Not enough in:" + name + " to withdrawal $" + amount + " Balance: " + customerCard.getAccountBalance());
        }else if(customerCard.getAccountBalance() >= amount){
            System.out.println( name + ", before withdrawing $" + amount +", Balance:$" + customerCard.getAccountBalance());
            try{
                sleep(6000);
            }catch(Exception e){
                System.out.println(e);
            }
            customerCard.withdraw(amount);
            System.out.println(name + ", after withdrawing $"+amount+", Balance:$"+customerCard.getAccountBalance());
        }
    }



}
