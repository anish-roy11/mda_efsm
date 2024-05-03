package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class StorePrices1 implements StorePrices
{
    private static final Logger logger = Logger.getLogger(StorePrices1.class.getName());

    @Override
    public void storedPriceMsg()
    {

        System.out.print("Price stored.");
        System.out.print("\n");
    }
}
