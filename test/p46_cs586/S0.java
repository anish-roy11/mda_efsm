package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class S0
{
    private static final Logger logger = Logger.getLogger(S0.class.getName());
    //private OP op;
    //private MDA_EFSM m;
    private AbstractFactory af;

    public S0(AbstractFactory af1)
    {

        //logger.info("log entry: S0 constructor");
        //op=op1;
        //m=m1;
        af=af1;
        //logger.info("log exit: S0 constructor");
    }

    public void activate(int price,   OP op, MDA_EFSM m)
    {
        //System.out.print("m.currentState="+m.currentState);
        if(null == m.currentState )
        {
            op.getDs().setPrice(price);
            m.currentState="S0";
            op.getStorePrices().storedPriceMsg();
        }

    }

    public void start(OP op, MDA_EFSM m, DS ds)
    {
//        if(m.currentState.equalsIgnoreCase("S0"))
//        {
//            op.getPayMsg().payMsg();
//            m.currentState="S1";
//        }
        op.getPayMsg().payMsg();
        m.currentState="S1";

    }

    //receipt
    public void receipt(OP op, MDA_EFSM m, DS ds, String balanceQuery)
    {
        op.getPrintReceipt().printReceipt(balanceQuery,ds,0);
        //System.out.print();


    }





    //////////////gp2
    //public void activategp2(float a,float b,float c,   OP op, MDA_EFSM m)
    public void activategp2(DS ds,   OP op, MDA_EFSM m)
    {
        //System.out.print("m.currentState="+m.currentState);
        if(null == m.currentState )
        {
//            op.getDs().setRprice(a);
//            op.getDs().setPprice(b);
//            op.getDs().setDprice(c);

            m.currentState="S0";
            op.getStorePrices().storedPriceMsg();
        }
        //System.out.print(":"+ ds.getRprice()+":"+ ds.getPprice()+":"+ds.getDprice());

    }


    public void startgp2(OP op, MDA_EFSM m, DS ds)
    {
        if(m.currentState.equalsIgnoreCase("S0"))
        {
            op.getPayMsg().payMsg();
            m.currentState="S1";
        }

    }


    public void receiptgp2(OP op, MDA_EFSM m, DS ds, String balanceQuery, int gasSelected)
    {
        op.getPrintReceipt().printReceipt(balanceQuery,ds, gasSelected);
        //System.out.print();


    }
}
