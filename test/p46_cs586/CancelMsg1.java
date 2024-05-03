package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class CancelMsg1 implements CancelMsg
{
    private static final Logger logger = Logger.getLogger(CancelMsg1.class.getName());

    @Override
    public void printCancelMsg()
    {
        System.out.print(" cancelled");
    }
}
