package com.olakunle;

import org.joda.money.Money;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class SalesPerson {
    private String name;
    private BigDecimal provision;
    private ArrayList<SalesNote> saleNotes ;


    public SalesPerson(String name, BigDecimal provision) {
        this.name = name;
        this.provision = provision;
        this.saleNotes =  new ArrayList<>();
    }

    public ArrayList<SalesNote> getSaleNotes() {
        return saleNotes;
    }

    public void setSaleNotes(ArrayList<SalesNote> saleNotes) {
        this.saleNotes = saleNotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getProvision() {
        return provision;
    }

    public void setProvision(BigDecimal provision) {
        this.provision = provision;
    }
    public void printSales( ){
        Collections.sort(saleNotes);
        saleNotes.forEach(sn -> System.out.println(sn.toString()));
    }
    public  void add(SalesNote sn) {
       saleNotes.add(sn);

    }
    public  void remove(SalesNote sn) {
        saleNotes.remove(sn);
    }
    public SalesNote poorestSales(){
        if(saleNotes.size()==0){
            return  null;
        }
        SalesNote returnValue =saleNotes.get(0);
        for (SalesNote sn : saleNotes) {
            if(sn.getAmount().isLessThan(returnValue.getAmount()))
                return  sn;
        }
        return  returnValue;
    }
    public SalesNote bestSales(){
       if(saleNotes.size()==0){
           return  null;
       }
       SalesNote returnValue =saleNotes.get(0);
        for (SalesNote sn : saleNotes) {
        if(sn.getAmount().isGreaterThan(returnValue.getAmount()))
    return  sn;
        }
        return  returnValue;
    }

    public Money totalSales (String desc) {
        Money sumSales = Money.parse ("USD 0");
        for (SalesNote sn : saleNotes) {
            if (sn.getDescription().equals(desc)) {
                sumSales = sumSales.plus(sn.getAmount());
            }
        }
            return sumSales.multipliedBy(this.provision, RoundingMode.HALF_UP);
    }


    @Override
    public String toString() {
        return "SalesPerson{" +
                "name='" + name + '\'' +
                ", provision=" + provision +
                '}';
    }
}
