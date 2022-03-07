package com.olakunle;


import org.joda.money.*;
import java.util.*;
public class SalesNote extends Saleable implements Comparable<SalesNote>,Taxable {
    private String date;
    private String description;
    private Money amount;

    public static void main(String[] args) {
    }

    public SalesNote(String date, String description, Money amount) {
        super(description,amount);
        this.date = date;

    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return super.getDescription();
    }

    public Money getAmount() {
        return super.getAmount();
    }

    @Override

    public String toString() {
        return
                "Date='" + date + '\'' + ", Description='" + description + '\'' + ", Amount=" + amount;
    }

    @Override
    public int compareTo(SalesNote o) {
        Date thisDate = new Date(this.date);
        Date oDate = new Date(o.getDate());
        if(thisDate.before(oDate))
            return 1;
        else if(thisDate.equals(oDate))
            return 0;
        else return -1;
    }

    @Override
    public Money tax() {
        return super.tax();
    }
}
