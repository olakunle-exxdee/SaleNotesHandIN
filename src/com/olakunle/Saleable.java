package com.olakunle;

import java.math.RoundingMode;

import org.joda.money.Money;


public class Saleable implements Taxable{
    private String description;
    private Money amount;


    public Saleable(String description, Money amount) {
        this.description = description;
        this.amount = amount;
    }


    public String getDescription() {
        return this.description;
    }


    public Money getAmount() {
        return amount;
    }

    @Override
    public Money tax() {
        return this.amount.multipliedBy(0.2, RoundingMode.DOWN); // 0.2 represents the 20% tax
    }
}

