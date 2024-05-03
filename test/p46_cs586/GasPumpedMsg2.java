package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class GasPumpedMsg2 implements GasPumpedMsg
{
    private static final Logger logger = Logger.getLogger(GasPumpedMsg2.class.getName());

    @Override
    public void gasPumpedMsg()
    {
        System.out.print("Gas pumped");
    }
}
