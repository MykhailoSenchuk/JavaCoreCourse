package module5.homework;

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
    API apis[] = new API[3];

    public Controller(){
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    //finds all the rooms with requested params. Method use all apis(Bookingcom, Google, Tripadvisor) available to make search.
    Room[] requestRooms(int price, int persons, String city, String hotel){

        Room[] resultBuffer = new Room[100];
        Room [] result;
        int resultIndex = 0;
        DAO dao = new DAOimpl();

        for (API api:apis) {

            Room[] searchResult = api.findRooms(price, persons, city, hotel);

            for(Room room : searchResult){
                resultBuffer[resultIndex] = room;
                resultIndex++;
            }
        }

        result = new Room [resultIndex];
        for (int i = 0; i < resultIndex; i++){
            result[i] = resultBuffer[i];
            dao.save(result[i]);
        }

        return result;
    }


    //Checks how many same rooms two different apis(Bookingcom, Google, Tripadvisor) return
    public Room[] check(API api1, API api2){
        Room[] roomSet1 = api1.getAllRooms();
        Room[] roomSet2 = api2.getAllRooms();
        Room[] resultBuffer = new Room[ roomSet1.length > roomSet2.length ? roomSet1.length : roomSet2.length ];
        int resultIndex = 0;
        Room[] result;

        //don't work if there are identical rooms  in one API
        for (Room room1 : roomSet1){
            for (Room room2 : roomSet2) {
                if (room1.equals(room2)) {
                    resultBuffer[resultIndex] = room2;
                    resultIndex++;
                }
            }
        }

        result = new Room [resultIndex];
        for (int i = 0; i < resultIndex; i++){
            result[i] = resultBuffer[i];
        }
        return result;

    }


}
