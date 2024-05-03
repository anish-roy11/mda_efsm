package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class PrintReceipt1 implements PrintReceipt
{
    private static final Logger logger = Logger.getLogger(PrintReceipt1.class.getName());

    @Override
    public void printReceipt(String balanceDetails, DS ds,int gasTypeSelected)
    {


        System.out.print("\nReceipt printed for gas pumped\n");
        System.out.print("\nAmount ="+ds.getTotal()+"\n");

//        if(balanceDetails.equalsIgnoreCase("INSF_BAL"))
//        {
//            System.out.print("\nReceipt printed for gas pumped: Insufficient amount.\n");
//        }
//        else
//        {
//            System.out.print("\nReceipt printed for gas pumped\n");
//            System.out.print("\nAmount ="+ds.getTotal()+"\n");
//        }
    }
}
