package module2.hometask;

/**
 * Created by Mykhailo on 8/31/2016.
 */
public class Task3 {
    public static void main(String[] args) {
        String ownerName = "Ann";
        double withdrawal = 100;
        double balance = withdrawBalance(ownerName, withdrawal);
        if(balance >= 0)
            System.out.println(ownerName + " " + withdrawal + " " + balance);
        else
            System.out.println(ownerName + " NO");
    }
    static double withdrawBalance(String ownerName, double withdrawal){
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
            return balances[index] - withdrawal * (1 + 0.05);
        return -1;
    }

}
