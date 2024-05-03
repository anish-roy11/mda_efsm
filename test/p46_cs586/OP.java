package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class OP
{
    private static final Logger logger = Logger.getLogger(OP.class.getName());

    AbstractFactory af;
    //DS1 ds;
    DS ds;
    StorePrices storePrices;
    PayMsg payMsg;
    StoreCash storeCash;
    DisplayMenu displayMenu;
    RejectMsg rejectMsg;
    SetPrice setPrice;
    SetInitialValues setInitialValues;
    PumpGasUnit pumpGasUnit;
    GasPumpedMsg gasPumpedMsg;
    PrintReceipt printReceipt;
    CancelMsg cancelMsg;
    ReturnCash returnCash;
    SetPayType setPayType;
    EjectCard ejectCard;



    public OP(AbstractFactory af1, DS ds1Obj)
    {

        //logger.info("log entry: OP constructor");

        this.af=af1;
        this.ds=ds1Obj;
        initialize(af1);
        //logger.info("log exit: OP constructor");

    }

    public void initialize(AbstractFactory af1)
    {
        storePrices=af1.getStorePrices();
        payMsg=af1.getPayMsg();
        storeCash=af1.getStoreCash();
        displayMenu=af1.getDisplayMenu();
        rejectMsg=af1.getRejectMsg();
        setPrice=af1.getSetPrice();
        setInitialValues=af1.getSetInitialValues();
        pumpGasUnit=af1.getPumpGasUnit();
        gasPumpedMsg=af1.getGasPumpedMsg();
        printReceipt=af1.getPrintReceipt();
        cancelMsg=af1.getCancelMsg();
        returnCash=af1.getReturnCash();
        setPayType=af1.getSetPayType();
        ejectCard=af1.getEjectCard();

    }

    public AbstractFactory getAf()
    {
        return af;
    }

    public void setAf(AbstractFactory af)
    {
        this.af = af;
    }

    public DS getDs()
    {
        return ds;
    }

    public void setDs(DS1 ds)
    {
        this.ds = ds;
    }

    public StorePrices getStorePrices()
    {
        return storePrices;
    }

    public void setStorePrices(StorePrices storePrices)
    {
        this.storePrices = storePrices;
    }

    public PayMsg getPayMsg()
    {
        return payMsg;
    }

    public void setPayMsg(PayMsg payMsg)
    {
        this.payMsg = payMsg;
    }

    public StoreCash getStoreCash()
    {
        return storeCash;
    }

    public void setStoreCash(StoreCash storeCash)
    {
        this.storeCash = storeCash;
    }

    public DisplayMenu getDisplayMenu()
    {
        return displayMenu;
    }

    public void setDisplayMenu(DisplayMenu displayMenu)
    {
        this.displayMenu = displayMenu;
    }

    public RejectMsg getRejectMsg()
    {
        return rejectMsg;
    }

    public void setRejectMsg(RejectMsg rejectMsg)
    {
        this.rejectMsg = rejectMsg;
    }

    public SetPrice getSetPrice()
    {
        return setPrice;
    }

    public void setSetPrice(SetPrice setPrice)
    {
        this.setPrice = setPrice;
    }

    public SetInitialValues getSetInitialValues()
    {
        return setInitialValues;
    }

    public void setSetInitialValues(SetInitialValues setInitialValues)
    {
        this.setInitialValues = setInitialValues;
    }

    public PumpGasUnit getPumpGasUnit()
    {
        return pumpGasUnit;
    }

    public void setPumpGasUnit(PumpGasUnit pumpGasUnit)
    {
        this.pumpGasUnit = pumpGasUnit;
    }

    public GasPumpedMsg getGasPumpedMsg()
    {
        return gasPumpedMsg;
    }

    public void setGasPumpedMsg(GasPumpedMsg gasPumpedMsg)
    {
        this.gasPumpedMsg = gasPumpedMsg;
    }

    public PrintReceipt getPrintReceipt()
    {
        return printReceipt;
    }

    public void setPrintReceipt(PrintReceipt printReceipt)
    {
        this.printReceipt = printReceipt;
    }

    public CancelMsg getCancelMsg()
    {
        return cancelMsg;
    }

    public void setCancelMsg(CancelMsg cancelMsg)
    {
        this.cancelMsg = cancelMsg;
    }

    public ReturnCash getReturnCash()
    {
        return returnCash;
    }

    public void setReturnCash(ReturnCash returnCash)
    {
        this.returnCash = returnCash;
    }

    public SetPayType getSetPayType()
    {
        return setPayType;
    }

    public void setSetPayType(SetPayType setPayType)
    {
        this.setPayType = setPayType;
    }

    public EjectCard getEjectCard()
    {
        return ejectCard;
    }

    public void setEjectCard(EjectCard ejectCard)
    {
        this.ejectCard = ejectCard;
    }
}
