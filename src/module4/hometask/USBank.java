package module4.hometask;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by Mykhailo on 9/16/2016.
 */
public class USBank extends Bank {
    public USBank(long id,
                  String bankCountry,
                  Currency currency,
                  int numberOfEmployees,
                  double avrSalaryOfEmployee,
                  long rating,
                  long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    //limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
    public int getLimitOfWithdrawal() {
        switch(getCurrency()){
            case EUR:
                return 1200;
            case USD:
                return 1000;
        }
        return 0;
    }

    @Override
    // limit of funding - 10000 if EUR and no limit if USD
    public int getLimitOfFunding() {
        switch(getCurrency()){
            case EUR:
                return 10000;
            case USD:
                return MAX_VALUE;
        }
        return 0;
    }

    @Override
    // monthly rate - 1% with USD and 2% with EUR
    public double getMonthlyRate() {
        switch(getCurrency()){
            case EUR:
                return 0.02;
            case USD:
                return 0.01;
        }
        return 0;
    }

    @Override
    // commission - 5% if USD and up to 1000, 7% if USD and more than 1000
    // 6% if EUR and up to 1000 and 8% if EUR and more than 1000
    public int getCommission(int sum) {
        switch(getCurrency()){
            case EUR: {
                if (sum <= 1000)
                    return 6;
                else
                    return 8;
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
