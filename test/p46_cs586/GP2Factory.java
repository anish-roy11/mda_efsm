package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class GP2Factory implements AbstractFactory
{
    private static final Logger logger = Logger.getLogger(GP2Factory.class.getName());

    public StorePrices getStorePrices()
    {
        return new StorePrices2();
    }

    public PayMsg getPayMsg()
    {
        return new PayMsg2();
    }

    public StoreCash getStoreCash()
    {
        return new StoreCash2();
    }

    public DisplayMenu getDisplayMenu()
    {
        return new DisplayMenu2();
    }

    public RejectMsg getRejectMsg()
    {
        return new RejectMsg2();
    }

    public SetPrice getSetPrice()
    {
        return new SetPrice2();
    }

    public SetInitialValues getSetInitialValues()
    {
        return new SetInitialValues2();
    }

    public PumpGasUnit getPumpGasUnit()
    {
        return new PumpGasUnit2();
    }

    public GasPumpedMsg getGasPumpedMsg()
    {
        return new GasPumpedMsg2();
    }

    public PrintReceipt getPrintReceipt()
    {
        return new PrintReceipt2();
    }

    public CancelMsg getCancelMsg()
    {
        return new CancelMsg2();
    }

    public ReturnCash getReturnCash()
    {
        return new ReturnCash2();
    }

    public SetPayType getSetPayType()
    {
        return new SetPayType2();
    }

    public EjectCard getEjectCard()
    {
        return new EjectCard2();
    }

}
