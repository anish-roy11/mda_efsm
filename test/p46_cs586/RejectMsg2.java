package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class RejectMsg2 implements RejectMsg
{
    private static final Logger logger = Logger.getLogger(RejectMsg2.class.getName());

    @Override
    public void printRejectMsg()
    {
        System.out.print("Activity rejected.");
        System.out.print("\n");
    }
}
