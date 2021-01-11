package mobile_banking;

import java.util.Scanner;

public class Nagad extends Account_details{
    final double cashoutCharge = 9.9;
    private int accountNumber;
    int pin;
    int inpin;

    public Nagad(String name,int number,double balance, int pin){
        super(name,pin);
        this.pin = pin;
        this.accountNumber = number;
    }

    public Nagad(String name,int number){
        super(name);
        this.accountNumber=number;
    }

    public void cashInNagad(double amount) {
        if(amount<=30000)
        super.addMoney(amount);
        else
        System.out.println("Sorry.Cash in limit exceeded");
    }

    public void cash_OutN() {
        System.out.println("Enter pin");
        inpin = input.nextInt();
        if(inpin == this.pin)
        {
            cashOutNagad(cashoutCharge);
        }
    }

}
