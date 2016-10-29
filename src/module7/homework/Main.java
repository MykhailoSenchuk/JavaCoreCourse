package module7.homework;

import java.util.*;

import static java.lang.StrictMath.random;

/*
 done ЗАДАНИЕ 1
 Class User class that should contain fields

 long id
 String firstName
 String lastName
 String city
 int balance

 Class Order:

 long id
 int price
 Currency currency
 String itemName
 String shopIdentificator
 User user

 ЗАДАНИЕ 2

 Create Main class where you create 10 Orders with 10 Users and put it to the List

 done- sort list by Order price in decrease order done
 done- sort list by Order price in increase order AND User city
 done- sort list by Order itemName AND ShopIdentificator AND User city

 done- delete duplicates from the list
 done- delete items where price less than 1500
 done- separate list for two list - orders in USD and UAH
 done- separate list for as many lists as many unique cities are in User

 done ЗАДАНИЕ 3

 Create Main class where you create 10 Orders with 10 Users and put it to the TreeSet. You should create 8 unique and two duplicated Orders

 - check if set contain Order where User’s lastName is - “Petrov”
 - print Order with largest price using only one set method - get
 - delete orders where currency is USD using Iterator

 done ЗАДАНИЕ 4

 User appropriate data structures in Homework in module 5 - all arrays should be replaced.

 ЗАДАНИЕ 5.

 Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution of the following methods and print it to console:
 - add
 - set
 - get
 - remove
 */
public class Main {

    public static void main(String[] args) {
        User user0 = new User(123,"User0","LastName0","City21",10000);
        User user1 = new User(124,"User1","LastName1","City15",10000);
        User user2 = new User(125,"User2","LastName2","City21",10000);
        User user3 = new User(126,"User3","LastName3","City15",10000);
        User user4 = new User(127,"User4","LastName4","City2",10000);
        User user5 = new User(128,"User5","LastName5","City7",10000);
        User user6 = new User(129,"User6","LastName6","City1",10000);
        User user7 = new User(130,"User7","LastName7","City2",10000);
        User user8 = new User(131,"User8","LastName8","City21",10000);
        User user9 = new User(132,"User9","LastName9","City1",10000);

        Order order0 = new Order(1,600,Currency.UAH,"item0","shop0",user0);
        Order order1 = new Order(2,600,Currency.UAH,"item0","shop0",user0);
        Order order2 = new Order(3,700,Currency.UAH,"item2","shop0",user2);
        Order order3 = new Order(4,10000,Currency.USD,"item3","shop0",user3);
        Order order4 = new Order(5,10,Currency.UAH,"item4","shop0",user4);
        Order order5 = new Order(6,1800,Currency.USD,"item5","shop1",user5);
        Order order6 = new Order(7,100,Currency.UAH,"item3","shop1",user6);
        Order order7 = new Order(8,24,Currency.USD,"item2","shop1",user7);
        Order order8 = new Order(9,150,Currency.UAH,"item1","shop1",user8);
        Order order9 = new Order(10,888,Currency.USD,"item0","shop1",user9);


        List<Order> list = new ArrayList<>();
        list.add(order0);
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);

        //sort list by Order price in decrease order done
        Comparator<Order> descendingPrice = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };
        list.sort(descendingPrice);
        System.out.println("******decreace sort by price***************");
        list.forEach(System.out::println);

        //sort list by Order price in increase order AND User city
        Comparator<Order> ascendingPriceCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if( o1.user.getCity().equals(o2.user.getCity() ) ) return o1.getPrice() - o2.getPrice();
                return o1.user.getCity().compareTo(o2.user.getCity());
            }
        };
        list.sort(ascendingPriceCity);
        System.out.println("******increace sort by price and city***************");
        list.forEach(System.out::println);

        //sort list by Order itemName AND ShopIdentificator AND User city

        Comparator<Order> itemNameShopCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int result;
                result = o1.getItemName().compareTo(o2.getItemName() );
                if(result == 0 )
                    result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator() );
                if(result == 0)
                    result = o1.user.getCity().compareTo(o2.user.getCity());
                return result;
            }
        };
        list.sort(itemNameShopCity);
        System.out.println("******list by Order itemName AND ShopIdentificator AND User city***************");
        list.forEach(System.out::println);

        //delete duplicates from the list
        Set<Order> uniqueList = new HashSet<>(list);
        System.out.println("******unique orders list***************");
        uniqueList.forEach(System.out::println);

        //delete items where price less than 1500
        List<Order> priceLimit = new ArrayList<>(list);
        Iterator<Order> i = priceLimit.iterator();

        while(i.hasNext()){
            Order order = i.next();
            if(order.getPrice() < 1500)
                i.remove();
        }
        System.out.println("******Orders where price more than 1500***************");
        priceLimit.forEach(System.out::println);

        //separate list for two list - orders in USD and UAH
        List<Order> odrersUAH = new ArrayList<>();
        List<Order> odrersUSD = new ArrayList<>();

        i = list.iterator();
        while(i.hasNext()){
            Order order = i.next();
            if(order.getCurrency().equals(Currency.UAH))
                odrersUAH.add(order);
            if(order.getCurrency().equals(Currency.USD))
                odrersUSD.add(order);
        }
        System.out.println("******Orders in UAH***************");
        odrersUAH.forEach(System.out::println);
        System.out.println("******Orders in USD***************");
        odrersUSD.forEach(System.out::println);


        //separate list for as many lists as many unique cities are in User
        Set<String> uniqueCities = new HashSet<>();
        i = list.iterator();
        while(i.hasNext()){
            Order order = i.next();
            uniqueCities.add(order.user.getCity());
        }
        Iterator<String> i1 = uniqueCities.iterator();
        List<List<Order>> listsByCity= new ArrayList<>();
        int counter = 0;
        while(i1.hasNext()){
            String cityName = i1.next();
            listsByCity.add(new ArrayList<Order>());
            i = list.iterator();
            while(i.hasNext()){
                Order order = i.next();
                if(order.user.getCity().equals(cityName))
                    listsByCity.get(counter).add(order);
            }
            counter++;
        }

        System.out.println("******separate list for as many lists as many unique cities are in User***************");
        listsByCity.forEach(System.out::println);




    }
}
