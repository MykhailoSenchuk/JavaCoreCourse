package module4.hometask;

/**
 * Created by Mykhailo on 9/16/2016.
 */
public class EUBank extends Bank {
    public EUBank(long id,
                     String bankCountry,
                     Currency currency,
                     int numberOfEmployees,
                     double avrSalaryOfEmployee,
                     long rating,
                     long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    //limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
    public int getLimitOfWithdrawal() {
        switch(getCurrency()){
            case EUR:
                return 2200;
            case USD:
                return 2000;
        }
        return 0;
    }

    @Override
    // limit of funding - 20000 if EUR and 10000 if USD
    public int getLimitOfFunding() {
        switch(getCurrency()){
            case EUR:
                return 20000;
            case USD:
                return 10000;
        }
        return 0;
    }

    @Override
    // monthly rate - 0% with USD and 1% with EUR
    public double getMonthlyRate() {
        switch(getCurrency()){
            case EUR:
                return 0.01;
            case USD:
                return 0;
        }
        return 0;
    }

    @Override
    // commission - 5% if USD and up to 1000, 7% if USD and more than 1000
    // 2% if EUR and up to 1000 and 4% if EUR and more than 1000
    public int getCommission(int sum) {
        switch(getCurrency()){
            case EUR: {
                if (sum <= 1000)
                    return 2;
                else
                    return 4;
            }
            case USD:{
                if (sum <= 1000)
                    return 5;
                else
                    return 7;
            }
        }
        return 0;
    }
}
