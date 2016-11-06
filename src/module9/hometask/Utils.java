package module9.hometask;

import module7.homework.Currency;
import module7.homework.Order;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Mykhailo on 11/5/2016.
 * Methods for Main Class
 */
public class Utils {
    static Collection<Order> descendingSortByPrice(Collection<Order> orders){
        return orders.stream()
                .sorted((o1, o2) -> o2.getPrice() - o1.getPrice() )
                .collect(Collectors.toList());
    }
    static Collection<Order> getOrdersByCurrency(Collection<Order> orders, Currency currency){

        Collection<Order> ordersByCurrency = new ArrayList<>();
        orders.stream()
            .filter(o -> o.getCurrency() == currency)
            .forEach(ordersByCurrency::add);
        return ordersByCurrency;
    }

    static Collection<Order> ascendingSortByPriceCity(Collection<Order> orders){
    return orders.stream()
            .sorted((o1,o2) -> {
                if (o1.getPrice() == o2.getPrice() )
                    return o1.getUser().getCity().compareTo( o2.getUser().getCity() );
                return o1.getPrice() - o2.getPrice();
            })
            .collect(Collectors.toList());
    }

    static Collection<Order> deletePriceLessThen(Collection<Order> orders, int price){
        return orders.stream()
                .filter(o -> o.getPrice() < price)
                .collect(Collectors.toList());
    }

    static Collection<Order> sortByCityShopItemName(Collection<Order> orders){
        Comparator<Order> itemNameShopCity = (o1, o2) -> {
            int result;
            result = o1.getItemName().compareTo(o2.getItemName() );
            if(result == 0 )
                result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator() );
            if(result == 0)
                result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return result;
        };
        return orders.stream()
                .sorted(itemNameShopCity)
                .collect(Collectors.toList());
    }

    static Collection<Order> getUniqueOrders(Collection<Order> orders){
        return orders.stream()
                .distinct()
                .collect(Collectors.toList());
    }


    static Map<String, ArrayList<Order>> getOrdersByCity(Collection<Order> orders){
        Map<String, ArrayList<Order>> OrdersByCity = new HashMap<>();
        orders.forEach(o -> OrdersByCity
                .put(o.getUser().getCity(), new ArrayList<>()));
        orders.forEach(
                o -> OrdersByCity.get( o.getUser().getCity() )
                .add(o)
        );
        return OrdersByCity;
    }

    static boolean checkLastName(String lastName, Collection<Order> set){
        return set.stream()
                .anyMatch(o -> lastName.equals( o.getUser().getLastName() ) );
    }



}
