package module4.hometask;

/**
 * Created by Mykhailo on 9/16/2016.
 */
public class Main {
    static void operations(User user, int withdraw, int fund, int transfer, User toUser,  BankSystemImpl bankSystemImpl){
        System.out.println(user.getName() + " initial balance: " + user.getBalance() + " "+ user.bank.getCurrency());
        bankSystemImpl.withdrawOfUser(user, withdraw);
        System.out.println(user.getName() + " balance after withdrawal: " + user.getBalance() + " "+ user.bank.getCurrency());

        bankSystemImpl.fundUser(user, fund);
        System.out.println(user.getName() + " balance after fund: " + user.getBalance() + " "+ user.bank.getCurrency());

        bankSystemImpl.transferMoney(user, toUser, transfer);
        System.out.println(user.getName() + " balance after transfer: " + user.getBalance() + " "+ user.bank.getCurrency());

        bankSystemImpl.paySalary(user);
        System.out.println(user.getName() + " balance after salary: " + user.getBalance() + " "+ user.bank.getCurrency());
    }
    public static void main(String[] args) {
        Bank chinaBankEUR = new ChinaBank(124124, "China", Currency.EUR, 123, 122354, 99, 12345152);
        Bank chinaBankUSD = new ChinaBank(124124, "China", Currency.USD, 123, 122354, 99, 12345152);
        User vasya = new User(1545456, "Vasya", 14000, 11, "Epam", 4000, chinaBankEUR);
        User misha = new User(1545456, "Misha", 14000, 11, "Epam", 4000, chinaBankUSD);

        Bank euBankEUR = new EUBank(124125, "Germany", Currency.EUR, 123, 122354, 99, 12345152);
        Bank euBankUSD = new EUBank(124125, "Germany", Currency.USD, 123, 122354, 99, 12345152);
        User petya = new User(1545457, "Petya", 100000, 11, "Epam", 10000, euBankEUR);
        User oleg = new User(1545457, "Oleg", 100000, 11, "Epam", 10000, euBankUSD);

        Bank usBankUSD = new USBank(124125, "USA", Currency.USD, 123, 122354, 99, 12345152);
        Bank usBankEUR = new USBank(124125, "USA", Currency.EUR, 123, 122354, 99, 12345152);
        User sergiy = new User(1545457, "Sergiy", 100000, 11, "Epam", 10000, usBankUSD);
        User nazar = new User(1545457, "Nazar", 100000, 11, "Epam", 10000, usBankEUR);

        BankSystemImpl bankSystemImpl= new BankSystemImpl();

        //vasya
        operations(vasya, 100, 1000, 1000000, petya, bankSystemImpl);

        //misha
        operations(misha, 100, 1000, 100, oleg, bankSystemImpl);

        //oleg
        operations(oleg, 100, 1000, 100, sergiy, bankSystemImpl);

        //petya
        operations(petya, 100, 1000, 100, nazar, bankSystemImpl);

        //sergiy
        operations(sergiy, 100, 1000, 100, misha, bankSystemImpl);

        //nazar
        operations(nazar, 100, 1000, 100, vasya, bankSystemImpl);


    }
}
