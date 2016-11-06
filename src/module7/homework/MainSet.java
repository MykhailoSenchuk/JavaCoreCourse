package module7.homework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


/**
 *  Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet. You should create 8 unique and two duplicated Orders

 done - check if set contain Order where User’s lastName is - “Petrov”
 done - print Order with largest price using only one set method - get
 done - delete orders where currency is USD using Iterator
 */
public class MainSet {
    public static boolean checkLastName(String lastName, Set<Order> set){
        Iterator<Order> i = set.iterator();
        while(i.hasNext()){
            Order order = i.next();
            if(order.getUser().getLastName().equals(lastName))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        User user0 = new User(123, "User0", "LastName0", "City21", 10000);
        User user1 = new User(124, "User1", "LastName1", "City15", 10000);
        User user2 = new User(125, "User2", "LastName2", "City21", 10000);
        User user3 = new User(126, "User3", "LastName3", "City15", 10000);
        User user4 = new User(127, "User4", "LastName4", "City2", 10000);
        User user5 = new User(128, "User5", "LastName5", "City7", 10000);
        User user6 = new User(129, "User6", "LastName6", "City1", 10000);
        User user7 = new User(130, "User7", "LastName7", "City2", 10000);
        User user8 = new User(131, "User8", "LastName8", "City21", 10000);
        User user9 = new User(132, "User9", "Petrov", "City1", 10000);

        Order order0 = new Order(1, 600, Currency.UAH, "item0", "shop0", user0);
        Order order1 = new Order(2, 600, Currency.UAH, "item0", "shop0", user0);
        Order order2 = new Order(3, 700, Currency.UAH, "item2", "shop0", user2);
        Order order3 = new Order(4, 10000, Currency.USD, "item3", "shop0", user3);
        Order order4 = new Order(5, 10, Currency.UAH, "item4", "shop0", user4);
        Order order5 = new Order(6, 1800, Currency.USD, "item5", "shop1", user5);
        Order order6 = new Order(7, 100, Currency.UAH, "item3", "shop1", user6);
        Order order7 = new Order(8, 24, Currency.USD, "item2", "shop1", user7);
        Order order8 = new Order(9, 150, Currency.UAH, "item1", "shop1", user8);
        Order order9 = new Order(10, 888, Currency.USD, "item0", "shop1", user9);

        TreeSet<Order> set = new TreeSet<>();
        set.add(order0);
        set.add(order1);
        set.add(order2);
        set.add(order3);
        set.add(order4);
        set.add(order5);
        set.add(order6);
        set.add(order7);
        set.add(order8);
        set.add(order9);

        //check if set contain Order where User’s lastName is - “Petrov”
        System.out.println("set contain Order where User’s lastName is Petrov: " + checkLastName("Petrov",set));

        //print Order with largest price using only one set method - get
        System.out.println("Order with largest price:" );
        System.out.println(set.last() );

        //delete orders where currency is USD using Iterator
        Iterator<Order> i = set.iterator();
        while(i.hasNext()){
            Order order = i.next();
            if(order.getCurrency().equals(Currency.USD))
                i.remove();
        }
        System.out.println("Orders without USD:");
        set.forEach(System.out::println);
    }
}
