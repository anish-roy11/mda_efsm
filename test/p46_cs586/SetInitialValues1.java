package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class SetInitialValues1 implements SetInitialValues
{
    private static final Logger logger = Logger.getLogger(SetInitialValues1.class.getName());

    @Override
    public void setInitialValues(int litreOrGallon, OP op)
    {

        op.getDs().setL(litreOrGallon);
    }
}
