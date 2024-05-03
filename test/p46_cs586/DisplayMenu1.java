package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class DisplayMenu1 implements DisplayMenu
{
    private static final Logger logger = Logger.getLogger(DisplayMenu1.class.getName());

    @Override
    public void displayMenuMsg()
    {
        System.out.print("DisplayMenu:");
    }
}
