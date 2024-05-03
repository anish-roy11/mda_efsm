package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class EjectCard2 implements EjectCard
{
    private static final Logger logger = Logger.getLogger(EjectCard2.class.getName());

    @Override
    public void ejectCardMsg()
    {
        System.out.print("\nCard ejected");
        System.out.print("\n");
    }
}
