package module6.homework;

/*
 User[] uniqueUsers(User[] users)
 //users are equal when all their field are equal
 User[] usersWithContitionalBalance(User[] users, int balance)
 //user’s balance == balance
 User[] paySalaryToUsers(User[] users)
 long[] getUsersId(User[] users)
 User[] deleteEmptyUsers(User[] users)
 Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.
 */
public class UserUtils {
    public static User[] uniqueUsers(User[] users){
        boolean[] notUnique = new boolean[users.length];
        User[] result;
        int resultIndex = 0;

        for (int i = 0; i < users.length; i++) {
            if(!notUnique[i]){
                resultIndex++;
                for (int k = i+1; k <users.length; k++){
                    if (users[i].equals(users[k])){
                        notUnique[k] = true;
                    }
                }
            }
        }

        result = new User[resultIndex];
        resultIndex = 0;
        for (int i = 0; i < notUnique.length; i++) {
            if( !notUnique[i] ) {
                result[resultIndex++] = users[i];
            }
        }
        return result;
    }
    public static User[] usersWithContitionalBalance(User[] users, int balance){
        boolean[] rightBalance = new boolean[users.length];
        User[] result;
        int resultIndex = 0;

        for (int i = 0; i < users.length; i++) {
            if(users[i] == null)
                continue;
            if(users[i].balance == balance){
                rightBalance[i] = true;
                resultIndex++;
            }
        }

        result = new User[resultIndex];
        resultIndex = 0;
        for (int i = 0; i < rightBalance.length; i++) {
            if( rightBalance[i] ) {
                result[resultIndex++] = users[i];
            }
        }
        return result;
    }

    public final static User[] paySalaryToUsers(User[] users){
        for (int i = 0; i < users.length; i++) {
            if(users[i] == null)
                continue;
            users[i].balance += users[i].salary;
        }
        return users;
    }

    public final static long[] getUsersId(User[] users){
        long[] usersID = new long[users.length];

        for (int i = 0; i < users.length; i++) {
            if(users[i] == null)
                continue;
            usersID[i] = users[i].id;
        }

        return usersID;
    }

    public static User[] deleteEmptyUsers(User[] users){
        boolean[] notEmpty = new boolean[users.length];
        User[] result;
        int resultIndex = 0;

        for (int i = 0; i < users.length; i++) {
            if(users[i] != null){
                notEmpty[i] = true;
                resultIndex++;
            }
        }

        result = new User[resultIndex];
        resultIndex = 0;
        for (int i = 0; i < notEmpty.length; i++) {
            if( notEmpty[i] ) {
                result[resultIndex++] = users[i];
            }
        }

        return result;
    }
    public static void printUsers(User[]users){
        for (int i = 0; i < users.length; i++){
            if(users[i]!= null) {
                System.out.println("First name: " + users[i].firstName);
                System.out.println("Last name: " + users[i].lastName);
                System.out.println("Salary: " + users[i].salary);
                System.out.println("Balance: " + users[i].balance);
            }
            else System.out.println("!!!!!!!null object");
        }
    }

}
