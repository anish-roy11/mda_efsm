package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class PayMsg2 implements PayMsg
{
    private static final Logger logger = Logger.getLogger(PayMsg2.class.getName());

    public void payMsg()
    {
        System.out.print("Make the payment");
        System.out.print("\n");
    }
}
