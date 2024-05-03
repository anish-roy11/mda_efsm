package com.example.test.p46_cs586;

import java.util.Scanner;

/*
To run the program, import the folder  "p46_cs586" attached in blackboard in
"com.example.test package" in IDE such as Intellij Idea
and then run the  main function in TestDriver.java file

The following class/interface provides the design architecture of the program:
state pattern-GP1, GP2, MDA_EFSM, State, S0, S1, S2, S3, S4, S5, S6,DS,DS1,DS2
strategy pattern-StorePrices, StorePrices1,StorePrices2,PayMsg,PayMsg1,PayMsg2,StoreCash,StoreCash1,StoreCash2,
                 DisplayMenu,DisplayMenu1,DisplayMenu2,RejectMsg,RejectMsg1,RejectMsg2,
                 SetPrice, SetPrice1, SetPrice2,SetInitialValues,SetInitialValues1,SetInitialValues2,PumpGasUnit,PumpGasUnit1,PumpGasUnit2,
                 GasPumpedMsg,GasPumpedMsg1,GasPumpedMsg2,PrintReceipt,PrintReceipt1,PrintReceipt2,CancelMsg,CancelMsg1,CancelMsg2,
                 ReturnCash,ReturnCash1,ReturnCash2,SetPayType,SetPayType1,SetPayType2,EjectCard,EjectCard1,EjectCard2,
abstract factory pattern-AbstractFactory,OP,GP1Factory,GP2Factory

 */

public class TestDriver
{


