package module7.homework5revised;

/**
 * Created by Mykhailo on 10/15/2016.
 */
public class DAOimpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println(room.getId() + " was saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.getId() + " was deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.getId() + " was deleted");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room result = new Room(id, 0, 0, null, null, null);
        System.out.println("Room " + id + "was found");
        return result;
    }
}
