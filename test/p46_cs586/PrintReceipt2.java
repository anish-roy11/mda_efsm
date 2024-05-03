package com.example.test.p46_cs586;

import java.text.DecimalFormat;
import java.util.logging.Logger;

public class PrintReceipt2 implements PrintReceipt
{
    private static final Logger logger = Logger.getLogger(PrintReceipt2.class.getName());

    @Override
    public void printReceipt(String balanceDetails, DS ds,int gasTypeSelected)
    {


        if(balanceDetails.equalsIgnoreCase("INSF_BAL"))
        {
            System.out.print("\nReceipt printed for gas pumped: Insufficient amount.\n");
        }
        else
        {
            System.out.print("\nReceipt printed for gas pumped\n");
            //System.out.print("\n Total cash="+ds.getCash());
            if(gasTypeSelected==1)
            {
                System.out.print("\n Total="+ds.getRprice());
            }
            if(gasTypeSelected==2)
            {
                System.out.print("\n Total="+ds.getDprice());
            }
            if(gasTypeSelected==3)
            {
                System.out.print("\n Total="+ds.getPprice());
            }

            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            //String formattedValue = decimalFormat.format(floatValue);
            System.out.print("\n Returned cash="+ decimalFormat.format((ds.getCash() - ds.getTotals())));
        }
    }
}
