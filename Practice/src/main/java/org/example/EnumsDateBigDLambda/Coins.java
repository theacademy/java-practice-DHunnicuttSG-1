package org.example.EnumsDateBigDLambda;

import java.math.BigDecimal;

public enum Coins {
    QUARTER(new BigDecimal(".25")),
    DIME(new BigDecimal(".10")),
    NICKEL(new BigDecimal(".05")),
    PENNY(new BigDecimal(".01"));

    private final BigDecimal myValue;

    Coins(BigDecimal myValue){
        this.myValue = myValue;
    }

    public BigDecimal getMyValue() {
        return myValue;
    }
}
