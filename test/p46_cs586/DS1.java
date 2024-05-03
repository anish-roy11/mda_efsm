package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class DS1 implements DS
{
    private static final Logger logger = Logger.getLogger(DS1.class.getName());
    int temp_a;
    int price;
    int L;
    int total;
    int temp_c;
    int w;
    int cash;
    float totals;
    //float amountCharged;

    public DS1()
    {
        //logger.info("log entry: DS1 constructor");
    }

    public int getTemp_a()
    {
        return temp_a;
    }

    public void setTemp_a(int temp_a)
    {
        this.temp_a = temp_a;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getL()
    {
        return L;
    }

    public void setL(int l)
    {
        L = l;
    }

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public int getTemp_c()
    {
        return temp_c;
    }

    public void setTemp_c(int temp_c)
    {
        this.temp_c = temp_c;
    }

    public int getW()
    {
        return w;
    }

    public void setW(int w)
    {
        this.w = w;
    }

    public int getCash()
    {
        return cash;
    }

    public void setCash(int cash)
    {
        this.cash = cash;
    }
    public void setTotals(float totals)
    {
        this.totals = totals;
    }
    public float getTotals()
    {
        return totals;
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

    public float getTemp__a(){return 0.0F;}
    public void setTemp__a(float temp_a){}
    public float getTemp__b(){return 0.0F;}
    public void setTemp__b(float temp_b){}
    public float gettemp__c(){return 0.0F;}
    public void setTemp_c(float temp_c){}
    public int getTemp_cash(){return 0;}
    public void setTemp_cash(int temp_cash){}
    public float getDprice(){return 0.0F;}
    public void setDprice(float dprice){}
    public float getRprice(){return 0.0F;}
    public void setRprice(float rprice){}
    public float getPprice(){return 0.0F;}
    public void setPprice(float pprice){}
    public void setTotal(float total){}
    public int getG(){return 0;}
    public void setG(int g){}
    public float getPrices(){return 0.0F;}
    public void setPrices(float prices){}
    public void setTemp__c(float temp_c){}

}
