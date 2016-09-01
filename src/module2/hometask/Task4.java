package module2.hometask;

/**
 * Created by Mykhailo on 9/1/2016.
 */
public class Task4 {
    public static void main(String[] args) {
        String ownerName = "Ann";
        double fund = 100;
        double balance = fundBalance(ownerName, fund);
        if(balance >= 0)
            System.out.println(ownerName + " " + balance);
        else
            System.out.println(ownerName + " NO");
    }
    static double fundBalance(String ownerName, double fund){
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int index;
        boolean found = false;//indicates if ownerName was found in ownerNames array

        for( index = 0; index < ownerNames.length; index++ ) {
            if (ownerName == ownerNames[index]) {
                found = true;
                break;
            }
        }

        if(found)
            return balances[index] + fund;
        else
            return -1;
    }
}
