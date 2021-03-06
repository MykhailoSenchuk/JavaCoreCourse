package module5.homework;

import java.sql.Date;

/**
 * Every implementation has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.
 */
public class TripAdvisorAPI implements API {
    Room[] rooms;

    public TripAdvisorAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(323,1000,1, new Date(2016-9-1),  "Khreshchatyk", "Kyiv");
        rooms[1] = new Room(324,1000,1, new Date (2016-9-1), "Premier palace", "Dnipro");
        rooms[2] = new Room(325,1000,1, new Date (2016-9-1), "Alfavito", "Zhytomyr");
        rooms[3] = new Room(326,1000,1, new Date (2016-9-1), "Radisson", "Lviv");
        rooms[4] = new Room(327,1000,1, new Date (2016-9-1), "Ukraine", "Odessa");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room [] resultBuffer = new Room [rooms.length];
        Room [] result;
        int resultIndex = 0;
        for (Room room : rooms) {
            if(room.getPrice() == price && room.getPersons() == persons && city.equals(room.getCityName()) && hotel.equals(room.getHotelName()) ){
                resultBuffer[resultIndex] = room;
                resultIndex ++;
            }
        }
        result = new Room [resultIndex];
        for (int i = 0; i < resultIndex; i++){
            result[i] = resultBuffer[i];
        }
        return result;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
