package com.school.loosely;


import java.math.BigDecimal;


public class BalanceService {

    public boolean checkout(Balance balance, BigDecimal checkoutAmount){

        BigDecimal balanceAmount = balance.getAmount();//100

        //if we have enough money to checkout, proceed and return true, if not return false.
        //100 -60 = 40
        if(balanceAmount.subtract(checkoutAmount).compareTo(BigDecimal.ZERO) >=0){
            //100 - 60 = 40
            balance.setAmount(balanceAmount.subtract(checkoutAmount));
            return true;
        }

        return false;
    }
}