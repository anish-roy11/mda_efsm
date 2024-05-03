package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class S4
{

    private static final Logger logger = Logger.getLogger(S4.class.getName());
    private OP op;
    private MDA_EFSM m;
    private AbstractFactory af;

    public S4(OP op1, MDA_EFSM m1, AbstractFactory af1)
    {

        op=op1;
        m=m1;
        af=af1;
    }


    public void continued(OP op, MDA_EFSM m)
    {
        System.out.print("\n continued");


    }


    public void startPump(OP op, MDA_EFSM m)
    {
        System.out.print("\n Gas pumping started");

        op.getSetInitialValues().setInitialValues(1,op);
        m.currentState="S5";
    }


    public void continuedgp2(OP op, MDA_EFSM m)
    {
        System.out.print("\n continued");


    }

    public void startPumpgp2(OP op, MDA_EFSM m)
    {
        System.out.print("\n Gas pumping started");

        op.getSetInitialValues().setInitialValues(1,op);
        op.getDs().setG(1);
        m.currentState="S5";
    }

}
