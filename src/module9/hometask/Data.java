package module9.hometask;

import module7.homework.Currency;
import module7.homework.Order;
import module7.homework.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Data {
    private User user0 = new User(123,"User0","LastName0","City21",10000);
    private User user1 = new User(124,"User1","LastName1","City15",10000);
    private User user2 = new User(125,"User2","LastName2","City21",10000);
    private User user3 = new User(126,"User3","LastName3","City15",10000);
    private User user4 = new User(127,"User4","LastName4","City2",10000);
    private User user5 = new User(128,"User5","LastName5","City7",10000);
    private User user6 = new User(129,"User6","LastName6","City1",10000);
    private User user7 = new User(130,"User7","LastName7","City2",10000);
    private User user8 = new User(131,"User8","LastName8","City21",10000);
    private User user9 = new User(132,"User9","Petrov","City1",10000);

    private Order order0 = new Order(1,600, Currency.UAH,"item0","shop0",user0);
    private Order order1 = new Order(2,600,Currency.UAH,"item0","shop0",user0);
    private Order order2 = new Order(3,700,Currency.UAH,"item2","shop0",user2);
    private Order order3 = new Order(4,10000,Currency.USD,"item3","shop0",user3);
    private Order order4 = new Order(5,10,Currency.UAH,"item4","shop0",user4);
    private Order order5 = new Order(6,1800,Currency.USD,"item5","shop1",user5);
    private Order order6 = new Order(7,100,Currency.UAH,"item3","shop1",user6);
    private Order order7 = new Order(8,24,Currency.USD,"item2","shop1",user7);
    private Order order8 = new Order(9,150,Currency.UAH,"item1","shop1",user8);
    private Order order9 = new Order(10,888,Currency.USD,"item0","shop1",user9);

    List<Order> orders = new ArrayList<>(Arrays.asList(
            order0, order1, order2, order3, order4, order5, order6, order7, order8, order9));

}
