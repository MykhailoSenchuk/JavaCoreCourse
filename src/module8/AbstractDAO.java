package module8;

import java.util.Collection;
import java.util.List;

/**
 * Created by Mykhailo on 10/31/2016.
 */
public interface AbstractDAO <T> {
    T save(T element);
    void delete(T element);
    void deleteAll(List<T> list);
    void saveAll(List<T> list);
    List <T> getList();
}
