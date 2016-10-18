package module6.homework;

/*

 You need to create two classes ArraysUtils and UserUtils with static and final methods and use ArraysUtils methods in HW2 to symplify it.

 ЗАДАНИЕ 1

 Create ArraysUtils with following methods

 sum(int array[])
 min(int array[])
 max(int array[])
 maxPositive(int array[])
 multiplication  (int array[])
 modulus(int array[])
 secondLargest(int array[])

 these should be just copied from your HW2.

 In addition add new methods

 int[] reverse(int[] array)
 int[] findEvenElements(int[] array)


 ЗАДАНИЕ 2

 In HW2 use methods from your ArraysUtils.


 ЗАДАНИЕ 3

 Make sure nobody can inherit your ArraysUtils.


 ЗАДАНИЕ 4

 Create User class with fileds

 long id
 String firstName
 lastName
 int salary
 int balance

 and constructor with all fields.


 ЗАДАНИЕ 5

 Create сlass UserUtils with following methods

 User[] uniqueUsers(User[] users)
 //users are equal when all their field are equal
 User[] usersWithContitionalBalance(User[] users, int balance)
 //user’s balance == balance
 User[] paySalaryToUsers(User[] users)
 long[] getUsersId(User[] users)
 User[] deleteEmptyUsers(User[] users)
 Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.

 ЗАДАНИЕ 6

 Create Main class with main method where you need to create some test users and demonstrate how every method from UserUtils work.
*/

import module6.homework.UserUtils;

public class Main {


    public static void main(String[] args) {
        User[] users = new User[6];
        users[0] = new User(123,"Pavlo","Pavlov", 5000, 10000);
        users[1] = new User(124,"Pavlo","Pavlov", 5000, 10000);
        users[2] = new User(123,"Pavlo","Pavlov", 5000, 10000);
        users[3] = new User(123,"Pavlo","Pavlov", 5000, 10000);
        users[4] = new User(123,"Pavlo","Pavlov", 5000, 5000);
        users[5] = null;


        System.out.println("_____________________________________");
        System.out.println("Unique users:");
        UserUtils.printUsers(UserUtils.uniqueUsers(users));

        int balance = 10000;
        System.out.println("_____________________________________");
        System.out.println("Users with balance " + balance + ":");
        UserUtils.printUsers( UserUtils.usersWithContitionalBalance(users,balance) );

        System.out.println("_____________________________________");
        System.out.println("Users after salary:");
        UserUtils.printUsers( UserUtils.paySalaryToUsers(users));

        System.out.println("_____________________________________");
        System.out.println("Users IDs:");
        ArraysUtils.printArray( UserUtils.getUsersId(users) );

        System.out.println("_____________________________________");
        System.out.println("Users after deleteEmptyUsers:");
        UserUtils.printUsers( UserUtils.deleteEmptyUsers(users));

    }
}
