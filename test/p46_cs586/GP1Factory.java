package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class GP1Factory implements AbstractFactory
{
    private static final Logger logger = Logger.getLogger(GP1Factory.class.getName());

    public GP1Factory()
    {
        //logger.info("log entry: GP1Factory constructor");
    }

    public StorePrices getStorePrices()
    {
        //logger.info("log entry: StorePrices method of  GP1Factory");
        return new StorePrices1();
    }

    public PayMsg getPayMsg()
    {
        //logger.info("log entry: PayMsg method of  GP1Factory");
        return new PayMsg1();
    }

    public StoreCash getStoreCash()
    {
        return new StoreCash1();
    }

    public DisplayMenu getDisplayMenu()
    {
        return new DisplayMenu1();
    }

    public RejectMsg getRejectMsg()
    {
        return new RejectMsg1();
    }

    public SetPrice getSetPrice()
    {
        return new SetPrice1();
    }

    public SetInitialValues getSetInitialValues()
    {
        return new SetInitialValues1();
    }

    public PumpGasUnit getPumpGasUnit()
    {
        return new PumpGasUnit1();
    }

    public GasPumpedMsg getGasPumpedMsg()
    {
        return new GasPumpedMsg1();
    }

    public PrintReceipt getPrintReceipt()
    {
        return new PrintReceipt1();
    }

    public CancelMsg getCancelMsg()
    {
        return new CancelMsg1();
    }

    public ReturnCash getReturnCash()
    {
        return new ReturnCash1();
    }

    public SetPayType getSetPayType()
    {
        return new SetPayType1();
    }

    public EjectCard getEjectCard()
    {
        return new EjectCard1();
    }







}
