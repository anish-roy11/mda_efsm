package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class State
{
    private static final Logger logger = Logger.getLogger(State.class.getName());
    private MDA_EFSM m;
    private AbstractFactory af;
    private OP op;
    //private DS ds;
    private S0 s0;
    private S1 s1;
    private S2 s2;
    private S3 s3;
    private S4 s4;
    private S5 s5;
    private S6 s6;
    private int gasTypeSelected=0;


    public State(MDA_EFSM m, AbstractFactory af,DS ds)
    {
        //logger.info("log entry: State constructor");
        this.m = m;
        this.af = af;
        op=new OP(af,ds);
        s0=new S0( af);
        s1=new S1(op, m, af);
        s2=new S2(op, m, af);
        s3=new S3(op, m, af);
        s4=new S4(op, m, af);
        s5=new S5(op, m, af);
        s6=new S6(op, m, af);
        //logger.info("log exit: State constructor");
    }


    public void activate(int price,MDA_EFSM m)
    {
        s0.activate(price,  this.op,m);
        //this.op.getDs().setPrice(price);
        //m.currentState="S0";
        //this.op.getStorePrices().storedPriceMsg();
    }



    public void start( MDA_EFSM m, DS ds)
    {

        s0.start(this.op, m, ds);
        //m.currentState="S1";
        //this.op.getPayMsg().payMsg();
    }

    public void PayType(int payType,MDA_EFSM m,DS ds)
    {
        s1.PayType(payType,m,ds, this.op, "S2");
        //this.op.getDs().setW(payType);
        //System.out.print("payType="+this.op.getDs().getW());
        //m.currentState=newState;
    }


    public void reject(MDA_EFSM m, DS ds)
    {
        s2.reject(op, m);
//        this.op.getRejectMsg().printRejectMsg();
//        this.op.getEjectCard().ejectCardMsg();
//        m.currentState="S0";
    }


    public void approved(MDA_EFSM m, DS ds)
    {
        s2.approved(op, m);
//        this.op.getDs().setW(1);
//        this.op.getEjectCard().ejectCardMsg();
//        m.currentState="S3";
//        this.op.getDisplayMenu().displayMenuMsg();
    }

    public void cancel(MDA_EFSM m, DS ds)
    {
        s3.cancel(op, m);
//        this.op.getCancelMsg().printCancelMsg();
//        m.currentState="S0";
    }





    public void payCash(MDA_EFSM m, DS ds, int cash)
    {
        s1.payCash(op, m, ds,cash);
    }


    public void continued(MDA_EFSM m, DS ds)
    {
        s4.continued(op, m);
    }

    public void startPump(MDA_EFSM m, DS ds)
    {
        s4.startPump(op, m);

    }

    public void stopPump(MDA_EFSM m, DS ds)
    {
        s5.stopPump(op, m);

    }



    public void pump(MDA_EFSM m, DS ds)
    {
        s5.pump(op, m, this);

    }

    public void receipt(MDA_EFSM m, DS ds, String balanceQuery)
    {
        s0.receipt(op, m, ds, balanceQuery);

    }









    /////////////////////////////////////////gp2
    public void activategp2(DS ds,MDA_EFSM m)
    {
        //s0.activategp2(ds.getRprice(), ds.getPprice(), ds.getDprice(), this.op,m);
        s0.activategp2(ds, this.op,m);
    }

    public void startgp2( MDA_EFSM m, DS ds)
    {

        s0.start(this.op, m, ds);
        //m.currentState="S1";
        //this.op.getPayMsg().payMsg();
    }

    public void payCashgp2(MDA_EFSM m, DS ds, int cash)
    {
        s1.payCashgp2(this.op, m, ds,cash);
    }

    public void cancelgp2(MDA_EFSM m, DS ds)
    {
        s3.cancelgp2(op, m);
//        this.op.getCancelMsg().printCancelMsg();
//        m.currentState="S0";
    }



    public void selectGas(int gasType, MDA_EFSM m, DS ds)
    {

        if(this.gasTypeSelected==0)
        {
            this.gasTypeSelected=gasType;
            s3.selectGas(this.gasTypeSelected,m,ds,op);
        }

    }

    public void continuedgp2(MDA_EFSM m, DS ds)
    {
        s4.continuedgp2(op, m);
    }


    public void startPumpgp2(MDA_EFSM m, DS ds)
    {
        s4.startPumpgp2(op, m);

    }

    public void pumpGallon(MDA_EFSM m, DS ds)
    {
        s5.pumpGallon(op, m, this, this.gasTypeSelected, ds);

    }


    public void stop(MDA_EFSM m, DS ds)
    {
        s5.stop(op, m);

    }

    public void receiptgp2(MDA_EFSM m, DS ds, String balanceQuery)
    {
        //s0.receipt(op, m, ds, balanceQuery);
        s0.receiptgp2(op, m, ds, balanceQuery, this.gasTypeSelected);

    }


    public void noReceiptgp2(MDA_EFSM m, DS ds, String balanceQuery)
    {
        s0.receipt(op, m, ds, balanceQuery);

    }

}
