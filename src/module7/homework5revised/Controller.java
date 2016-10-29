package module7.homework5revised;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Create Controller class. It contains global variable
 API apis[] = new API[3];
 which contains all impelentations of API interface.
 Also, controller contains two methods
 Room[] requstRooms(int price, int persons, String city, String hotel)
 which finds all the rooms with requested params. Method use all apis available to make search.
 Found rooms create to DB

 Room[] check(API api1, API api2)
 Chech how many the same rooms two different apis return
 */
public class Controller{
    ArrayList<API> apis = new ArrayList<>();

    public Controller(){
        apis.add(new BookingComAPI() );
        apis.add(new GoogleAPI() );
        apis.add(new TripAdvisorAPI() );
    }

    //finds all the rooms with requested params. Method use all apis(Bookingcom, Google, Tripadvisor) available to make search.
    public LinkedList<Room> requestRooms(int price, int persons, String city, String hotel){

        LinkedList<Room> result = new LinkedList<>();
        DAO dao = new DAOimpl();

        for (API api:apis) {
            result.addAll(api.findRooms(price, persons, city, hotel));
        }
        for (Room room: result)
            dao.save(room);
        return result;
    }


    //Checks how many same rooms two different apis(Bookingcom, Google, Tripadvisor) return
    public LinkedList<Room> check(API api1, API api2){
        ArrayList<Room> roomSet1 = api1.getAllRooms();
        ArrayList<Room> roomSet2 = api2.getAllRooms();
        LinkedList<Room>  result = new  LinkedList<>(roomSet2);
        result.retainAll(roomSet1);
        return result;
    }


}