    public static void main(String[] args)
    { // partial driver


        char gpSelection='1';
        Scanner sc2 = new Scanner(System.in);

        while (gpSelection !='q')
        {
            System.out.print("\n\n  Select Gas Pump: ");
            System.out.print("\n");
            System.out.print("1:    GP-1,    2:    GP-2,      q:    quit");
            System.out.print("\n");
            System.out.print("\n");
            gpSelection=sc2.next().charAt(0);

            if(gpSelection=='1')
            {
                GP1 gp1= new GP1();


                System.out.print("gpselection==1");
                System.out.print("                          GasPump-1");
                System.out.print("\n");
                System.out.print("                  MENU of Operations");
                System.out.print("\n");
                System.out.print("          0. Activate(int)");
                System.out.print("\n");
                System.out.print("          1. Start()");
                System.out.print("\n");
                System.out.print("          2. PayCredit");
                System.out.print("\n");
                System.out.print("          3. Reject()");
                System.out.print("\n");
                System.out.print("          4. Cancel()");
                System.out.print("\n");
                System.out.print("          5. Approved()");
                System.out.print("\n");
                System.out.print("          6. PayCash(int)");
                System.out.print("\n");
                System.out.print("          7. StartPump()");
                System.out.print("\n");
                System.out.print("          8. Pump()");
                System.out.print("\n");
                System.out.print("          9. StopPump()");
                System.out.print("\n");
                System.out.print("          q. Quit the program");
                System.out.print("\n");

                System.out.print("  Please make a note of these operations");
                System.out.print("\n");
                System.out.print("           GasPump-1 Execution");
                System.out.print("\n");
                char ch='1';
                Scanner sc = new Scanner(System.in);
                while (ch !='q')
                {
                    System.out.print("\n\n  Select Operation: ");
                    System.out.print("\n");
                    System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject, 4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-Pump, 9-StopPump, q-quit");
                    System.out.print("\n");
                    System.out.print("\n");
                    ch=sc.next().charAt(0);
                    //ch='0';
                    switch (ch)
                    {

                        case '0':
                        { //Activate()
                            System.out.print("  Operation:  Activate(int a)");
                            System.out.print("\n");
                            System.out.print("  Enter value of the parameter a:");
                            System.out.print("\n");
                            int price = sc.nextInt();
                            gp1.Activate(price);
                            break;
                        }

                        case '1':
                        { //Start
                            System.out.print("  Operation:  Start()");
                            System.out.print("\n");
                            gp1.Start();
                            break;
                        }

                        case '2':
                        { //PayCredit
                            System.out.print("  Operation:  PayCredit()");
                            System.out.print("\n");
                            gp1.PayCredit();
                            break;
                        }

                        case '3':
                        { //Reject
                            System.out.print("  Operation:  Reject()");
                            System.out.print("\n");
                            gp1.Reject();
                            break;
                        }

                        case '4':
                        { //Cancel
                            System.out.print("  Operation:  Cancel()");
                            System.out.print("\n");
                            gp1.Cancel();
                            break;
                        }

                        case '5':
                        { //Approved
                            System.out.print("  Operation:  Approved()");
                            System.out.print("\n");
                            gp1.Approved();
                            break;
                        }

                        case '6':
                        { //PayCash
                            System.out.print("  Operation:  PayCash(int c)");
                            System.out.print("\n");
                            System.out.print("  Enter value of the parameter c:");
                            System.out.print("\n");
                            int c =  sc.nextInt();
                            gp1.PayCash(c);
                            break;
                        }

                        case '7':
                        { //StartPump
                            System.out.print("  Operation:  StartPump()");
                            System.out.print("\n");
                            gp1.StartPump();
                            break;
                        }


                        case '8':
                        { //Pump
                            System.out.print("  Operation: Pump()");
                            System.out.print("\n");
                            gp1.Pump();
                            break;
                        }

                        case '9':
                        { //StopPump
                            System.out.print("  Operation:  StopPump()");
                            System.out.print("\n");
                            gp1.StopPump();
                            break;
                        }
                    }; // endswitch

                }; //endwhile
            }













            //for GP-2
            if(gpSelection=='2')
            {
                GP2 gp2=new GP2();
                System.out.print("gpselection==2");
                System.out.print("                          GasPump-2");
                System.out.print("\n");
                System.out.print("                  MENU of Operations");
                System.out.print("\n");
                System.out.print("          0. Activate (float a, float b, float c)");
                System.out.print("\n");
                System.out.print("          1. Start()");
                System.out.print("\n");
                System.out.print("          2. PayCash(int c)");
                System.out.print("\n");
                System.out.print("          3. Cancel()");
                System.out.print("\n");
                System.out.print("          4. Premium()");
                System.out.print("\n");
                System.out.print("          5. Regular()");
                System.out.print("\n");
                System.out.print("          6. Diesel()");
                System.out.print("\n");
                System.out.print("          7. StartPump()");
                System.out.print("\n");
                System.out.print("          8. PumpGallon()");
                System.out.print("\n");
                System.out.print("          9. Stop()");
                System.out.print("\n");
                System.out.print("          10. Receipt()");
                System.out.print("\n");
                System.out.print("          11. NoReceipt()");
                System.out.print("\n");
                System.out.print("          q. Quit");
                System.out.print("\n");

                System.out.print("  Please make a note of these operations");
                System.out.print("\n");
                System.out.print("           GasPump-2 Execution");
                System.out.print("\n");
                char ch='1';
                String gp2_choice="p";
                Scanner sc = new Scanner(System.in);
                //Scanner sc3 = new Scanner(System.in);
                //while (ch !='q')
                while(!(gp2_choice.equalsIgnoreCase("q")))
                {
                    System.out.print("\n\n  Select Operation: ");
                    System.out.print("\n");
                    System.out.print("0-Activate,1-Start,2-PayCash,3-Cancel, 4-Premium,5-Regular,6-Diesel,7-StartPump, 8-PumpGallon, 9-Stop, 10-Receipt, 11-NoReceipt, q-quit");
                    System.out.print("\n");
                    System.out.print("\n");
                    //ch=sc.next().charAt(0);
                    //ch=sc.next().charAt(0);
                    gp2_choice=sc.nextLine();
                            //String.valueOf(sc.next().charAt(0));
                    //ch='0';
//                    switch (gp2_choice)
//                    {

                        //case '0':
                        if(gp2_choice.equalsIgnoreCase("0"))
                        {
                            //Activate()
                            //Scanner scActivate = new Scanner(System.in);
                            Scanner scActivate = new Scanner(System.in);
                            System.out.print("  Operation:  Activate (float a, float b, float c)");
                            System.out.print("\n");
                            System.out.print("  Enter value of the parameter a:");
                            System.out.print("\n");
                            float rg = scActivate.nextFloat();
                            System.out.print("  Enter value of the parameter b:");
                            System.out.print("\n");
                            float pg = scActivate.nextFloat();
                            System.out.print("  Enter value of the parameter c:");
                            System.out.print("\n");
                            float d = scActivate.nextFloat();
                            gp2.Activate(rg,pg,d);
                            //break;
                        }

                        //case '1':
                            if(gp2_choice.equalsIgnoreCase("1"))
                        { //
                            System.out.print("  Operation:  Start()");
                            System.out.print("\n");
                            gp2.Start();
                            //break;
                        }

                        //case '2':
                        if(gp2_choice.equalsIgnoreCase("2"))
                        { //
                            System.out.print("  Operation:  PayCash()");
                            System.out.print("\n");
                            System.out.print("  Enter value of the parameter c:");
                            System.out.print("\n");
                            int cash =  sc.nextInt();
                            gp2.PayCash(cash);
                           // break;
                        }

                        //case '3':
                        if(gp2_choice.equalsIgnoreCase("3"))
                        { //Reject
                            System.out.print("  Operation:  Cancel()");
                            System.out.print("\n");
                            gp2.Cancel();
                            //break;
                        }

                        //case '4':
                        if(gp2_choice.equalsIgnoreCase("4"))
                        { //Cancel
                            System.out.print("  Operation:  Premium()");
                            System.out.print("\n");
                            gp2.Premium();
                           // break;
                        }

                        //case '5':
                        if(gp2_choice.equalsIgnoreCase("5"))
                        { //Approved
                            System.out.print("  Operation:  Regular()");
                            System.out.print("\n");
                            gp2.Regular();
                            //break;
                        }

                        //case '6':
                        if(gp2_choice.equalsIgnoreCase("6"))
                        { //PayCash
                            System.out.print("  Operation:  Diesel()");
                            System.out.print("\n");
                            gp2.Diesel();
                            //break;
                        }

                        //case '7':
                        if(gp2_choice.equalsIgnoreCase("7"))
                        { //StartPump
                            System.out.print("  Operation:  StartPump()");
                            System.out.print("\n");
                            gp2.StartPump();
                            //break;
                        }


                        //case '8':
                        if(gp2_choice.equalsIgnoreCase("8"))
                        { //Pump
                            System.out.print("  Operation: PumpGallon()");
                            System.out.print("\n");
                            gp2.PumpGallon();
                            //break;
                        }

                        //case '9':
                        if(gp2_choice.equalsIgnoreCase("9"))
                        { //StopPump
                            System.out.print("  Operation:  Stop()");
                            System.out.print("\n");
                            gp2.Stop();
                            //break;
                        }

                        //case '10':
                        if(gp2_choice.equalsIgnoreCase("10"))
                        { //StopPump
                            System.out.print("  Operation:  Receipt()");
                            System.out.print("\n");
                            gp2.Receipt();
                            //break;
                        }

                        //case '11':
                        if(gp2_choice.equalsIgnoreCase("11"))
                        { //StopPump
                            System.out.print("  Operation:  NoReceipt()");
                            System.out.print("\n");
                            gp2.NoReceipt();
                            //break;
                        }


                   // }; // endswitch

                }; //endwhile
            }
        }


    }
}
