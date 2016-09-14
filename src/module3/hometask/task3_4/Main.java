package module3.hometask.task3_4;

/**
 * Created by Mykhailo on 9/13/2016.
 */
public class Main {
    public static void main(String[] args) {
        User test = new User("alex", 10000, 12, "Ciklum", 8600, "gryvnya");

        System.out.println("initial balance: " + test.getBalance());

        test.paySalary();
        System.out.println("after salary: " + test.getBalance());

        test.withdraw(10);
        System.out.println("after withdrawal: " + test.getBalance());

        System.out.println("length of company name: " + test.companyNameLength());

        System.out.println("initial monthsOfEmployment: " + test.getMonthsOfEmployment());
        test.monthIncreaser(1);
        System.out.println("after increase: " + test.getMonthsOfEmployment());
    }
}
