package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class MDA_EFSM
{

    private static final Logger logger = Logger.getLogger(MDA_EFSM.class.getName());

    State state;
    int[] stateList;
    int curState;
    String currentState;

    public MDA_EFSM(AbstractFactory af,DS ds)
    {

        //logger.info("log entry: MDA_EFSM constructor");
        stateList=new int[6];
        state=new State(this,af, ds);
        //logger.info("log exit: MDA_EFSM constructor");
    }



    //public void activate(int price, MDA_EFSM m,AbstractFactory af, DS1 dsObj)
//    public void activate( int price, MDA_EFSM m,DS dsObj)
//    {
//        //state.activate(price,m,af);
//
//        //state.activate(price,m);
//        state.activate(price,m);
//    }

    public void activate( MDA_EFSM m,DS dsObj)
    {
        if(dsObj instanceof DS1)
        {
            //System.out.print("DS1 instance");
            state.activate(dsObj.getPrice(),m);
        }
        else
        {
            //System.out.print("DS2 instance");
            state.activategp2(dsObj,m);
        }


    }

//    public void start(MDA_EFSM m,DS dsObj)
//    {
//        state.start(m, dsObj);
//    }

    public void start(MDA_EFSM m,DS dsObj)
    {
        if(dsObj instanceof DS1)
        {
            //System.out.print("DS1 instance");
            state.start(m, dsObj);
        }
        else
        {
            //System.out.print("DS2 instance");
            state.startgp2(m, dsObj);
        }


    }

//    public void PayType(int payType,MDA_EFSM m,DS dsObj)
//    {
//        state.PayType(payType,m, dsObj);
//    }

    public void PayType(int payType,MDA_EFSM m,DS dsObj)
    {
        state.PayType(payType,m, dsObj);
    }

//    public void reject(MDA_EFSM m, DS ds)
//    {
//        state.reject(m, ds);
//    }

    public void reject(MDA_EFSM m, DS ds)
    {
        state.reject(m, ds);
    }


    public void cancel(MDA_EFSM m, DS ds)
    {
        if(ds instanceof DS1)
        {
            //System.out.print("DS1 instance");
            state.cancel(m, ds);
        }
        else
        {
            //System.out.print("DS2 instance");
            state.cancelgp2(m, ds);
        }


    }

    public void approved(MDA_EFSM m, DS ds)
    {
        state.approved(m, ds);
    }

    public void payCash(MDA_EFSM m, DS ds, int cash)
    {

        if(ds instanceof DS1)
        {
            System.out.print("DS1 instance");
            state.payCash(m, ds, cash);
        }
        else
        {
            System.out.print("DS2 instance");
            state.payCashgp2(m, ds, cash);
        }
    }


    public void continued(MDA_EFSM m, DS ds)
    {
        //state.continued(m, ds);
        if(ds instanceof DS1)
        {
            //System.out.print("DS1 instance");
            state.continued(m, ds);
        }
        else
        {
            //System.out.print("DS2 instance");
            state.continuedgp2(m, ds);
        }
    }

    public void startPump(MDA_EFSM m, DS ds)
    {

        if(ds instanceof DS1)
        {
            //System.out.print("DS1 instance");
            state.startPump(m, ds);
        }
        else
        {
            //System.out.print("DS2 instance");
            state.startPumpgp2(m, ds);
        }
    }


    public void stopPump(MDA_EFSM m, DS ds)
    {

        if(ds instanceof DS1)
        {
            //System.out.print("DS1 instance");
            state.stopPump(m, ds);
        }
        else
        {
            //System.out.print("DS2 instance");
            state.stop(m, ds);
        }

    }

    public void pump(MDA_EFSM m, DS ds)
    {

        if(ds instanceof DS1)
        {
            //System.out.print("DS1 instance");
            state.pump(m, ds);
        }
        else
        {
            //System.out.print("DS2 instance");
            state.pumpGallon(m, ds);
        }
    }

    public void receipt(MDA_EFSM m, DS ds, String balanceQuery)
    {
        if(ds instanceof DS1)
        {
            //System.out.print("DS1 instance");
            state.receipt(m, ds, balanceQuery);
        }
        else
        {
           // System.out.print("DS2 instance");
            state.receiptgp2(m, ds, balanceQuery);
        }

    }














    //////////////////////////gp2

//    public void activates(float rgPrice, float pgPrice,float dieselProce,MDA_EFSM m,DS dsObj )
//    {
//
//        state.activates(rgPrice,pgPrice,dieselProce,m);
//    }


    public void selectGas(int gasType,MDA_EFSM m, DS ds)
    {

        state.selectGas(gasType, m,ds);
    }



    public void noReceipt(MDA_EFSM m, DS ds, String balanceQuery)
    {
        System.out.print("DS2 instance");
        state.receiptgp2(m, ds, balanceQuery);

    }
}
