package module3.hometask.task3_4;

/**
 * Created by Mykhailo on 9/13/2016.
 */
public class User {
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, double balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //add salary to the balance of the user
    public void paySalary(){
        if(salary > 0)
            balance += salary;
    }

    //takes money from the balance with 5% commission if summ < 1000 and 10% commission in other cases
    public void withdraw(int sum){
        double commission;
        if(sum < 1000 && sum > 0 && balance >= sum * 1.05) {
            commission = sum * 0.05;
            balance -= sum + commission;
        }
        else if (sum >= 1000 && balance >= sum * 1.1){
            commission = sum * 0.1;
            balance -= sum + commission;
        }
    }

    // calculates ?name? of the company name
    public int companyNameLength(){
        return companyName.length();
    }

    //increase monthsOfEmployment by addMonth
    public void monthIncreaser(int addMonth){
        if(addMonth > 0)
            monthsOfEmployment += addMonth;
    }
}
