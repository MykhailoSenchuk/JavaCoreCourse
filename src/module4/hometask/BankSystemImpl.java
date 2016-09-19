package module4.hometask;

/**
 * Created by Mykhailo on 9/16/2016.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.bank.getLimitOfWithdrawal() >= amount && user.getBalance() >= amount + user.bank.getCommission(amount) && amount > 0 ){
            user.setBalance( user.getBalance() - amount - user.bank.getCommission(amount) );
        }
        else
            System.out.println("incorrect operation or over bank limit");
    }

    @Override
    public void fundUser(User user, int amount) {

        if (user.bank.getLimitOfFunding() >= amount && amount > 0){
            user.setBalance(user.getBalance() + amount);
        }
        else
            System.out.println("incorrect operation or over bank limit");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if( fromUser !=  toUser && fromUser.bank.getLimitOfWithdrawal() >= amount && toUser.bank.getLimitOfFunding() >= amount && fromUser.bank.getCurrency() == toUser.bank.getCurrency() ){
            withdrawOfUser(fromUser, amount);
            fundUser(toUser, amount);
        }
        else
            System.out.println("incorrect operation or over bank limit");
    }

    @Override
    public void paySalary(User user) {
        fundUser(user, user.getSalary());
    }
}
