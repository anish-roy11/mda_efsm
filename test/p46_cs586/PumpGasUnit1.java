package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class PumpGasUnit1 implements PumpGasUnit
{
    private static final Logger logger = Logger.getLogger(PumpGasUnit1.class.getName());

    @Override
    public void pumpGasUnit()
    {
        System.out.print("\n1 L gas pumped.\n");
    }
}
