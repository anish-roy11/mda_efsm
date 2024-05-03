package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class S1
{
    private static final Logger logger = Logger.getLogger(S1.class.getName());

    private OP op;
    private MDA_EFSM m;
    private AbstractFactory af;

    public S1(OP op1, MDA_EFSM m1, AbstractFactory af1)
    {

        op=op1;
        m=m1;
        af=af1;
    }



    public void PayType(int payType,MDA_EFSM m,DS dsObj, OP op, String finalState)
    {

        //op.getPayMsg().payMsg();
        op.getDs().setW(payType);
        System.out.print("payType=1");
        //m.currentState="S2";
        m.currentState=finalState;
    }


    public void payCash(OP op, MDA_EFSM m,DS ds,int cash)
    {
        if(cash > 0)
        {

                this.op.getDs().setW(0);
                op.getDs().setCash(cash);
                //op.getDs().setTotal(ds.getPrice() + op.getDs().getTotal());
                PayType(0 ,m, ds, op,"S3");
                op.getStoreCash().storeCashMsg();
                op.getDisplayMenu().displayMenuMsg();


        }
        //System.out.print("\nds.getTotal()=" + ds.getTotal());
    }






    public void payCashgp2(OP op, MDA_EFSM m,DS ds,int cash)
    {
        if(cash > 0)
        {


            ds.setW(0);
            ds.setCash(cash);
            //System.out.print("\n op.DS="+op.getDs());
            //System.out.print("\n DS="+ds);
            //op.setDs(ds);
//            op.getDs().setW(0);
//            op.getDs().setCash(cash);
            //op.getDs().setTotal(ds.getPrice() + op.getDs().getTotal());
            PayType(0 ,m, ds, op,"S3");
            op.getStoreCash().storeCashMsg();
            op.getDisplayMenu().displayMenuMsg();

            //System.out.print("\n op.DS.W="+ op.getDs().getW());
            System.out.print("\n cash stored="+ ds.getCash());



        }
        //System.out.print("\nds.getTotal()=" + ds.getTotal());
    }
}
