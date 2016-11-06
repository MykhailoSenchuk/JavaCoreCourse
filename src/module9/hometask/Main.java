package module9.hometask;

import module7.homework.Currency;
import module7.homework.Order;

import java.util.*;

/**
 * Created by Mykhailo on 11/5/2016.
 *   done - sort list by Order price in decrease order
     done - sort list by Order price in increase order AND User city
     done- sort list by Order itemName AND ShopIdentificator AND User city

 done- delete duplicates from the list
 done- delete items where price less than 1500
 done- separate list for two list - orders in USD and UAH
 done- separate list for as many lists as many unique cities are in User

     - check if set contain Order where User’s lastName is - “Petrov”
     - delete orders where currency is USD
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Collection<Order> orders = data.orders;

        // sort list by Order price in decrease order
        orders = Utils.descendingSortByPrice(orders);
        System.out.println("******decreace sort by price************************************************************");
        orders.forEach(System.out::println);

        //sort list by Order price in increase order AND User city
        orders = Utils.ascendingSortByPriceCity(orders);
        System.out.println("******increace sort by price and city****************************************************");
        orders.forEach(System.out::println);

        //sort list by Order itemName AND ShopIdentificator AND User city
        orders = Utils.sortByCityShopItemName(orders);
        System.out.println("******sort list by Order itemName AND ShopIdentificator AND User city****************************************************");
        orders.forEach(System.out::println);

        //delete duplicates from the list
        Collection<Order> uniqueOrders = Utils.getUniqueOrders(orders);
        System.out.println("******List without duplicates****************************************************");
        uniqueOrders.forEach(System.out::println);

        //delete items where price less than 1500
        Collection<Order> lessThenOrders = Utils.deletePriceLessThen(orders, 1500);
        System.out.println("******List where price less than 1500****************************************************");
        lessThenOrders.forEach(System.out::println);

        // separate list for two list - orders in USD and UAH
        Collection<Order> ordersUSD = Utils.getOrdersByCurrency(orders, Currency.USD);
        Collection<Order> ordersUAH = Utils.getOrdersByCurrency(orders, Currency.UAH);

        System.out.println("******Orders in USD****************************************************");
        ordersUSD.forEach(System.out::println);
        System.out.println("******Orders in UAH****************************************************");
        ordersUAH.forEach(System.out::println);

        // separate list for as many lists as many unique cities are in User
        Map < String, ArrayList<Order> > OrdersByCity = Utils.getOrdersByCity(orders);
        System.out.println("******list for as many lists as many unique cities****************************************************");
        OrdersByCity.keySet()
                .forEach(o -> {
                    System.out.println(o);
                    OrdersByCity.get(o)
                            .forEach(System.out::println);
                });

        // creation of TreeSet
        orders = new TreeSet<>(orders);

        //check if set contain Order where User’s lastName is - “Petrov”
        System.out.println("set contain Order where User’s lastName is Petrov: " + Utils.checkLastName("Petrov",orders));

        //delete orders where currency is USD
        orders.removeAll(Utils.getOrdersByCurrency(orders, Currency.USD));
        System.out.println("Orders without USD:");
        ordersUAH.forEach(System.out::println);
    }

}
