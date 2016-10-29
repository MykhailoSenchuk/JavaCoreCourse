package module7.homework5revised;

import java.util.ArrayList;

/**
 * contains one method
 Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {
    ArrayList<Room> findRooms(int price, int persons, String city, String hotel);
    ArrayList<Room> getAllRooms();
}
