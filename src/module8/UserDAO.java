package module8;

import java.util.List;
import module7.homework.User;

/**
 * Created by Mykhailo on 10/31/2016.
 */
public class UserDAO extends AbstractDAOimpl<User> {

    public User saveUser(User user) {
        save(user);
        return user;
    }


    public void deleteUser(User user) {
        delete(user);
    }


    public void deleteAllUsers(List<User> users) {
        deleteAll(users);
    }


    public void saveAllUsers(List<User> users) {
        super.saveAll(users);
    }


    public List getListofUsers() {
        return getList();
    }
}
