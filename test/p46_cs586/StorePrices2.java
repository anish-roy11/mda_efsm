package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class StorePrices2 implements StorePrices
{
    private static final Logger logger = Logger.getLogger(StorePrices2.class.getName());

    @Override
    public void storedPriceMsg()
    {

        System.out.print("Prices stored.");
        System.out.print("\n");
    }
}
