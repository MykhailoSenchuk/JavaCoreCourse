package module5.homework;

/**
 * contains one method
 Room[] findRooms(int price, int persons, String city, String hotel)
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAllRooms();
}
