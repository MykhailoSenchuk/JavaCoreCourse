package module8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mykhailo on 10/31/2016.
 */
public class AbstractDAOimpl<T> implements AbstractDAO<T>{
    List<T> db = new ArrayList<>();


    @Override
    public T save(T element) {
        db.add(element);
        return element;
    }

    @Override
    public void delete(T element) {
        db.remove(element);
    }

    @Override
    public void deleteAll(List<T> list) {
        db.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        db.addAll(list);
    }

    @Override
    public List getList() {
        return db;
    }
}
