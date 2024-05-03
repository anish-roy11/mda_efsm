package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class StoreCash1 implements StoreCash
{
    private static final Logger logger = Logger.getLogger(StoreCash1.class.getName());

    @Override
    public void storeCashMsg()
    {
        System.out.print("\n Cash accepted and stored");
        System.out.print("\n");
    }
}
