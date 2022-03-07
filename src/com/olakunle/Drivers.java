package com.olakunle;
import  java.math.BigDecimal;
import org.joda.money.Money;



public class Drivers {
    public static void main(String[] args) {
        SalesPerson sp1= new SalesPerson("Olakunle", new BigDecimal(123));
        SalesNote sn1 = new SalesNote("2022-12-03","computer", Money.parse("USD 23.87"));
        SalesNote sn2 = new SalesNote("2022-02-11","Bread", Money.parse("USD 20"));
        sp1.add(sn1);
        sp1.add(sn2);
        ConsultantHours ch1 = new ConsultantHours(Money.parse("EUR 45"), 43.25);

        System.out.println( ch1.getAmount());
       }
}
