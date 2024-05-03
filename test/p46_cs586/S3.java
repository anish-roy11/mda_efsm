package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class S3
{

    private static final Logger logger = Logger.getLogger(S3.class.getName());
    private OP op;
    private MDA_EFSM m;
    private AbstractFactory af;
    private int gasTypeSelected=0;

    public S3(OP op1, MDA_EFSM m1, AbstractFactory af1)
    {

        op=op1;
        m=m1;
        af=af1;
    }

    public void cancel(OP op, MDA_EFSM m)
    {
        op.getCancelMsg().printCancelMsg();
        m.currentState="S0";
    }



    public void cancelgp2(OP op, MDA_EFSM m)
    {
        op.getCancelMsg().printCancelMsg();
        m.currentState="S0";
    }


    public void selectGas(int gasSelected,MDA_EFSM m, DS ds,OP op )
    {
        if(gasTypeSelected == 1 || gasTypeSelected == 2 || gasTypeSelected == 3)
        {
            gasTypeSelected=gasSelected;
            m.currentState="S3";
        }



    }
}
