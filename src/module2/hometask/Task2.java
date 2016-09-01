package module2.hometask;

/**
 * Created by Mykhailo on 8/30/2016.
 */
public class Task2 {
    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 100;
        balance = withdrawBalance(balance, withdrawal);
        if(balance >= 0)
            System.out.println("OK " + withdrawal * 0.05 + " " + balance);
        else
            System.out.println("NO");
    }
    public static double withdrawBalance(double balance, double withdrawal){
        return balance - withdrawal * (1 + 0.05) ;
    }
}
