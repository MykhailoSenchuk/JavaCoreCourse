package module7.homework5revised;

import java.sql.Date;
import java.util.ArrayList;

/**
 Every implementation has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class BookingComAPI implements API {

    ArrayList<Room> rooms;

    public BookingComAPI() {
        rooms = new ArrayList<>();
        rooms.add(new Room(123,1000,1, new Date (2016-9-1), "Khreshchatyk", "Kyiv") );
        rooms.add(new Room(124,1000,1, new Date (2016-9-1), "Premier palace", "Dnipro") );
        rooms.add(new Room(125,1000,3, new Date (2016-9-1), "Alfavito", "Zhytomyr") );
        rooms.add(new Room(126,1000,1, new Date (2010-9-1), "Radisson", "Lviv") );
        rooms.add(new Room(127,1000,1, new Date (2016-9-1), "Ukraine", "Odessa") );
    }


    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> result = new ArrayList<>();

        for (Room room : rooms) {
            if(room.getPrice() == price && room.getPersons() == persons && city.equals(room.getCityName()) && hotel.equals(room.getHotelName()) ){
                result.add(room);
            }
        }

        return result;
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        return rooms;
    }
}
