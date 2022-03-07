package com.olakunle;

import java.math.RoundingMode;

import org.joda.money.Money;

/**
 * Class ConsultantHours from Advanced Java lesson 1
 *
 * @author valiv
 *
 */
public class ConsultantHours {
    private Money amount;
    private double hours;

    /**
     * Constructor for the class ConsultantHours
     * @param amount
     * @param hours
     */
    public ConsultantHours(Money amount, double hours) {
        super();
        this.amount = amount;
        this.hours = hours;
    }

    /**
     * @return the amount multiplied by the hours
     */
    public Money getAmount() {
        return amount.multipliedBy(this.hours, RoundingMode.DOWN); // Rounded down to an integer value
    }


}

