package com.example.test.p46_cs586;

import java.util.logging.Logger;

public class S5
{

    private static final Logger logger = Logger.getLogger(S5.class.getName());
    private OP op;
    private MDA_EFSM m;
    private AbstractFactory af;

    public S5(OP op1, MDA_EFSM m1, AbstractFactory af1)
    {

        op=op1;
        m=m1;
        af=af1;
    }

    public void stopPump(OP op, MDA_EFSM m)
    {
        System.out.print("\n Gas pumping stopped.\n");
        m.currentState="S6";
    }


    public void pump(OP op, MDA_EFSM m, State state)
    {
        //op.getDs().setL(op.getDs().getL()+1);

        //float amountCharged=0.0F;
        if(op.getDs().getW()==1)
        {
            System.out.print("log entry:credit card block");
            op.getPumpGasUnit().pumpGasUnit();
            op.getGasPumpedMsg().gasPumpedMsg();
            //stopPump(op,m);
            //op.getDs().setTotal(op.getDs().getTotal() + op.getDs().getPrice() * op.getDs().getL());
            op.getDs().setTotal(op.getDs().getTotal() + op.getDs().getPrice() * 1);
        }

        else
        {
            System.out.print("log entry:cash block");
            if(op.getDs().getCash() < (op.getDs().getTotal() + op.getDs().getPrice() * 1) )
            {

                //System.out.print("log entry:if(op.getDs().getCash() < op.getDs().getPrice() * (op.getDs().getL() +1 ) )");
                state.stopPump( m,op.getDs());
                m.receipt(m, op.getDs(),"INSF_BAL");

            }
            else
            {
                //System.out.print("log entry:else part of if(op.getDs().getCash() < op.getDs().getPrice() * (op.getDs().getL() +1 ) )");
                op.getDs().setL(op.getDs().getL() + 1);
                op.getPumpGasUnit().pumpGasUnit();
                op.getGasPumpedMsg().gasPumpedMsg();
                //stopPump(op,m);
                //op.getDs().setTotal(op.getDs().getTotal() + op.getDs().getPrice() * op.getDs().getL());
                op.getDs().setTotal(op.getDs().getTotal() + op.getDs().getPrice() * 1);

                //System.out.print("op.getDs().getTotal="+ op.getDs().getTotal());
            }
        }


        m.currentState="S5";
    }








    public void pumpGallon(OP op, MDA_EFSM m, State state, int gasTypeSelected, DS ds)
    {
        if(op.getDs().getW()==1)
        {
            op.getPumpGasUnit().pumpGasUnit();
            op.getGasPumpedMsg().gasPumpedMsg();

            if(gasTypeSelected==1)
            {
                op.getDs().setTotals(op.getDs().getTotals() + (op.getDs().getRprice() * 1));
            }
            else if(gasTypeSelected==2)
            {
                op.getDs().setTotals(op.getDs().getTotals() + (op.getDs().getDprice() * 1));

            }
            else if(gasTypeSelected==3)
            {
                op.getDs().setTotals(op.getDs().getTotals() + (op.getDs().getPprice() * 1));
            }
        }
        else
        {

                if (gasTypeSelected == 1)
                {

                    if (op.getDs().getCash() < (op.getDs().getTotals() + (op.getDs().getRprice() * 1)))
                    {
                        state.stop(m, op.getDs());
                        m.receipt(m, op.getDs(), "INSF_BAL");
                    }
                    else
                    {
                        op.getDs().setL(op.getDs().getL() + 1);
                        op.getPumpGasUnit().pumpGasUnit();
                        op.getGasPumpedMsg().gasPumpedMsg();
                        op.getDs().setTotals(op.getDs().getTotals() + (op.getDs().getRprice() * 1));
                    }

                }
                else if (gasTypeSelected == 2)
                {
                    if (op.getDs().getCash() < (op.getDs().getTotals() + op.getDs().getDprice() * 1))
                    {
                        state.stop(m, op.getDs());
                        m.receipt(m, op.getDs(), "INSF_BAL");

                    }
                    else
                    {
                        op.getDs().setL(op.getDs().getL() + 1);
                        op.getPumpGasUnit().pumpGasUnit();
                        op.getGasPumpedMsg().gasPumpedMsg();
                        op.getDs().setTotals(op.getDs().getTotals() + (op.getDs().getDprice() * 1));
                    }

                }

                else if (gasTypeSelected == 3)
                {
                    if (op.getDs().getCash() < (op.getDs().getTotals() + (op.getDs().getPprice() * 1)))
                    {
                        state.stop(m, op.getDs());
                        m.receipt(m, op.getDs(), "INSF_BAL");
                    }
                    else
                    {
                        op.getDs().setL(op.getDs().getL() + 1);
                        op.getPumpGasUnit().pumpGasUnit();
                        op.getGasPumpedMsg().gasPumpedMsg();

                        op.getDs().setTotals(op.getDs().getTotals() + (op.getDs().getPprice() * 1 ));
                    }
            }
        }
        m.currentState="S5";
    }



    public void stop(OP op, MDA_EFSM m)
    {
        System.out.print("\n Gas pumping stopped.\n");
        m.currentState="S6";
    }



}
