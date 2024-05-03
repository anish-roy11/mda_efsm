Description of the Project:
There are two gas pump components: GP-1 and GP-2.
The gas pump GP-1 component supports the following operations:
Activate (int a) // the gas pump is activated where a is the price of the gas per liter
Start() //start the transaction
PayCredit() // pay for gas by a credit card
Reject() // credit card is rejected
Cancel() // cancel the transaction
Approved() // credit card is approved
PayCash(int c) // pay for gas by cash, where c represents prepaid cash
StartPump() // start pumping gas
Pump() // one liter of gas is disposed
StopPump() // stop pumping gas
The GasPump-2 component supports the following operations:
Activate (float a, float b, float c) // the gas pump is activated where a is the price of Regular gas, b is
//the price of Premium gas and c is the price of Diesel per Gallon
Start() //start the transaction
PayCash(int c) // pay for gas by cash, where c represents prepaid cash
Cancel() // cancel the transaction
Premium() // Premium gas is selected
Regular() // Regular gas is selected
Diesel() // Diesel gas is selected
StartPump() // start pumping gas
PumpGallon() // one Gallon of gas is disposed
Stop() // stop pumping gas
Receipt() // Receipt is requested
NoReceipt() // No receipt
Both gas pumps are state-based components and are used to control simple gas pumps. Users can pay by
cash or a credit card. The gas pump may dispose of different types of gasoline. The price of the gasoline
is provided when the gas pump is activated. The detailed behavior of gas pump components is specified
using EFSM. The EFSM of Figure 1 shows the detailed behavior of gas pump GP-1 and the EFSM of
Figure 2 shows the detailed behavior of gas pump GP-2. Notice that there are several differences
between gas pump components.
Aspects that vary between two gas pump components:
a. Types of gasoline disposed
b. Types of payment
c. Display menu(s)
d. Messages
e. Receipts
f. Operation names and signatures
g. Data types
h. etc.
The goal of this project is to design two GP components using the Model-Driven Architecture (MDA)
covered in the course. An executable meta-model referred to as MDA-EFSM of GP components should
capture the “generic behavior” of two GP components and should be de-coupled from data and
implementation details. Notice that in your design there should be ONLY one MDA-EFSM for two GP
components. The meta-model (MDA-EFSM) used in the Model-Driven architecture should be expressed
as an EFSM (Extended Finite State Machine) model. Notice that the EFSMs shown in Figure 1 and
Figure 2 are not acceptable as a meta-model (MDA-EFSM) for this model-driven architecture.