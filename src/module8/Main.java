package module8;

import module7.homework.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mykhailo on 10/31/2016.
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        AbstractDAO<String>  stringDB= new AbstractDAOimpl();
        System.out.println(stringDB.save(list.get(1) ) );
        stringDB.delete(list.get(1) );
        System.out.println(stringDB.getList());
        stringDB.saveAll(list);
        System.out.println(stringDB.getList());
        stringDB.deleteAll(list);
        System.out.println(stringDB.getList());

        UserDAO userDB = new UserDAO();
        List<User> users = new ArrayList<>();
        User user0 = new User(123,"User0","LastName0","City21",10000);
        User user1 = new User(124,"User1","LastName1","City15",10000);
        User user2 = new User(125,"User2","LastName2","City21",10000);
        User user3 = new User(126,"User3","LastName3","City15",10000);
        User user4 = new User(127,"User4","LastName4","City2",10000);

        users.add(user0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        userDB.saveUser(user0);
        System.out.println(userDB.getListofUsers());
        userDB.deleteUser(user0);
        System.out.println(userDB.getListofUsers());

        userDB.saveAllUsers(users);
        System.out.println(userDB.getListofUsers());
        userDB.deleteAllUsers(users);
        System.out.println(userDB.getListofUsers());













    }

}
