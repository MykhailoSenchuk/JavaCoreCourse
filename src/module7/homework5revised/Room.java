package module7.homework5revised;

import java.util.Date;

/**
 * class Room which represent room entity that is used in system
 * Class Room should contain fields
 long id
 int price
 int persons
 Date dateAvailableFrom
 String hotelName
 String cityName
 Generate getters and setters. And create constructor with all fields.

 Override equals and hashCode methods.
 */
public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    //Rooms are equal when price, persons and cityName are equal.
    public boolean equals(Object o){
        Room obj = (Room) o;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        if ( price != obj.getPrice() )
            return false;
        if ( persons != obj.getPersons() )
            return false;
        if ( !cityName.equals( obj.getCityName()) )
            return false;
        return true;
    }

    @Override

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + persons;
        result = prime * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }



    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
