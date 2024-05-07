package com.school.loosely;

import java.math.BigDecimal;

public class BalanceService {

    public boolean checkout(Balance balance, BigDecimal checkotAmount){

        BigDecimal balanceAmount = balance.getAmount();


        // if we have enough money to checkout, proceed and return true, if not return false.
        // 100-60 = 40

        if(balanceAmount.subtract(checkotAmount).compareTo(BigDecimal.ZERO) >=0){

            //100-60 =40
            balance.setAmount(balanceAmount.subtract(checkotAmount));
            return true;
        }
        return false;
    }

}
