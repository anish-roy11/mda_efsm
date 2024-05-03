package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class S2
{

    private static final Logger logger = Logger.getLogger(S2.class.getName());
    private OP op;
    private MDA_EFSM m;
    private AbstractFactory af;

    public S2(OP op1, MDA_EFSM m1, AbstractFactory af1)
    {

        op=op1;
        m=m1;
        af=af1;
    }





    public void reject(OP op, MDA_EFSM m)
    {
        op.getRejectMsg().printRejectMsg();
        op.getEjectCard().ejectCardMsg();
        m.currentState="S0";
    }


    public void approved(OP op, MDA_EFSM m)
    {
        op.getDs().setW(1);
        op.getEjectCard().ejectCardMsg();
        m.currentState="S3";
        op.getDisplayMenu().displayMenuMsg();
    }

}
