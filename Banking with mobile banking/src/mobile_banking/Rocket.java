package mobile_banking;

import java.util.Scanner;

public class Rocket extends Account_details{
    final double cashoutCharge = 17.5;
    private int accountNumber;
    int pin;
    int inpin;

    public Rocket(String name,int number,double balance, int pin){
        super(name,pin);
        this.pin = pin;
        this.accountNumber = number;
    }

    public Rocket(String name,int number){
        super(name);
        this.accountNumber=number;
    }

    public void cashInRocket(double amount) {
        if(amount<=50000)
        super.addMoney(amount);
        else
        System.out.println("Sorry.Cash in limit exceeded");
    }

    public void cash_OutR() {
        System.out.println("Enter pin");
        inpin = input.nextInt();
        if(inpin == this.pin)
        {
            cashOutRocket(cashoutCharge);
        }
    }

}
