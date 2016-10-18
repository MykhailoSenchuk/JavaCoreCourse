package module6.homework;

import java.util.Objects;

/**
 *
 * long id
 String firstName
 lastName
 int salary
 int balance

 and constructor with all fields.
 */
public class User {
    long id;
    String firstName;
    String lastName;
    int salary;
    int balance;

    @Override
    public boolean equals(Object o) {
        User obj = (User) o;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass() )
            return false;
        if ( id != obj.id)
            return  false;
        if ( !firstName.equals(obj.firstName))
            return false;
        if (!lastName.equals(obj.lastName))
            return false;
        if (salary!= obj.salary)
            return false;
        if (balance != obj.balance)
            return false;
        return true;
    }

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }


}
