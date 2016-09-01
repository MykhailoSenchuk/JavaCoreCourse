package module2.hometask;

/**
 * Created by Mykhailo on 8/30/2016.
 */
public class Task2 {
    private double balance;
    private final static double COMMISSION = 0.05;

    public Task2(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        double balance = 1000;
        Task2 task = new Task2(balance);

        double withdrawal = 950;

        boolean success = task.transaction (withdrawal);
        System.out.println(success ? "OK, commission is " + withdrawal*COMMISSION + ", balance after withdrawal " +  task.balance: "NO, transaction failed"  );
    }
    public boolean transaction ( double withdrawal ){
        if( balance > withdrawal * (1 + COMMISSION ) ) {
            balance -= withdrawal * (1 + COMMISSION) ;
            return true;
        }
        return false;
    }
}
