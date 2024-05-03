package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class PumpGasUnit2 implements PumpGasUnit
{
    private static final Logger logger = Logger.getLogger(PumpGasUnit2.class.getName());

    @Override
    public void pumpGasUnit()
    {
        System.out.print("\n1 G gas pumped.\n");
    }
}
