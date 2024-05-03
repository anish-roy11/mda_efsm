package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class GP2
{

    private static final Logger logger = Logger.getLogger(GP2.class.getName());
    private MDA_EFSM m;
    private AbstractFactory af;
    private DS ds;


    public GP2()
    {
        af =  new GP2Factory();
        ds=new DS2();
        m=new MDA_EFSM(af,ds);

    }

    public void Activate(float rgPrice, float pgPrice, float dieselPrice)
    {

        //logger.info("log entry: Activate method of GP1");
        if(rgPrice > 0 && pgPrice > 0 && dieselPrice > 0)
        {
            ds.setRprice(rgPrice);
            ds.setPprice(pgPrice);
            ds.setDprice(dieselPrice);
            m.activate(this.m,this.ds);
        }




    }



    public void Start()
    {

        m.start(this.m,  this.ds);
    }

    public void PayCash(int cash)
    {

//        System.out.print("\nthis.m="+this.m);
//        System.out.print("\nthis.ds="+this.ds);
//        System.out.print("\nthis.ds.getW="+this.ds.getW());
        m.payCash(this.m, this.ds,cash);
    }

    public void Cancel()
    {

        m.cancel(this.m, this.ds);
    }

    public void Premium()
    {
        //premium=selectGas(3)
        //diesel=selectGas(2)
        //regular=selectGas(1)
        m.selectGas(3,this.m, this.ds);
        m.continued(this.m, this.ds);
    }

    public void Regular()
    {

        m.selectGas(1,this.m, this.ds);
        m.continued(this.m, this.ds);
    }

    public void Diesel()
    {

        m.selectGas(2,this.m, this.ds);
        m.continued(this.m, this.ds);
    }



    public void StartPump()
    {

        m.continued(this.m, this.ds);
        m.startPump(this.m, this.ds);
    }

    public void PumpGallon()
    {

        m.pump(this.m, this.ds);
    }


    public void Stop()
    {

        m.stopPump(this.m, this.ds);
        m.receipt(this.m, this.ds,"SUF_BAL");
    }

    public void Receipt()
    {

        m.receipt(this.m, this.ds,"SUF_BAL");
    }

    public void NoReceipt()
    {

        m.noReceipt(this.m, this.ds,"SUF_BAL");
    }
}
