package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class RejectMsg1 implements RejectMsg
{
    private static final Logger logger = Logger.getLogger(RejectMsg1.class.getName());

    @Override
    public void printRejectMsg()
    {
        System.out.print("Activity rejected.");
        System.out.print("\n");
    }
}
