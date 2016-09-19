package module4.hometask;

/**
 * Created by Mykhailo on 9/16/2016.
 */
public class User{
    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name + " balance amount: " + balance;
    }

}
