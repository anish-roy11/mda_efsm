package com.example.test.p46_cs586;

import java.util.logging.Logger;


public class GP1
{
    private static final Logger logger = Logger.getLogger(GP1.class.getName());
    private MDA_EFSM m;
    private AbstractFactory af;
    //private DS1 ds;
    private DS ds;

    public GP1()
    {
        //logger.info("log entry: GP1 constructor");
        af = new GP1Factory();
        ds=new DS1();
        m=new MDA_EFSM(af,ds);
        //logger.info("log exit: GP1 constructor");
    }

//    public void Activate(int price)
//    {
//        //logger.info("log entry: Activate method of GP1");
//        if(price > 0)
//        {
//            //m.activate(price,this.m, this.af, this.ds);
//            //ds.setPrice(price);
//            m.activate(price,this.m,  this.ds);
//            //m.activate(this.m,  this.ds);
//        }

    public void Activate(int price)
    {
        //logger.info("log entry: Activate method of GP1");
        if(price > 0)
        {
            if( ds.getPrice() < 0 || ds.getPrice() == 0)
            {
                //m.activate(price,this.m, this.af, this.ds);
                ds.setPrice(price);
                m.activate(this.m,  this.ds);
                //m.activate(this.m,  this.ds);
            }

        }
        System.out.print(":ds.getPrice="+ds.getPrice());


        //logger.info("log exit: Activate method of GP1");


    }

//    public void Start()
//    {
//
//        //logger.info("log entry: Start method of GP1");
//        m.start(this.m,  this.ds);
//
//        //logger.info("log exit: Start method of GP1");
//    }


    public void Start()
    {

        //logger.info("log entry: Start method of GP1");
        m.start(this.m,  this.ds);

        //logger.info("log exit: Start method of GP1");
    }

//    public void PayCredit()
//    {
//
//        m.PayType(1,this.m,  this.ds);
//    }

    public void PayCredit()
    {

        m.PayType(1,this.m,  this.ds);
    }

//    public void Reject()
//    {
//
//        m.reject(this.m, this.ds);
//
//    }

    public void Reject()
    {

        m.reject(this.m, this.ds);

    }

    public void Cancel()
    {

        m.cancel(this.m, this.ds);
    }

    public void Approved()
    {

        m.approved(this.m, this.ds);
    }

    public void PayCash(int c)
    {


        m.payCash(this.m, this.ds,c);
    }

    public void StartPump()
    {

        m.continued(this.m, this.ds);
        m.startPump(this.m, this.ds);
    }



    public void Pump()
    {

        m.pump(this.m, this.ds);
    }

    public void StopPump()
    {

        m.stopPump(this.m, this.ds);
        m.receipt(this.m, this.ds,"SUF_BAL");
    }
}
