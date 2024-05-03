package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class DS2 implements DS
{
    private static final Logger logger = Logger.getLogger(DS2.class.getName());

    float temp__a;
    float temp__b;
    float temp__c;
    int temp_cash;
    float Dprice;
    float Rprice;
    float Pprice;
    int cash;
    float totals;
    int G;
    float prices;
    //float amountCharged;



    public float getTemp__c()
    {
        return temp__c;
    }

    public void setTemp__c(float temp__c)
    {
        this.temp__c = temp__c;
    }

    public void setTotals(float totals)
    {
        this.totals = totals;
    }



    public float getTemp__a()
    {
        return temp__a;
    }

    public void setTemp__a(float temp_a)
    {
        this.temp__a = temp_a;
    }

    public float getTemp__b()
    {
        return temp__b;
    }

    public void setTemp__b(float temp_b)
    {
        this.temp__b = temp_b;
    }

    public float gettemp__c()
    {
        return temp__c;
    }

//    public void setTemp__c(float temp_c)
//    {
//        this.temp__c = temp_c;
//    }

    public int getTemp_cash()
    {
        return temp_cash;
    }

    public void setTemp_cash(int temp_cash)
    {
        this.temp_cash = temp_cash;
    }

    public float getDprice()
    {
        return Dprice;
    }

    public void setDprice(float dprice)
    {
        Dprice = dprice;
    }

    public float getRprice()
    {
        return Rprice;
    }

    public void setRprice(float rprice)
    {
        Rprice = rprice;
    }

    public float getPprice()
    {
        return Pprice;
    }

    public void setPprice(float pprice)
    {
        Pprice = pprice;
    }

    public int getCash()
    {
        return cash;
    }

    public void setCash(int cash)
    {
        this.cash = cash;
    }

    public float getTotals()
    {
        return totals;
    }

    public void setTotal(float total)
    {
        this.totals = total;
    }

    public int getG()
    {
        return G;
    }

    public void setG(int g)
    {
        G = g;
    }

    public float getPrices()
    {
        return prices;
    }

    public void setPrices(float prices)
    {
        this.prices = prices;
    }


//    public float getAmountCharged()
//    {
//        return amountCharged;
//    }
//
//    public void setAmountCharged(float amountCharged)
//    {
//        this.amountCharged = amountCharged;
//    }


















    @Override
    public void setPrice(int price)
    {

    }

    @Override
    public int getL()
    {
        return 0;
    }
    @Override
    public void setL(int l)
    {
        return;
    }




    @Override
    public void setTotal(int total)
    {
        return;
    }




    @Override
    public void setTemp_c(int temp_c)
    {
        return;
    }

    @Override
    public int getW()
    {
        return 0;
    }

    @Override
    public void setW(int w)
    {
        return;
    }


    @Override
    public int getTotal()
    {
        return 0;
    }


    @Override
    public int getTemp_c()
    {
        return 0;
    }


    @Override
    public int getPrice()
    {
        return 0;
    }


}
