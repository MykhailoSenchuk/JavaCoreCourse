package module2.hometask;

/**
 * Created by Mykhailo on 8/31/2016.
 */
public class Task3 {
    private String[] ownerNames;
    private double[] balances;
    private final static double COMMISSION = 0.05;

    private Task3(String[] ownerNames, double[] balances) {
        this.ownerNames = ownerNames;
        this.balances = balances;
    }

    public static void main(String[] args) {
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        Task3 task = new Task3(ownerNames, balances );//add arrays to constructor

        String ownerName = "Jack";// name of the owner that makes withdrawal
        double withdrawal = 1000;

        int index = task.search(ownerName);// search for index of the owner in given array
        boolean success = task.transaction(index, withdrawal); //make transaction

        System.out.println(success ? "OK, commission is " + withdrawal*COMMISSION + ", balance after withdrawal " +  task.balances[index]: "NO, transaction failed");
    }
    //returns index of searched word in array of Strings or -1 if there are no such word
    public int search (String word){
        int index;
        boolean found = false;
        for( index = 0; index < ownerNames.length; index++ ) {
            if (word == ownerNames[index]) {
                found = true;
                break;
            }
        }
        if(found)
            return index;
        else
            return -1;
    }
    //makes transaction, return true if successful
    public boolean transaction (int index, double withdrawal){
        if( index == -1 )//returns false if owner name haven't been found by "search"
            return false;
        if( balances[index] > withdrawal * (1 + COMMISSION) ) {
            balances[index] -= withdrawal * (1 + COMMISSION);
            return true;
        }
        return false;
    }


}
