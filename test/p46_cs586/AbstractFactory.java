package com.example.test.p46_cs586;

public interface AbstractFactory
{

    //private static final Logger logger = Logger.getLogger(AbstractFactory.class.getName());
    public StorePrices getStorePrices();
    public PayMsg getPayMsg();
    public StoreCash getStoreCash();
    public DisplayMenu getDisplayMenu();
    public RejectMsg getRejectMsg();
    public SetPrice getSetPrice();
    public SetInitialValues getSetInitialValues();
    public PumpGasUnit getPumpGasUnit();
    public GasPumpedMsg getGasPumpedMsg();
    public PrintReceipt getPrintReceipt();
    public CancelMsg getCancelMsg();
    public ReturnCash getReturnCash();
    public SetPayType getSetPayType();
    public EjectCard getEjectCard();
}
