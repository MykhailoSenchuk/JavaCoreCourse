package module4.hometask;

/**
 * Created by Mykhailo on 9/16/2016.
 */
public class ChinaBank extends Bank{

    public ChinaBank(long id,
                     String bankCountry,
                     Currency currency,
                     int numberOfEmployees,
                     double avrSalaryOfEmployee,
                     long rating,
                     long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    //limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
    public int getLimitOfWithdrawal() {
        switch(getCurrency()){
            case EUR:
                return 150;
            case USD:
                return 100;
        }
        return 0;
    }

    @Override
    // limit of funding - 5000 if EUR and 10000 if USD
    public int getLimitOfFunding() {
        switch(getCurrency()){
            case EUR:
                return 5000;
            case USD:
                return 10000;
        }
        return 0;
    }

    @Override
    //monthly rate - 1% with USD and 0% with EUR
    public double getMonthlyRate() {
        switch(getCurrency()){
            case EUR:
                return 0;
            case USD:
                return 0.01;
        }
        return 0;
    }

    @Override
    // commission - 3% if USD and up to 1000, 5% if USD and more than 1000
    // 10% if EUR and up to 1000 and 11% if EUR and more than 1000
    public int getCommission(int sum) {
        switch(getCurrency()){
            case EUR: {
                if (sum <= 1000)
                    return 1;
                else
                    return 11;
            }
            case USD:{
                if (sum <= 1000)
                    return 3;
                else
                    return 5;
            }
        }
        return 0;
    }
}
