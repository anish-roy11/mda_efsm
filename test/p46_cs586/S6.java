package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class S6
{

    private static final Logger logger = Logger.getLogger(S6.class.getName());
    private OP op;
    private MDA_EFSM m;
    private AbstractFactory af;

    public S6(OP op1, MDA_EFSM m1, AbstractFactory af1)
    {

        op=op1;
        m=m1;
        af=af1;
    }

}
