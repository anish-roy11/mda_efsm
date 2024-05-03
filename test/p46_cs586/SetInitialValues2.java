package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class SetInitialValues2 implements SetInitialValues
{
    private static final Logger logger = Logger.getLogger(SetInitialValues2.class.getName());

    @Override
    public void setInitialValues(int litreOrGallon, OP op)
    {

        op.getDs().setG(litreOrGallon);
    }
}
