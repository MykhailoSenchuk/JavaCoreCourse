package module2.hometask;

/**
 * Created by Mykhailo on 9/1/2016.
 */
public class Task4 {
    private String[] ownerNames;
    private double[] balances;

    private Task4(String[] ownerNames, double[] balances) {
        this.ownerNames = ownerNames;
        this.balances = balances;
    }

    public static void main(String[] args) {
        double[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        Task4 task = new Task4(ownerNames, balances );//add arrays to constructor

        String ownerName = "Lane";// name of the owner that funds money
        double fund = 100;

        int index = task.search(ownerName);// search for index of the owner in given array
        boolean success = task.transaction(index, fund); //make transaction

        System.out.println(success ? ownerName + " " + task.balances[index]:"Error");
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
    public boolean transaction (int index, double income){
        if( index == -1 )//returns false if owner name haven't been found by "search"
            return false;
        balances[index] += income;
        return true;
    }
}
