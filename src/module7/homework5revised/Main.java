package module7.homework5revised;
/*
*
 *
 You need to create part of the System that can find hotel rooms for booking and save it to DataBase.
 The architecture is: class Room which represent room entity that is used in system.
 Interface API and three implementations of it. DAO interface with its implementation.
 And finally Controller that will contain all the logic. Also create Main class with Main method to demonstrate results.
 Create UML diagrams first, and only after this write code.

 !ЗАДАНИЕ 1
 Class Room should contain fields
 long id
 int price
 int persons
 Date dateAvailableFrom
 String hotelName
 String cityName
 Generate getters and setters. And create constructor with all fields.

 !ЗАДАНИЕ 2
 Override equals and hashCode methods. Rooms are equal when price, persons and cityName are equal.

 !ЗАДАНИЕ 3
 Create API interface which contains one method
 Room[] findRooms(int price, int persons, String city, String hotel)

 ЗАДАНИЕ 4
 Create three implementations of API called: BookingComAPI, TripAdvisorAPI, GoogleAPI.0
 Every implementation has global variable Room[] rooms which must be initialized in empty constructor with 5 differentRooms.

 ЗАДАНИЕ 5
 Create DAO interface and its implementation. Methods print operation name and object which was used.
 Room save(Room room)
 boolean delete(Room room)
 Room update(Room room)
 Room findById(long id)

 ЗАДАНИЕ 6
 Create Controller class. It contains global variable
 API apis[] = new API[3];
 which contains all impelentations of API interface.
 Also, controller contains two methods
 Room[] requstRooms(int price, int persons, String city, String hotel)
 which finds all the rooms with requested params. Method use all apis available to make search.
 Found rooms create to DB

 Room[] check(API api1, API api2)
 Chech how many the same rooms two different apis return
 ЗАДАНИЕ 7

 In Main class method just create Controller and make three requests with different parameters to find rooms.
 Also, all check methods three times with different apis to demonstrate how programs works.
*/

import java.util.LinkedList;
public class Main {
    /*public static void printRooms(Room[]rooms){
        for (int i = 0; i < rooms.length; i++){
            System.out.println("ID: " + rooms[i].getId());
            System.out.println("Price: " + rooms[i].getPrice());
            System.out.println("city name: " + rooms[i].getCityName() );
            System.out.println("city name: " + rooms[i].getHotelName() );
            System.out.println("Persons: " + rooms[i].getPersons() );
        }
    }*/
    public static void main(String[] args) {

        Controller any = new Controller();
        LinkedList<Room> check = any.check(any.apis.get(0), any.apis.get(2));
        System.out.println("check result:");
        check.forEach(System.out::println);

        System.out.println("----------------------------");
        LinkedList<Room> request =any.requestRooms(1000,1,"Kyiv", "Khreshchatyk");

        System.out.println("requestRooms result:");
        request.forEach(System.out::println);
    }

}
